package com.cebbank.liuxiaoming.c13.service.interfaceforservice;

import com.cebbank.liuxiaoming.c13.bean.Film;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FilmService {
    public List<Film> getAllFilms();

}
