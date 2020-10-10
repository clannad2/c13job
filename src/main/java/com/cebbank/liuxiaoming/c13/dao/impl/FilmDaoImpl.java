package com.cebbank.liuxiaoming.c13.dao.impl;

import com.cebbank.liuxiaoming.c13.bean.Film;
import com.cebbank.liuxiaoming.c13.dao.BaseDao;
import com.cebbank.liuxiaoming.c13.dao.interfaceForDao.FilmDao;
import com.cebbank.liuxiaoming.c13.exception.StockException;
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
    public int updateFilmStock(Integer filmId, Integer nums) {
        Integer filmStock = getFilmStockByFilmId(filmId);
        if (filmStock<=nums){
            throw  new RuntimeException("库存不足");
        }else{
            String updateItem = "update filminfo set filmStock = filmStock-? where filmId = ?";
            int update = update(updateItem, nums, filmId);
            return update;
        }

    }

    @Override
    public Float getFilmPriceById(Integer filmId) {
        return getFilmById(filmId).getFilmPrice();
    }

    @Override
    public Integer getFilmStockByFilmId(Integer filmId) {
        return getFilmById(filmId).getFilmStock();
    }

    private Film getFilmByFilmId(Integer filmId){
        String queryItem = "select * from filminfo where filmId = ?";
        Film film = getObject(Film.class, queryItem, filmId);
        return film;
    }

}
