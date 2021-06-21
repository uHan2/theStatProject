package com.thestat.thestat.repository;

import com.thestat.thestat.domain.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Long>
{
}
