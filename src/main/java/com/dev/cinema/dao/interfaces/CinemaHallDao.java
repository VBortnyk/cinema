package com.dev.cinema.dao.interfaces;

import com.dev.cinema.model.CinemaHall;
import java.util.List;

public interface CinemaHallDao {

    CinemaHall create(CinemaHall cinemaHall);

    List<CinemaHall> getALl();
}
