package com.thestat.thestat.repository.teammatch;

import com.thestat.thestat.domain.TeamMatch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamMatchRepository extends JpaRepository<TeamMatch, Long>, TeamMatchRepositoryCustom
{

}
