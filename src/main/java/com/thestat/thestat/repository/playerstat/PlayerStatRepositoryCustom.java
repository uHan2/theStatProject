package com.thestat.thestat.repository.playerstat;

import com.thestat.thestat.domain.PlayerStatSearch;
import com.thestat.thestat.domain.dto.PlayerStatDto;

import java.util.List;

public interface PlayerStatRepositoryCustom
{
    List<PlayerStatDto> findAllPlayerStatSearch(PlayerStatSearch playerStatSearch);
}
