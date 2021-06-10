package com.thestat.thestat.service;

import com.thestat.thestat.domain.Player;
import com.thestat.thestat.repository.PlayerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PlayerService
{
    private final PlayerRepository playerRepository;

    public List<Player> findPlayersByTeamId(Long teamId)
    {
        return playerRepository.findAllByTeamId(teamId);
    }
}
