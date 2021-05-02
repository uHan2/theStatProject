package com.thestat.thestat.domain;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class TeamStat
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "team_stat_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "team_id")
    private Team team;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "match_id")
    private Match match;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tournament_id")
    private Tournament tournament;

    private int twoPointMade;

    private double twoPointTry;

    private int threePointMade;

    private double threePointTry;

    private int freeThrowMade;

    private double freeThrowTry;

    private int assist;

    private int steal;

    private int block;

    private int rebound;

    private int win;

    private int lose;

    private int gamesPlayed;

    private int totalPointMade;
}
