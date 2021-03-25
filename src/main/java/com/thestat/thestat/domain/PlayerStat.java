package com.thestat.thestat.domain;

import javax.persistence.*;

@Entity
public class PlayerStat
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "player_stat_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "player_id")
    private Player player;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "match_id")
    private Match match;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tournament_id")
    private Tournament tournament;

    private int twoPointMade;

    private int threePointMade;

    private int freeThrowMade;

    private int assist;

    private int steal;

    private int block;

    private int rebound;

    private int totalPointMade;
}
