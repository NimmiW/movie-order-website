package com.movietime.order_service.model;

public class Order {
    private Long orderId;
    private Long movieId;
    private String customerName;

    public Order(){

    }

    public Order(Long orderId, Long movieId, String customerName) {
        this.orderId = orderId;
        this.movieId = movieId;
        this.customerName = customerName;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}
