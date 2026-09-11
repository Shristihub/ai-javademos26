package com.inter.lamb;

public class LambDemo {

	public static void main(String[] args) {
		// traditional
		IShape shape = new Square();
		shape.area(10, 20);
		
		// use lambda - provide the implementaion
		IShape shape1 = (x, y)->System.out.println("Square "+(x*y));
		shape1.area(10, 10);
		
		// rectangle implemattaion
		IShape rect = (x,y)->System.out.println("Rect "+(x*y));
		rect.area(1, 2);
		// triangle
		
		// implmentation
		IMessenger messenger = name->{
			return "Hello "+name;
		};
		//call the method
		String result = messenger.greet("Priya");
		System.out.println(result);
		
		
		messenger = name->"Have a great day "+name;
		System.out.println(messenger.greet("Helen"));
		
		
		
		
		
		
		
	}
}
