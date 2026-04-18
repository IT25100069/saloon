package com.salon.dao;

import com.salon.model.Service;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ServiceFileHandler {

    private static final String FILE_NAME = "services.txt";

    public void addService(Service service) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true));
        writer.write(service.toString());
        writer.newLine();
        writer.close();
    }

    public List<Service> getAllServices() throws IOException {
        List<Service> services = new ArrayList<>();
        File file = new File(FILE_NAME);

        if (!file.exists()) {
            file.createNewFile();
        }

        BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME));
        String line;

        while ((line = reader.readLine()) != null) {
            String[] data = line.split(",", 6);
            if (data.length == 6) {
                Service service = new Service(
                        Integer.parseInt(data[0]),
                        data[1],
                        data[2],
                        Double.parseDouble(data[3]),
                        data[4],
                        data[5]
                );
                services.add(service);
            }
        }

        reader.close();
        return services;
    }

    public Service getServiceById(int serviceId) throws IOException {
        List<Service> services = getAllServices();
        for (Service service : services) {
            if (service.getServiceId() == serviceId) {
                return service;
            }
        }
        return null;
    }

    public void updateService(Service updatedService) throws IOException {
        List<Service> services = getAllServices();
        BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME));

        for (Service service : services) {
            if (service.getServiceId() == updatedService.getServiceId()) {
                writer.write(updatedService.toString());
            } else {
                writer.write(service.toString());
            }
            writer.newLine();
        }

        writer.close();
    }

    public void deleteService(int serviceId) throws IOException {
        List<Service> services = getAllServices();
        BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME));

        for (Service service : services) {
            if (service.getServiceId() != serviceId) {
                writer.write(service.toString());
                writer.newLine();
            }
        }

        writer.close();
    }
}