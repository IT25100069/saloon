package com.salon.model;

public class Service {
    private int serviceId;
    private String serviceName;
    private String category;
    private double price;
    private String duration;
    private String description;

    public Service() {
    }

    public Service(int serviceId, String serviceName, String category,
                   double price, String duration, String description) {
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.category = category;
        this.price = price;
        this.duration = duration;
        this.description = description;
    }

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return serviceId + "," + serviceName + "," + category + "," +
                price + "," + duration + "," + description;
    }
}