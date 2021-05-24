package com.thestat.thestat.service;

import com.thestat.thestat.domain.TeamMatchSearch;
import com.thestat.thestat.domain.dto.TeamMatchDto;
import com.thestat.thestat.repository.teammatch.TeamMatchRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TeamMatchService
{
    private final TeamMatchRepository teamMatchRepository;

    public List<TeamMatchDto> findTeamMatchSearch(TeamMatchSearch teamMatchSearch)
    {
        return teamMatchRepository.findAllTeamMatchSearch(teamMatchSearch);
    }
}
