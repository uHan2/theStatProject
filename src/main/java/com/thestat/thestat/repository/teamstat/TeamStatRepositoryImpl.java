package com.thestat.thestat.repository.teamstat;

import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;
import com.thestat.thestat.domain.QTeamStat;
import com.thestat.thestat.domain.TeamStat;
import com.thestat.thestat.domain.TeamStatSearch;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

import java.util.List;

public class TeamStatRepositoryImpl extends QuerydslRepositorySupport implements TeamStatRepositoryCustom
{
    private final JPAQueryFactory jpaQueryFactory;
    private final QTeamStat teamStat = QTeamStat.teamStat;

    public TeamStatRepositoryImpl(JPAQueryFactory jpaQueryFactory)
    {
        super(TeamStat.class);
        this.jpaQueryFactory = jpaQueryFactory;
    }

    @Override
    public List<TeamStat> findAllTeamStatSearch(TeamStatSearch teamStatSearch)
    {
        return jpaQueryFactory.selectFrom(teamStat)
                .distinct()
                .innerJoin(teamStat.team)
                .fetchJoin()
                .innerJoin(teamStat.tournament)
                .where(teamNameEq(teamStatSearch.getTeamName()))
                .where(yearEq(teamStatSearch.getYear()))
                .where(tournamentNameEq(teamStatSearch.getTournamentName()))
                .fetch();
    }

    private BooleanExpression yearEq(Integer year)
    {
        return year == null ? null : teamStat.tournament.year.eq(year);
    }

    private BooleanExpression tournamentNameEq(String tournamentName)
    {
        return tournamentName == null ? null : teamStat.tournament.name.eq(tournamentName);
    }

    private BooleanExpression teamNameEq(String teamName)
    {
        return teamName == null ? null : teamStat.team.name.eq(teamName);
    }
}
