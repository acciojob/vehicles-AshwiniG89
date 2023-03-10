package com.driver;

public class Car extends Vehicle {
    private String name;
    private int wheels;
    private String type;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;
    private int seats;

//    public Car(String name,int currentSpeed,int currentDirection){
//        super(name, currentSpeed, currentDirection);
//        this.wheels=4;
//        this.doors= 4;
//        this.gears = 0;
//        this.isManual= false;
//        this.currentGear=0;
//        this.type=type;
//        this.seats=5;
//    }
    public Car(String name, int wheels, int doors, int gears, boolean isManual, String type, int seats) {
       super(name);
        //Hint: Car extends Vehicle
       // this.setName(name);
        this.wheels=wheels;
        this.doors= doors;
        this.gears = gears;
        this.isManual= isManual;
        this.currentGear=0;
        this.type=type;
        this.seats=seats;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public boolean isManual() {
        return isManual;
    }

    public void setManual(boolean manual) {
        isManual = manual;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }

//    public Car(String name, boolean isManual) {
//        super(name, isManual);
//        this.currentGear=0;
//    }

    public void changeGear(int newGear){
        currentGear =newGear;
        System.out.println("changeGear method called - The gear is changed to: " + currentGear);
    }

    public void changeSpeed(int newSpeed, int newDirection){

         move(newSpeed,newDirection);
        System.out.println("changeSpeed method called - The speed is changed to: " + newSpeed + ", and the direction is changed to: " + newDirection + " degrees");
    }
}
