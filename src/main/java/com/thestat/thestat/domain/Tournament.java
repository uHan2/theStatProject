package com.thestat.thestat.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
public class Tournament
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tournament_id")
    private Long id;

    private String name;

    private String hostUniversity;

    private int year;

    public Tournament(String name, String hostUniversity, int year)
    {
        this.name = name;
        this.hostUniversity = hostUniversity;
        this.year = year;
    }
}
