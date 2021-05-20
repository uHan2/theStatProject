package com.thestat.thestat.repository;

import com.querydsl.core.types.Predicate;
import com.thestat.thestat.domain.TeamMatch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import java.util.List;

public interface TeamMatchRepository extends JpaRepository<TeamMatch, Long>, QuerydslPredicateExecutor<TeamMatch>
{
    @Query("SELECT DISTINCT tm FROM TeamMatch tm JOIN FETCH tm.match m JOIN FETCH m.tournament")
    List<TeamMatch> findAll(Predicate search);
}
