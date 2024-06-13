package com.example.demo4.controller;

import com.example.demo4.model.ActeurDAO;
import com.example.demo4.model.entity.Acteur;

import java.util.List;

public class ActeurController {

        ActeurDAO acteurDao = new ActeurDAO();

        public List<Acteur> getActeurs() {
                List<Acteur> acteurs = acteurDao.getActeurs();
                return acteurs;
        }
}
