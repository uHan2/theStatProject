package com.thestat.thestat.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PlayerStatSearch
{
    private Integer year;

    private String tournamentName;

    private String teamName;

    private String playerName;
}
