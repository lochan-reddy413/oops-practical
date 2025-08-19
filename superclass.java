package opps_practical;

import java.util.Scanner;
class Vehicle {
    int maxSpeed;
    Vehicle(int speed) {
        this.maxSpeed = speed;
    }
}
class Car extends Vehicle {
    int maxSpeed;
    Car(int vehicleSpeed, int carSpeed) {
        super(vehicleSpeed);
        this.maxSpeed = carSpeed;
    }

    void display() {
        System.out.println("Maximum Speed from Vehicle: " + super.maxSpeed);
        System.out.println("Maximum Speed from Car: " + this.maxSpeed);
    }
}
public class superclass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

   
        System.out.print("Enter Vehicle max speed: ");
        int vSpeed = sc.nextInt();

        System.out.print("Enter Car max speed: ");
        int cSpeed = sc.nextInt();

        Car small = new Car(vSpeed, cSpeed);
        small.display();

        sc.close();
    }
}