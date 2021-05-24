package com.thestat.thestat.repository.teammatch;

import com.thestat.thestat.domain.TeamMatchSearch;
import com.thestat.thestat.domain.dto.TeamMatchDto;

import java.util.List;

public interface TeamMatchRepositoryCustom
{
    List<TeamMatchDto> findAllTeamMatchSearch(TeamMatchSearch teamMatchSearch);
}
