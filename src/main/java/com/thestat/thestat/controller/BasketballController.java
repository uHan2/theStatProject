package com.thestat.thestat.controller;

import com.thestat.thestat.domain.PlayerStatSearch;
import com.thestat.thestat.domain.TeamMatchSearch;
import com.thestat.thestat.domain.TeamStat;
import com.thestat.thestat.domain.TeamStatSearch;
import com.thestat.thestat.domain.dto.PlayerStatDto;
import com.thestat.thestat.domain.dto.TeamMatchDto;
import com.thestat.thestat.service.PlayerStatService;
import com.thestat.thestat.service.TeamMatchService;
import com.thestat.thestat.service.TeamStatService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class BasketballController
{
    private final TeamStatService teamStatService;
    private final PlayerStatService playerStatService;
    private final TeamMatchService teamMatchService;

    @GetMapping("/basketball")
    public String basketball()
    {
        return "basketball";
    }

    @GetMapping("/basketball-league-schedule")
    public String leagueSchedule(@ModelAttribute("teamMatchSearch") TeamMatchSearch teamMatchSearch, Model model)
    {
        List<TeamMatchDto> list = teamMatchService.findTeamMatchSearch(teamMatchSearch);

        model.addAttribute("lists", list);

        return "basketball-league-schedule";
    }

    @GetMapping("/basketball-league-ranking-team")
    public String leagueRankingTeam(@ModelAttribute("teamStatSearch") TeamStatSearch teamStatSearch, Model model)
    {
        List<TeamStat> list = teamStatService.findTeamStatSearch(teamStatSearch);

        model.addAttribute("lists", list);

        return "basketball-league-ranking-team";
    }

    @GetMapping("/basketball-league-ranking-player")
    public String leagueRankingPlayer(@ModelAttribute("playerStatSearch") PlayerStatSearch playerStatSearch, Model model)
    {
        List<PlayerStatDto> list = playerStatService.findPlayerStatSearch(playerStatSearch);

        model.addAttribute("lists", list);

        return "basketball-league-ranking-player";
    }
}
