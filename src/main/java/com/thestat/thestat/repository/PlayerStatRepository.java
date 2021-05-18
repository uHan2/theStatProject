package com.thestat.thestat.repository;

import com.thestat.thestat.domain.PlayerStat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface PlayerStatRepository extends JpaRepository<PlayerStat, Long>, QuerydslPredicateExecutor<PlayerStat>
{

}
