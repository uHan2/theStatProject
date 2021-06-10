package com.thestat.thestat.controller;

import com.thestat.thestat.domain.Player;
import com.thestat.thestat.service.PlayerService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class TestController
{
    private final PlayerService playerService;

    @GetMapping("/api/v1/{teamId}/player")
    public Result membersV2(@PathVariable Long teamId)
    {
        List<Player> findPlayers = playerService.findPlayersByTeamId(teamId);
        List<PlayerDto> collect = findPlayers.stream()
                .map(p -> new PlayerDto(p.getTeam().getId(), p.getTeam().getName(), p.getId(), p.getName()))
                .collect(Collectors.toList());

        return new Result(collect);
    }

    @Getter
    @AllArgsConstructor
    static class Result<T>
    {
        private final T data;
    }

    @Getter
    @Setter
    @AllArgsConstructor
    static class PlayerDto
    {
        private Long teamId;

        private String teamName;

        private Long playerId;

        private String playerName;
    }
}
