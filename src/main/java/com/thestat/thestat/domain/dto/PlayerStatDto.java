package com.thestat.thestat.domain.dto;

import com.querydsl.core.annotations.QueryProjection;
import lombok.Getter;

@Getter
public class PlayerStatDto
{
    private String playerName;

    private String teamName;

    private int gamesPlayed;

    private int totalPointMade;

    private int assist;

    private int rebound;

    private int steal;

    private int block;

    private double twoPointTry;

    private int twoPointMade;

    private double threePointTry;

    private int threePointMade;

    private double freeThrowTry;

    private int freeThrowMade;

    @QueryProjection
    public PlayerStatDto(String playerName, String teamName, int gamesPlayed, int totalPointMade, int assist, int rebound, int steal, int block, double twoPointTry, int twoPointMade, double threePointTry, int threePointMade, double freeThrowTry, int freeThrowMade)
    {
        this.playerName = playerName;
        this.teamName = teamName;
        this.gamesPlayed = gamesPlayed;
        this.totalPointMade = totalPointMade;
        this.assist = assist;
        this.rebound = rebound;
        this.steal = steal;
        this.block = block;
        this.twoPointTry = twoPointTry;
        this.twoPointMade = twoPointMade;
        this.threePointTry = threePointTry;
        this.threePointMade = threePointMade;
        this.freeThrowTry = freeThrowTry;
        this.freeThrowMade = freeThrowMade;
    }
}
