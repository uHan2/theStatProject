package com.thestat.thestat.domain;

import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.Predicate;

public class TeamMatchPredicate
{
    public static Predicate search(String teamName, String tournamentName, Integer year)
    {
        QTeamMatch teamMatch = QTeamMatch.teamMatch;

        BooleanBuilder builder = new BooleanBuilder();

        if (year != null)
        {
            builder.and(teamMatch.match.tournament.year.eq(year));
        }
        if (tournamentName != null)
        {
            builder.and(teamMatch.match.tournament.name.eq(tournamentName));
        }
        if (teamName != null)
        {
            builder.and(teamMatch.match.firstTeamName.like("%" + teamName + "%")).or(teamMatch.match.secondTeamName.like("%" + teamName + "%"));
        }

        return builder;
    }
}
