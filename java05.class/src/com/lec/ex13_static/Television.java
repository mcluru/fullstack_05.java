package com.lec.ex13_static;

/*
	정적초기화블럭
	클래스가 메모리로 로딩될 때 자동실행되는 블럭. 클래스 내부에 여러개 선언 가능함.
	클래스가 메모리로 로딩될 때 선언된 순서로 실행됨.
*/

public class Television {

	static String company = "LGE";
	static String model = "OLED";
	static String info;	//LGE-OLED
	int year;
	
	
	
	static {
		info = company + "-" + model;
	}
	static {
		// 정적블럭에서 객체필드에 접근불가
//		year = 2023;
	}
	static {}
	static {}
	
	
	
}
