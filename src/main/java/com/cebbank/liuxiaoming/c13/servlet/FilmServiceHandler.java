package com.cebbank.liuxiaoming.c13.servlet;

import com.cebbank.liuxiaoming.c13.bean.Film;
import com.cebbank.liuxiaoming.c13.bean.User;
import com.cebbank.liuxiaoming.c13.service.impl.FilmServiceImpl;
import com.cebbank.liuxiaoming.c13.service.interfaceforservice.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    @RequestMapping("/toticketdetail")
    public String toticketdetail(@RequestParam("filmId") Integer id,Map<String,Object> map){
        User user = (User) map.get("user");
        System.out.println(user);
        Film film = filmService.getFilmById(id);
        map.put("film",film);
        return "buyticket";
    }

    @RequestMapping("/buyticket")
    public String buyticket(@RequestParam(value = "filmId") Integer filmId
            ,@RequestParam(value = "userId") Integer userId,
            @RequestParam("filmNums") Integer filmNums){
        Boolean flag = filmService.buyTicket(userId, filmId, filmNums);
        if (flag) {
            System.out.println("购票成功");
            return "buyticket_success";
        }

        return "register_error";
    }
}
