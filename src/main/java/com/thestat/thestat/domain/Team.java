package com.thestat.thestat.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
public class Team
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "team_id")
    private Long id;

    private String name;

    private String captain;

    private String university;

    public Team(String name, String captain, String university)
    {
        this.name = name;
        this.captain = captain;
        this.university = university;
    }
}
