package com.edu;

import java.util.Scanner;

public class DistanceCalculator {
	public static double distanceTravelled(double u, double a, double t) {
		u = u*1000/3600;
		double distance =u*t+(0.5*a*Math.pow(t, 2));
		return distance;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] timeIntervals = new double[2];for(int i=0;i<2;i++) {
			timeIntervals[i]= sc.nextDouble();
			double intialVelocity= 36;
			double acceleration = 5;
			for(double t: timeIntervals) {
				double distance = distanceTravelled(intialVelocity ,acceleration, t);
				System.out.println(distance);
			}
			
			}
	}

}
