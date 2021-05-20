package com.thestat.thestat.repository;

import com.querydsl.core.types.Predicate;
import com.thestat.thestat.domain.TeamStat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import java.util.List;

public interface TeamStatRepository extends JpaRepository<TeamStat, Long>, QuerydslPredicateExecutor<TeamStat>
{
    @Query("SELECT DISTINCT ts FROM TeamStat ts JOIN FETCH ts.team")
    List<TeamStat> findAll(Predicate search);
}
