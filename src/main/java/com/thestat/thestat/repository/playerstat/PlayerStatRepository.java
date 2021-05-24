package com.thestat.thestat.repository.playerstat;

import com.thestat.thestat.domain.PlayerStat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerStatRepository extends JpaRepository<PlayerStat, Long>, PlayerStatRepositoryCustom
{

}
