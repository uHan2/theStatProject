package com.thestat.thestat.repository;

import com.thestat.thestat.domain.TeamMatch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TeamMatchRepository extends JpaRepository<TeamMatch, Long>
{
    @Query("SELECT DISTINCT tm FROM TeamMatch tm JOIN tm.match m JOIN m.tournament")
    List<TeamMatch> findAllByMatch();
}
