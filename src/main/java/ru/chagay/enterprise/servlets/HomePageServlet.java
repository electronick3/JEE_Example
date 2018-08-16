package ru.chagay.enterprise.servlets;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Logger;

public class HomePageServlet extends HttpServlet {

    private static final Logger LOGGER = Logger.getLogger(HomePageServlet.class.getName());

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        LOGGER.info("service");
        super.service(req, res);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        LOGGER.info("doGet");
        req.setCharacterEncoding("UTF8");
        req.getRequestDispatcher("/index.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        LOGGER.info("doPost");
    }
}
