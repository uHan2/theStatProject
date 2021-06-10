package com.thestat.thestat.repository;

import com.thestat.thestat.domain.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PlayerRepository extends JpaRepository<Player, Long>
{
    @Query("SELECT DISTINCT p FROM Player p JOIN FETCH p.team")
    List<Player> findAllByTeamId(Long teamId);
}
