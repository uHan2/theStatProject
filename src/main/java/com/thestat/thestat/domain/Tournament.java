package com.thestat.thestat.domain;

import lombok.Getter;

import javax.persistence.*;
import java.time.Year;

@Entity
@Getter
public class Tournament
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tournament_id")
    private Long id;

    private String name;

    private String hostUniversity;

    private Year year;
}
