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
        String queryAll = "select filmName,filmPrice,filmStock,filmType,filmRole from filminfo";
        List<Film> results = getList(Film.class,queryAll);
        return results;
    }
}
