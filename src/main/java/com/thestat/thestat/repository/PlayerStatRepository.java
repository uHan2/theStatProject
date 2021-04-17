package com.thestat.thestat.repository;

import com.thestat.thestat.domain.PlayerStat;
import com.thestat.thestat.domain.TeamStat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerStatRepository extends JpaRepository<PlayerStat, Long>
{

}
