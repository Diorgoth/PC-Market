package com.example.demo.constrains;

public enum OrderStatus {

    Cancelled("  Bekor qilindi"),
    Delivered("Yetkazildi"),
    Problem("  Muammo"),
    Processing("  Qayta ishlash"),
    Returned(" Qaytarildi");

    private final String description;

    OrderStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}
