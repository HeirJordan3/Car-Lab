package com.codedifferently.classes;

//
public class Car {

    String color;
    int milesDriven;


    public Car(String carColor, int miles) {
        color = carColor;
        milesDriven = miles;

    }
    public void startEngine() {
        System.out.println("Starting the car!");
        System.out.println("Vroom!");
    }

    public void drive(){
        String message = "Miles driven " + milesDriven;
        System.out.println(message);
    }

    public void startRadio(double stationNum, String stationName) {
        System.out.println("Turning on the radio to " + stationNum + ", " + stationName + "!");
        System.out.println("Enjoy!");
    }

    public static void main(String[] args) {



        // Invoke the constructor
        Car BMW = new Car("red", 24);


        // print the instance below
        BMW.startEngine();
        System.out.println(BMW.color);
        BMW.drive();
        BMW.startRadio(103.5, "Smooth Jazz");



    }
}
