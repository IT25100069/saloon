package com.salon.servlet;

import com.salon.dao.ServiceFileHandler;
import com.salon.model.Service;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/viewServices")
public class ViewServiceServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ServiceFileHandler fileHandler = new ServiceFileHandler();
        List<Service> services = fileHandler.getAllServices();

        request.setAttribute("services", services);
        request.getRequestDispatcher("/jsp/viewServices.jsp").forward(request, response);
    }
}