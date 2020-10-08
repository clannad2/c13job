package com.cebbank.liuxiaoming.c13.service.impl;

import com.cebbank.liuxiaoming.c13.bean.Film;
import com.cebbank.liuxiaoming.c13.dao.interfaceForDao.FilmDao;
import com.cebbank.liuxiaoming.c13.service.interfaceforservice.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FilmServiceImpl implements FilmService {
    @Autowired
    FilmDao filmDao;
    @Override
    public List<Film> getAllFilms() {
        return filmDao.getAll();
    }
}
