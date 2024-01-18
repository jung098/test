package java07_inherit.practice.controller;

import java.awt.Rectangle;

import java07_inherit.practice.model.Circle;

public class Main {

	public static void main(String[] args) {
		
//		Circle 배열 초기화 : 3개
		
		Circle[] circles = new Circle[3];
		
//		Rectangle 배열 초기화 : 3개
//		각각 draw() 출력 처리	
		circles[0]=new Circle();

		circles[0].draw();
		System.out.println("---------------");
		circles[1]=new Circle(1,2,3);
		circles[1].draw();
		System.out.println("---------------");
		circles[1]=new Circle(5,2,3);
		circles[1].draw();
		System.out.println("----------------------");

		
		//Rectangle 배열 초기화 : 3개
		Rectangle[] rects = new Rectangle[3];
		
		rects[0] = new Rectangle();
		rects[1] = new Rectangle(0,0,0,0);
		rects[2] = new Rectangle(1,2,3,4);
		
		
		
		
	}

}
