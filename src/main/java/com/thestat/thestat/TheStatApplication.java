package com.thestat.thestat;

import com.thestat.thestat.domain.*;
import com.thestat.thestat.repository.MatchRepository;
import com.thestat.thestat.repository.PlayerRepository;
import com.thestat.thestat.repository.TeamRepository;
import com.thestat.thestat.repository.TournamentRepository;
import com.thestat.thestat.repository.playerstat.PlayerStatRepository;
import com.thestat.thestat.repository.teammatch.TeamMatchRepository;
import com.thestat.thestat.repository.teamstat.TeamStatRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class TheStatApplication implements ApplicationRunner
{
    private final PlayerRepository playerRepository;
    private final TeamRepository teamRepository;
    private final MatchRepository matchRepository;
    private final PlayerStatRepository playerStatRepository;
    private final TeamMatchRepository teamMatchRepository;
    private final TeamStatRepository teamStatRepository;
    private final TournamentRepository tournamentRepository;

    public static void main(String[] args)
    {
        SpringApplication.run(TheStatApplication.class, args);
    }


    @Override
    public void run(ApplicationArguments args) throws Exception
    {
        Team team1 = new Team("북산", "강백호", "북산대학교");
        Team team2 = new Team("고글", "박기성", "고글대학교");
        Team team3 = new Team("개구리", "케로로", "개굴대학교");
        Team team4 = new Team("소라", "유한", "껍질대학교");

        teamRepository.save(team1);
        teamRepository.save(team2);
        teamRepository.save(team3);
        teamRepository.save(team4);

        Player player1 = new Player("강백호", "C", team1);
        Player player2 = new Player("선수A", "G", team1);
        Player player3 = new Player("선수B", "F", team1);
        Player player4 = new Player("선수C", "G", team1);
        Player player5 = new Player("선수D", "F", team1);

        Player player6 = new Player("박기성", "G", team2);
        Player player7 = new Player("선수", "G", team2);
        Player player8 = new Player("선수", "F", team2);
        Player player9 = new Player("선수", "G", team2);
        Player player10 = new Player("선수", "F", team2);

        playerRepository.save(player1);
        playerRepository.save(player2);
        playerRepository.save(player3);
        playerRepository.save(player4);
        playerRepository.save(player5);
        playerRepository.save(player6);
        playerRepository.save(player7);
        playerRepository.save(player8);
        playerRepository.save(player9);
        playerRepository.save(player10);

        Tournament tournament1 = new Tournament("임시대회A", "아무대학교A", 2019);
        Tournament tournament2 = new Tournament("임시대회B", "아무대학교B", 2020);
        Tournament tournament3 = new Tournament("임시대회C", "아무대학교C", 2021);

        tournamentRepository.save(tournament1);
        tournamentRepository.save(tournament2);
        tournamentRepository.save(tournament3);

        Match match1 = new Match("소라", "개구리", 1, 2, "ing", null, tournament1);
        Match match2 = new Match("북산", "고글", 79, 81, "end", "고글", tournament1);

        matchRepository.save(match1);
        matchRepository.save(match2);

        java.sql.Date date1 = java.sql.Date.valueOf("2019-05-04");
        java.sql.Time time1 = java.sql.Time.valueOf("16:00:00");

        java.sql.Date date2 = java.sql.Date.valueOf("2019-05-12");
        java.sql.Time time2 = java.sql.Time.valueOf("14:00:00");

        TeamMatch teamMatch1 = new TeamMatch(team1, team2, match2, date1, time1, "서울체육관");
        TeamMatch teamMatch2 = new TeamMatch(team3, team4, match1, date2, time2, "울산체육관");

        teamMatchRepository.save(teamMatch1);
        teamMatchRepository.save(teamMatch2);

        PlayerStat playerStat1 = new PlayerStat(player1, match2, tournament1, 2, 11, 3, 11, 8, 11, 5, 2, 3, 3, 2, 21);
        PlayerStat playerStat2 = new PlayerStat(player2, match2, tournament1, 4, 20, 2, 7, 4, 6, 3, 2, 1, 4, 3, 15);
        PlayerStat playerStat3 = new PlayerStat(player3, match2, tournament1, 6, 10, 1, 6, 3, 5, 2, 3, 1, 2, 3, 16);
        PlayerStat playerStat4 = new PlayerStat(player4, match2, tournament1, 3, 15, 1, 5, 4, 8, 1, 1, 0, 1, 3, 18);
        PlayerStat playerStat5 = new PlayerStat(player5, match2, tournament1, 4, 14, 2, 5, 5, 7, 3, 4, 2, 4, 2, 20);
        PlayerStat playerStat6 = new PlayerStat(player6, match2, tournament1, 4, 13, 3, 7, 4, 6, 2, 5, 1, 5, 3, 22);
        PlayerStat playerStat7 = new PlayerStat(player7, match2, tournament1, 5, 12, 4, 9, 3, 5, 1, 2, 2, 3, 3, 30);
        PlayerStat playerStat8 = new PlayerStat(player8, match2, tournament1, 6, 9, 3, 10, 4, 4, 1, 1, 1, 2, 3, 14);
        PlayerStat playerStat9 = new PlayerStat(player9, match2, tournament1, 7, 10, 4, 6, 5, 7, 0, 3, 1, 1, 3, 21);
        PlayerStat playerStat10 = new PlayerStat(player10, match2, tournament1, 8, 20, 3, 7, 2, 3, 2, 2, 1, 1, 3, 22);

        playerStatRepository.save(playerStat1);
        playerStatRepository.save(playerStat2);
        playerStatRepository.save(playerStat3);
        playerStatRepository.save(playerStat4);
        playerStatRepository.save(playerStat5);
        playerStatRepository.save(playerStat6);
        playerStatRepository.save(playerStat7);
        playerStatRepository.save(playerStat8);
        playerStatRepository.save(playerStat9);
        playerStatRepository.save(playerStat10);

        TeamStat teamStat1 = new TeamStat(team1, match2, tournament1, 30, 40, 20, 40, 50, 60, 9, 10, 13, 14, 2, 1, 3, 79);
        TeamStat teamStat2 = new TeamStat(team2, match2, tournament1, 34, 47, 23, 37, 47, 58, 13, 12, 7, 17, 1, 2, 3, 81);

        teamStatRepository.save(teamStat1);
        teamStatRepository.save(teamStat2);
    }
}
