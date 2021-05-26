package com.thestat.thestat.repository.playerstat;

import com.querydsl.core.types.Projections;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;
import com.thestat.thestat.domain.PlayerStat;
import com.thestat.thestat.domain.PlayerStatSearch;
import com.thestat.thestat.domain.QPlayerStat;
import com.thestat.thestat.domain.dto.PlayerStatDto;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

import java.util.List;

public class PlayerStatRepositoryImpl extends QuerydslRepositorySupport implements PlayerStatRepositoryCustom
{
    private final JPAQueryFactory jpaQueryFactory;
    private final QPlayerStat playerStat = QPlayerStat.playerStat;

    public PlayerStatRepositoryImpl(JPAQueryFactory jpaQueryFactory)
    {
        super(PlayerStat.class);
        this.jpaQueryFactory = jpaQueryFactory;
    }

    @Override
    public List<PlayerStatDto> findAllPlayerStatSearch(PlayerStatSearch playerStatSearch)
    {
//        JPQLQuery<PlayerStat> query = from(playerStat);

//        if (playerStatSearch.getYear() != null)
//        {
//            query.where(playerStat.tournament.year.eq(playerStatSearch.getYear())).fetchJoin();
//        }
//        if (playerStatSearch.getTournamentName() != null)
//        {
//            query.where(playerStat.tournament.name.eq(playerStatSearch.getTournamentName())).fetchJoin();
//        }
//        if (playerStatSearch.getTeamName() != null)
//        {
//            query.where(playerStat.player.team.name.eq(playerStatSearch.getTeamName()));
//        }
//        if (playerStatSearch.getPlayerName() != null)
//        {
//            query.where(playerStat.player.name.like("%" + playerStatSearch.getPlayerName() + "%")).fetchJoin();
//        }

//        query.fetchJoin();

//        return query.fetch();
//        return query.fetchJoin().fetch();

//        return jpaQueryFactory.selectFrom(playerStat)
//                .distinct()
//                .innerJoin(playerStat.player)
//                .fetchJoin()
////                .innerJoin(playerStat.player.team)
//                .where(playerNameLike(playerStatSearch.getPlayerName()))
//                .where(teamNameEq(playerStatSearch.getTeamName()))
//                .innerJoin(playerStat.tournament)
//                .fetchJoin()
//                .where(yearEq(playerStatSearch.getYear()),
//        tournamentNameEq(playerStatSearch.getTournamentName()))
//                .fetch();

        return jpaQueryFactory.select(Projections.constructor(PlayerStatDto.class,
                playerStat.player.name, playerStat.player.team.name, playerStat.gamesPlayed, playerStat.totalPointMade,
                playerStat.assist, playerStat.rebound, playerStat.steal, playerStat.block,
                playerStat.twoPointTry, playerStat.twoPointMade, playerStat.threePointTry, playerStat.threePointMade,
                playerStat.freeThrowTry, playerStat.freeThrowMade))
                .distinct()
                .from(playerStat)
                .innerJoin(playerStat.player)
                .innerJoin(playerStat.player.team)
                .innerJoin(playerStat.tournament)
                .where(yearEq(playerStatSearch.getYear()))
                .where(tournamentNameEq(playerStatSearch.getTournamentName()))
                .where(teamNameEq(playerStatSearch.getTeamName()))
                .where(playerNameLike(playerStatSearch.getPlayerName()))
                .fetch();

    }

    private BooleanExpression yearEq(Integer year)
    {
        return year == null ? null : playerStat.tournament.year.eq(year);
    }

    private BooleanExpression tournamentNameEq(String tournamentName)
    {
        return tournamentName == null ? null : playerStat.tournament.name.eq(tournamentName);
    }

    private BooleanExpression teamNameEq(String teamName)
    {
        return teamName == null ? null : playerStat.player.team.name.like(teamName);
    }

    private BooleanExpression playerNameLike(String playerName)
    {
        return playerName == null ? null : playerStat.player.name.like("%" + playerName + "%");
    }
}


