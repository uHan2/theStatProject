package com.thestat.thestat.repository;

import com.thestat.thestat.domain.TeamStat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamStatRepository extends JpaRepository<TeamStat, Long>
{
}
