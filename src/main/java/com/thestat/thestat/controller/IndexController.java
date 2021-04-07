package com.thestat.thestat.controller;

import com.thestat.thestat.domain.TeamStat;
import com.thestat.thestat.service.TeamStatService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class IndexController
{
    private final TeamStatService teamStatService;

    @GetMapping("/")
    public String root()
    {
        return "index";
    }

    @GetMapping("/about")
    public String about()
    {
        return "about";
    }

    @GetMapping("/basketball")
    public String basketball()
    {
        return "basketball";
    }

    @GetMapping("/contact")
    public String contact()
    {
        return "contact";
    }

    @GetMapping("/league-schedule")
    public String leagueSchedule()
    {
        return "league-schedule";
    }

    @GetMapping("/league-ranking-team")
    public String leagueRankingTeam(Model model)
    {
        List<TeamStat> list = teamStatService.findTeatStats();

        model.addAttribute("lists", list);
        model.addAttribute("listCount", list.size());

        return "league-ranking-team";
    }

    @GetMapping("/league-ranking-player")
    public String leagueRankingPlayer()
    {
        return "league-ranking-player";
    }

    @GetMapping("/404")
    public String error()
    {
        return "404";
    }
}
