package com.example.common.response;

import java.time.LocalDateTime;

public class ApiResponse<T> {
    private T data;
    private String message;
    private LocalDateTime timestamp;
    private String serviceName;

    public ApiResponse(T data, String message, String serviceName) {
        this.data = data;
        this.message = message;
        this.timestamp = LocalDateTime.now();
        this.serviceName = serviceName;
    }

    // Getters and setters
    public T getData() { return data; }
    public void setData(T data) { this.data = data; }
    
    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }
    
    public LocalDateTime getTimestamp() { return timestamp; }
    public void setTimestamp(LocalDateTime timestamp) { this.timestamp = timestamp; }
    
    public String getServiceName() { return serviceName; }
    public void setServiceName(String serviceName) { this.serviceName = serviceName; }
}