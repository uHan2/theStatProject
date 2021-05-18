package com.thestat.thestat.domain;

import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.Predicate;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PlayerStatPredicate
{
    public static Predicate search(String playerName, String teamName, String tournamentName, Integer year)
    {
        QPlayerStat playerStat = QPlayerStat.playerStat;

        BooleanBuilder builder = new BooleanBuilder();

        if (year != null)
        {
            builder.and(playerStat.tournament.year.eq(year));
        }
        if (tournamentName != null)
        {
            builder.and(playerStat.tournament.name.eq(tournamentName));
        }
        if (teamName != null)
        {
            builder.and(playerStat.player.team.name.eq(teamName));
        }
        if (playerName != null)
        {
            builder.and(playerStat.player.name.like("%" + playerName + "%"));
        }

        return builder;
    }

}
