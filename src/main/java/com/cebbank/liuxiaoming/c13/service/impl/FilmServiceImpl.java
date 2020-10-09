package com.cebbank.liuxiaoming.c13.service.impl;

import com.cebbank.liuxiaoming.c13.bean.Film;
import com.cebbank.liuxiaoming.c13.dao.interfaceForDao.FilmDao;
import com.cebbank.liuxiaoming.c13.dao.interfaceForDao.UserDao;
import com.cebbank.liuxiaoming.c13.service.interfaceforservice.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class FilmServiceImpl implements FilmService {
    @Autowired
    FilmDao filmDao;
    @Autowired
    UserDao userDao;
    @Override
    public List<Film> getAllFilms() {
        return filmDao.getAll();
    }

    @Override
    public Film getFilmById(Integer id) {
        Film film = filmDao.getFilmById(id);
        return film;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Boolean buyTicket(Integer userId, Integer filmId,Integer nums) {
        int filmRows = filmDao.updateFilmStock(filmId, nums);
        Float filmPrice = filmDao.getFilmPriceById(filmId)*nums;
        Integer userRows = userDao.updateBalance(userId, filmPrice);

        if (filmRows !=0 && userRows !=0){
            return true;
        }

        return false;
    }

}
