package com.thestat.thestat.service;

import com.thestat.thestat.domain.TeamStat;
import com.thestat.thestat.domain.TeamStatSearch;
import com.thestat.thestat.repository.teamstat.TeamStatRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TeamStatService
{
    private final TeamStatRepository teamStatRepository;

    public List<TeamStat> findTeamStatSearch(TeamStatSearch teamStatSearch)
    {
        return teamStatRepository.findAllTeamStatSearch(teamStatSearch);
    }

}
