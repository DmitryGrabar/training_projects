package com.epam.grabar.entity;

import java.io.Serializable;

public class Room implements Serializable {

    private int number;
    private int capacity;
    private int price;
    private boolean free;

    public Room() {

    }

    public Room(int number, int capacity, int price, boolean isFree) {
        this.number = number;
        this.capacity = capacity;
        this.price = price;
        this.free = isFree;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isFree() {
        return free;
    }

    public void setFree(boolean free) {
        this.free = free;
    }
}

