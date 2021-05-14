package com.thestat.thestat.service;

import com.thestat.thestat.domain.TeamMatch;
import com.thestat.thestat.repository.TeamMatchRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TeamMatchService
{
    private final TeamMatchRepository teamMatchRepository;

    public List<TeamMatch> findTeamMatches()
    {
        return teamMatchRepository.findAllByMatch();
    }
}
