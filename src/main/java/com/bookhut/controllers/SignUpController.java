package com.bookhut.controllers;


import com.bookhut.models.bindingModels.LoginModel;
import com.bookhut.service.UserService;
import com.bookhut.serviceImpl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/signup")
public class SignUpController extends HttpServlet {

    private UserService userService;

    public SignUpController() {
        this.userService = new UserServiceImpl();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/templates/signUp.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        LoginModel loginModel = null;
        String signUpText = req.getParameter("signup");
        if(signUpText != null) {
            String username = req.getParameter("username");
            String password = req.getParameter("password");
            loginModel = new LoginModel(username,password);
            this.userService.createUser(loginModel);
            resp.sendRedirect("/signin");
        }
    }
}
