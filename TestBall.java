package LabTestAzfar;

import java.util.Scanner;

public class TestBall {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter ball radius: ");
		int radius = input.nextInt();

		System.out.println("Enter ball height: ");
		int height = input.nextInt();

		Ball ball = new Ball(radius,height);
		System.out.println(ball);
		System.out.println("volume is = "+ball.calculateVolume()+" m^3");
		
	}
}
