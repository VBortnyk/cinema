package com.dev.cinema.dao.interfaces;

import com.dev.cinema.model.MovieSession;
import java.time.LocalDate;
import java.util.List;

public interface MovieSessionDao {

    MovieSession create(MovieSession session);

    List<MovieSession> findAvailableSessions(Long movieId, LocalDate date);
}
