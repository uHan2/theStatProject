package com.thestat.thestat.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
public class Match
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "match_id")
    private Long id;

    private String firstTeamName;

    private String secondTeamName;

    private int firstTeamScore;

    private int secondTeamScore;

    //toDo :: consider enum type
    private String status;

    private String winTeam;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tournament_id")
    private Tournament tournament;

    public Match(String firstTeamName, String secondTeamName, int firstTeamScore, int secondTeamScore, String status, String winTeam, Tournament tournament)
    {
        this.firstTeamName = firstTeamName;
        this.secondTeamName = secondTeamName;
        this.firstTeamScore = firstTeamScore;
        this.secondTeamScore = secondTeamScore;
        this.status = status;
        this.winTeam = winTeam;
        this.tournament = tournament;
    }
}
