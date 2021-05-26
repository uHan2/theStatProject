package com.thestat.thestat.domain;

import lombok.Getter;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

@Entity
@Getter
public class TeamMatch
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "team_match_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "team_id")
    private Team team;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "match_id")
    private Match match;

    private Date date;

    private Time time;

    private String place;
}
