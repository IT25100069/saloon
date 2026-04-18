package com.salon.servlet;

import com.salon.dao.ServiceFileHandler;
import com.salon.model.Service;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/updateService")
public class UpdateServiceServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int serviceId = Integer.parseInt(request.getParameter("serviceId").trim());
        String serviceName = request.getParameter("serviceName").trim();
        String category = request.getParameter("category").trim();
        double price = Double.parseDouble(request.getParameter("price").trim());
        String duration = request.getParameter("duration").trim();
        String description = request.getParameter("description").trim();

        Service updatedService = new Service(
                serviceId,
                serviceName,
                category,
                price,
                duration,
                description
        );

        ServiceFileHandler fileHandler = new ServiceFileHandler();
        fileHandler.updateService(updatedService);

        response.sendRedirect("viewServices");
    }
}