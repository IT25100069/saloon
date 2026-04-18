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

@WebServlet("/addService")
public class AddServiceServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ServiceFileHandler fileHandler = new ServiceFileHandler();
        List<Service> services = fileHandler.getAllServices();

        int newId = 1;
        if (!services.isEmpty()) {
            newId = services.get(services.size() - 1).getServiceId() + 1;
        }

        String serviceName = request.getParameter("serviceName");
        String category = request.getParameter("category");
        double price = Double.parseDouble(request.getParameter("price"));
        String duration = request.getParameter("duration");
        String description = request.getParameter("description");

        Service service = new Service(newId, serviceName, category, price, duration, description);
        fileHandler.addService(service);

        response.sendRedirect("viewServices");
    }
}