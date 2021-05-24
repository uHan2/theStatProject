package com.thestat.thestat.service;

import com.thestat.thestat.domain.PlayerStatSearch;
import com.thestat.thestat.domain.dto.PlayerStatDto;
import com.thestat.thestat.repository.playerstat.PlayerStatRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PlayerStatService
{
    private final PlayerStatRepository playerStatRepository;

    public List<PlayerStatDto> findPlayerStatSearch(PlayerStatSearch playerStatSearch)
    {
        return playerStatRepository.findAllPlayerStatSearch(playerStatSearch);
    }
}
