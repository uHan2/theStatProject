package com.thestat.thestat.domain;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
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
}
