package com.thestat.thestat.repository;

import com.thestat.thestat.domain.Match;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatchRepository extends JpaRepository<Match, Long>
{
}
