package com.cebbank.liuxiaoming.c13.dao.interfaceForDao;

import com.cebbank.liuxiaoming.c13.bean.Film;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface FilmDao {
    public List<Film> getAll();
}
