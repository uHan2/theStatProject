package com.thestat.thestat.domain;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class Team
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "team_id")
    private Long id;

    private String name;

    private String captain;

    private String university;
}
