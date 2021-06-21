package com.thestat.thestat.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
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

    public TeamStat(Team team, Match match, Tournament tournament, int twoPointMade, double twoPointTry, int threePointMade, double threePointTry, int freeThrowMade, double freeThrowTry, int assist, int steal, int block, int rebound, int win, int lose, int gamesPlayed, int totalPointMade)
    {
        this.team = team;
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
        this.win = win;
        this.lose = lose;
        this.gamesPlayed = gamesPlayed;
        this.totalPointMade = totalPointMade;
    }
}
