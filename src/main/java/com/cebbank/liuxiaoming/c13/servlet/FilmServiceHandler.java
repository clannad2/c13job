package com.cebbank.liuxiaoming.c13.servlet;

import com.cebbank.liuxiaoming.c13.service.interfaceforservice.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class FilmServiceHandler {
    @Autowired
    FilmService filmService;

    @ModelAttribute
    public void getFilms(Map<String,Object> map){
//        List<Film> films;
//        map.put("films",films);

    }

    @RequestMapping("/loadingfilm")
    public String loadingfilm(Map<String,Object> map){
        System.out.println(filmService.getAllFilms());
        map.put("films",filmService.getAllFilms());
        return "filmsystem";
    }
}
