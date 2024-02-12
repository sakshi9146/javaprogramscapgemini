package com.edu;
import java.util.Scanner;

abstract class Elevator {
    Scanner scanner = new Scanner(System.in);
    int currentFloor = 1;

    public abstract void selectFloor();

    public abstract void fireAlarm();

    public void simulateFloor(int destinationFloor) {
        if (destinationFloor > currentFloor) {
            System.out.print("Going up..");
            for (int i = currentFloor + 1; i <= destinationFloor; i++) {
                System.out.print(i + "..");
            }
            System.out.println("Ding!");
        } else if (destinationFloor < currentFloor) {
            System.out.print("Going down..");
            for (int i = currentFloor - 1; i >= destinationFloor; i--) {
                System.out.print(i + "..");
            }
            System.out.println("Ding!");
        } else {
            System.out.println("You are already on floor " + currentFloor);
        }
        currentFloor = destinationFloor;
    }
}

class MyElevator extends Elevator {
    @Override
    public void selectFloor() {
        try {
            System.out.println("Enter the floor that you'd like to go to => ");
            int floor = scanner.nextInt();
            if (floor < 1 || floor > 10) {
                throw new IllegalArgumentException("Invalid floor selection.");
            } else {
                simulateFloor(floor);
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void fireAlarm() {
        System.out.println("Danger! You must exit the building now!");
    }
}

public class MainElevator {
    public static void main(String[] args) {
        MyElevator elevator = new MyElevator();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Options: (s)elect a floor, (f)ire alarm, (q)uit Enter s, f, or q => ");
            String option = scanner.next();
            if (option.equals("s")) {
                elevator.selectFloor();
            } else if (option.equals("f")) {
                elevator.fireAlarm();
            } else if (option.equals("q")) {
                System.out.println("Exiting elevator simulation.");
                break;
            } else {
                System.out.println("Invalid selection.");
            }
        }
    }
}