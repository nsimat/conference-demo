package edu.nsimat.conferencedemo.repositories;

import edu.nsimat.conferencedemo.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session,Long> {
}
