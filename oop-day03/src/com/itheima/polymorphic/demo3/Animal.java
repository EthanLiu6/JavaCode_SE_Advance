package com.itheima.polymorphic.demo3;

public abstract class Animal {
    private String breed;
    private String color;

    public Animal() {
    }

    public Animal(String breed, String color) {
        this.breed = breed;
        this.color = color;
        System.out.println("breed: " + breed + '\n' +"color: " + color);
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void eat();
}