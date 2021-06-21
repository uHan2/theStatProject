package com.thestat.thestat.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

@Entity
@Getter
@NoArgsConstructor
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
    @JoinColumn(name = "team_id2")
    private Team team2;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "match_id")
    private Match match;

    private Date date;

    private Time time;

    private String place;

    public TeamMatch(Team team, Team team2, Match match, Date date, Time time, String place)
    {
        this.team = team;
        this.team2 = team2;
        this.match = match;
        this.date = date;
        this.time = time;
        this.place = place;
    }
}
