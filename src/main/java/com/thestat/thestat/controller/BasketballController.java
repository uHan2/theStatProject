package com.thestat.thestat.controller;

import com.thestat.thestat.domain.PlayerStat;
import com.thestat.thestat.domain.TeamStat;
import com.thestat.thestat.service.PlayerStatService;
import com.thestat.thestat.service.TeamStatService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class BasketballController
{
    private final TeamStatService teamStatService;
    private final PlayerStatService playerStatService;

    @GetMapping("/basketball")
    public String basketball()
    {
        return "basketball";
    }

    @GetMapping("/basketball-league-schedule")
    public String leagueSchedule()
    {
        return "basketball-league-schedule";
    }

    @GetMapping("/basketball-league-ranking-team")
    public String leagueRankingTeam(Model model)
    {
        List<TeamStat> list = teamStatService.findTeatStats();

        model.addAttribute("lists", list);
        model.addAttribute("listCount", list.size());

        return "basketball-league-ranking-team";
    }

    @GetMapping("/basketball-league-ranking-player")
    public String leagueRankingPlayer(Model model)
    {
        List<PlayerStat> list = playerStatService.findPlayerStats();


        model.addAttribute("lists", list);
        model.addAttribute("listCount", list.size());


        return "basketball-league-ranking-player";
    }
}
