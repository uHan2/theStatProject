package com.thestat.thestat.repository;

import com.thestat.thestat.domain.TeamStat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface TeamStatRepository extends JpaRepository<TeamStat, Long>, QuerydslPredicateExecutor<TeamStat>
{
}
