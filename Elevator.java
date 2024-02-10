package com.edu;

import java.util.Scanner;

public class Elevator {
    private int currentFloor;

    public Elevator() {
        this.currentFloor = 1;
    }

    public void selectFloor() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Options: (s)elect a floor, (f)ire alarm, (q)uit");
            System.out.print("Enter s, f, or q ==> ");
            String selection = scanner.nextLine();

            if (selection.equals("s")) {
                System.out.print("Enter the floor that you'd like to go to ==> ");
                int floor = scanner.nextInt();
                scanner.nextLine(); // Consume newline character

                if (floor < 1 || floor > 10) {
                    System.out.println("Invalid floor selection. Please select a floor between 1 and 10.");
                } else {
                    if (floor > currentFloor) {
                        System.out.print("Going up. ");
                        for (int i = currentFloor + 1; i < floor; i++) {
                            System.out.print(i + "..");
                        }
                        System.out.println("Ding!");
                    } else if (floor < currentFloor) {
                        System.out.print("Going down. ");
                        for (int i = currentFloor - 1; i > floor; i--) {
                            System.out.print(i + "..");
                        }
                        System.out.println("Ding!");
                    } else {
                        System.out.println("You are already on floor " + floor);
                    }
                    currentFloor = floor;
                    break;
                }
            } else if (selection.equals("f")) {
                System.out.println("Danger! You must exit the building now!");
                break;
            } else if (selection.equals("q")) {
                System.out.println("Quitting...");
                break;
            } else {
                System.out.println("Invalid selection.");
            }
        }
    }

    public static void main(String[] args) {
        Elevator elevator = new Elevator();
        elevator.selectFloor();
    }
}