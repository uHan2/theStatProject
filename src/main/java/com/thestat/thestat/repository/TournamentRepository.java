package com.thestat.thestat.repository;

import com.thestat.thestat.domain.Tournament;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TournamentRepository extends JpaRepository<Tournament, Long>
{
}
