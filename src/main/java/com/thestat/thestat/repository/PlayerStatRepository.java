package com.thestat.thestat.repository;

import com.querydsl.core.types.Predicate;
import com.thestat.thestat.domain.PlayerStat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import java.util.List;

public interface PlayerStatRepository extends JpaRepository<PlayerStat, Long>, QuerydslPredicateExecutor<PlayerStat>
{
    @Query("SELECT DISTINCT ps FROM PlayerStat ps JOIN FETCH ps.player p JOIN FETCH p.team")
    List<PlayerStat> findAll(Predicate search);
}
