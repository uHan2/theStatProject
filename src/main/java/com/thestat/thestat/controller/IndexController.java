package com.thestat.thestat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController
{
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
    public String leagueRankingTeam()
    {
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
