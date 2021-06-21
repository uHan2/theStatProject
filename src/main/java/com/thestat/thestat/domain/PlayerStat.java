package com.thestat.thestat.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
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

    private double twoPointTry;

    private int threePointMade;

    private double threePointTry;

    private int freeThrowMade;

    private double freeThrowTry;

    private int assist;

    private int steal;

    private int block;

    private int rebound;

    private int gamesPlayed;

    private int totalPointMade;

    public PlayerStat(Player player, Match match, Tournament tournament, int twoPointMade, double twoPointTry, int threePointMade, double threePointTry, int freeThrowMade, double freeThrowTry, int assist, int steal, int block, int rebound, int gamesPlayed, int totalPointMade)
    {
        this.player = player;
        this.match = match;
        this.tournament = tournament;
        this.twoPointMade = twoPointMade;
        this.twoPointTry = twoPointTry;
        this.threePointMade = threePointMade;
        this.threePointTry = threePointTry;
        this.freeThrowMade = freeThrowMade;
        this.freeThrowTry = freeThrowTry;
        this.assist = assist;
        this.steal = steal;
        this.block = block;
        this.rebound = rebound;
        this.gamesPlayed = gamesPlayed;
        this.totalPointMade = totalPointMade;
    }
}
