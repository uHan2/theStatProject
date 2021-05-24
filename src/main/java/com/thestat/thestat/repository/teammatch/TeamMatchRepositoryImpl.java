package com.thestat.thestat.repository.teammatch;

import com.querydsl.core.types.Projections;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;
import com.thestat.thestat.domain.QTeamMatch;
import com.thestat.thestat.domain.TeamMatch;
import com.thestat.thestat.domain.TeamMatchSearch;
import com.thestat.thestat.domain.dto.TeamMatchDto;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

import java.util.List;

public class TeamMatchRepositoryImpl extends QuerydslRepositorySupport implements TeamMatchRepositoryCustom
{
    private final JPAQueryFactory jpaQueryFactory;
    private final QTeamMatch teamMatch = QTeamMatch.teamMatch;

    public TeamMatchRepositoryImpl(JPAQueryFactory jpaQueryFactory)
    {
        super(TeamMatch.class);
        this.jpaQueryFactory = jpaQueryFactory;
    }

    @Override
    public List<TeamMatchDto> findAllTeamMatchSearch(TeamMatchSearch teamMatchSearch)
    {
        return jpaQueryFactory.select(Projections.constructor(TeamMatchDto.class,
                teamMatch.match.tournament.name, teamMatch.date, teamMatch.time, teamMatch.match.firstTeamName,
                teamMatch.match.firstTeamScore, teamMatch.match.secondTeamScore, teamMatch.match.secondTeamName,
                teamMatch.match.status, teamMatch.match.winTeam))
                .distinct()
                .from(teamMatch)
                .innerJoin(teamMatch.match)
                .innerJoin(teamMatch.match.tournament)
                .where(teamNameEq(teamMatchSearch.getTeamName()))
                .where(yearEq(teamMatchSearch.getYear()))
                .where(tournamentNameEq(teamMatchSearch.getTournamentName()))
                .fetch();
    }

    private BooleanExpression yearEq(Integer year)
    {
        return year == null ? null : teamMatch.match.tournament.year.eq(year);
    }

    private BooleanExpression tournamentNameEq(String tournamentName)
    {
        return tournamentName == null ? null : teamMatch.match.tournament.name.eq(tournamentName);
    }

    private BooleanExpression teamNameEq(String teamName)
    {
        return teamName == null ? null : teamMatch.match.firstTeamName.like("%" + teamName + "%").or(teamMatch.match.secondTeamName.like("%" + teamName + "%"));
    }
}
