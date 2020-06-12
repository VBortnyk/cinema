package com.dev.cinema.service.impl;

import com.dev.cinema.dao.CinemaHallDao;
import com.dev.cinema.model.CinemaHall;
import com.dev.cinema.service.CinemaHallService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CinemaHallServiceImpl implements CinemaHallService {

    @Autowired
    private CinemaHallDao cinemaHallDao;

    @Override
    public CinemaHall create(CinemaHall cinemaHall) {
        return cinemaHallDao.create(cinemaHall);
    }

    @Override
    public CinemaHall getById(Long hallId) {
        return cinemaHallDao.getById(hallId);
    }

    @Override
    public List<CinemaHall> getAll() {
        return cinemaHallDao.getALl();
    }
}
