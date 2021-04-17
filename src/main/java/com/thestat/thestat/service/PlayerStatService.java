package com.thestat.thestat.service;

import com.thestat.thestat.domain.PlayerStat;
import com.thestat.thestat.repository.PlayerStatRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PlayerStatService
{
    private final PlayerStatRepository playerStatRepository;

    public List<PlayerStat> finePlayerStats()
    {
        return playerStatRepository.findAll();
    }

}
