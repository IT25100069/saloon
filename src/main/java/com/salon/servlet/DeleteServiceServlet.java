package com.salon.servlet;

import com.salon.dao.ServiceFileHandler;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/deleteService")
public class DeleteServiceServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int serviceId = Integer.parseInt(request.getParameter("id"));

        ServiceFileHandler fileHandler = new ServiceFileHandler();
        fileHandler.deleteService(serviceId);

        response.sendRedirect("viewServices");
    }
}