package com.thestat.thestat.repository.teamstat;

import com.thestat.thestat.domain.TeamStat;
import com.thestat.thestat.domain.TeamStatSearch;

import java.util.List;

public interface TeamStatRepositoryCustom
{
    List<TeamStat> findAllTeamStatSearch(TeamStatSearch teamStatSearch);
}
