package com.louis;

import java.util.Scanner;

public class Main {

	private static Scanner in;

	public static void main(String[] args) {
		
		in = new Scanner(System.in);
		System.out.println("Triangle type: ");
        String type = in.nextLine();
        System.out.println("Triangle size: ");
		int size = in.nextInt();
		
		Triangle tri = new Triangle();
			tri.setSize(size);
		
		if(type.equals("Regular")) {
			tri.RegularTriangle();
		}
		if(type.equals("Right")){
			tri.RightTriangle();
		}
		if(type.equals("Left")){
			tri.LeftTriangle();
		}
		if(type.equals("Reverse")){
			tri.ReverseTriangle();
		}
		
		in.close();
	}

}

