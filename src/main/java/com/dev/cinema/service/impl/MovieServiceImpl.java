package com.dev.cinema.service.impl;

import com.dev.cinema.dao.interfaces.MovieDao;
import com.dev.cinema.lib.Inject;
import com.dev.cinema.lib.Service;
import com.dev.cinema.model.Movie;
import com.dev.cinema.service.interfaces.MovieService;
import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {
    @Inject
    private MovieDao movieDao;

    @Override
    public Movie add(Movie movie) {
        return movieDao.add(movie);
    }

    @Override
    public List<Movie> getALl() {
        return movieDao.getALl();
    }
}