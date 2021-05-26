package com.thestat.thestat.domain.dto;

import com.querydsl.core.annotations.QueryProjection;
import lombok.Getter;

import java.sql.Date;
import java.sql.Time;

@Getter
public class TeamMatchDto
{
    private String tournamentName;

    private Date date;

    private Time time;

    private String place;

    private String firstTeamName;

    private int firstTeamScore;

    private int secondTeamScore;

    private String secondTeamName;

    private String status;

    private String winTeam;

    @QueryProjection

    public TeamMatchDto(String tournamentName, Date date, Time time, String place, String firstTeamName, int firstTeamScore, int secondTeamScore, String secondTeamName, String status, String winTeam)
    {
        this.tournamentName = tournamentName;
        this.date = date;
        this.time = time;
        this.place = place;
        this.firstTeamName = firstTeamName;
        this.firstTeamScore = firstTeamScore;
        this.secondTeamScore = secondTeamScore;
        this.secondTeamName = secondTeamName;
        this.status = status;
        this.winTeam = winTeam;
    }
}
