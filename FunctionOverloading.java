/*
 * *Design a class to overload a function series() as follows
 (a) void series (int x, int n) – To display the sum of the series given below:
x1 + x2 + x3 + ……………. xn terms
(b) void series (int p) – To display the following series:
0, 7, 26, 63 p terms.
(c) void series () – To display the sum of the series given below:
 */
package com.edu;

import java.util.Scanner;

public class FunctionOverloading {
	void series(int x, int n) {
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += Math.pow(x, i);
        }
        System.out.println("Sum = " + sum);
    }

    void series(int p) {
        for (int i = 1; i <= p; i++) {
            int term = (int)(Math.pow(i, 3) - 1);
            if(i<p)
            System.out.print(term + ",");
            if(i==p)
            	System.out.print(term);
        }
        System.out.println();
    }

    void series() {
        double sum = 0.0;
        for (int i = 2; i <= 10; i++) {
            sum += 1.0 / i;
        }
        System.out.println("Sum = " + sum);
    }
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = in.nextInt();
        System.out.print("Enter n: ");
        int n = in.nextInt();
        
        FunctionOverloading obj = new FunctionOverloading();
        obj.series(a, n);
        obj.series(n);
        obj.series();
	}

}
