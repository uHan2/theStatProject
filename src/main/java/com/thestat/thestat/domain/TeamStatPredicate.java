package com.thestat.thestat.domain;

import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.Predicate;

public class TeamStatPredicate
{
    public static Predicate search(String teamName, String tournamentName, Integer year)
    {
        QTeamStat teamStat = QTeamStat.teamStat;

        BooleanBuilder builder = new BooleanBuilder();

        if (year != null)
        {
            builder.and(teamStat.tournament.year.eq(year));
        }
        if (tournamentName != null)
        {
            builder.and(teamStat.tournament.name.eq(tournamentName));
        }
        if (teamName != null)
        {
            builder.and(teamStat.team.name.like("%" + teamName + "%"));
        }

        return builder;
    }
}
