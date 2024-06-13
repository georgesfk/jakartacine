package com.example.demo4;

import com.example.demo4.controller.ActeurController;
import com.example.demo4.model.entity.Acteur;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "HomePage",value="/HomePage")
public class HomePage extends HttpServlet {
        public void doGet(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {

            ActeurController ac = new ActeurController();
            List<Acteur> acteurs = ac.getActeurs();
            request.setAttribute("acteurs",acteurs);
            RequestDispatcher dispatch = request.getRequestDispatcher("/listeacteurs.jsp");
            dispatch.forward (request, response);


        }
    }



