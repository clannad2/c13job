package com.cebbank.liuxiaoming.c13.dao.impl;

import com.cebbank.liuxiaoming.c13.bean.Film;
import com.cebbank.liuxiaoming.c13.dao.BaseDao;
import com.cebbank.liuxiaoming.c13.dao.interfaceForDao.FilmDao;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class FilmDaoImpl extends BaseDao implements FilmDao {
    @Override
    public List<Film> getAll() {
        String queryAll = "select * from filminfo";
        List<Film> results = getList(Film.class,queryAll);
        return results;
    }

    @Override
    public Film getFilmById(Integer id) {
        String queryItem = "select * from filminfo where filmId = ?";
        Film film = getObject(Film.class, queryItem, id);
        return film;
    }

    @Override
    public int updateFilmStock(Integer filmId, Integer num) {
        String updateItem = "update filminfo set filmStock = filmStock-? where filmId = ?";
        int update = update(updateItem, num, filmId);
        return update;
    }

    @Override
    public Float getFilmPriceById(Integer id) {
        String queryItem = "select filmPrice from filminfo where filmId = ?";
        Float filmPrice = getObject(Float.class, queryItem, id);
        return filmPrice;
    }

}
