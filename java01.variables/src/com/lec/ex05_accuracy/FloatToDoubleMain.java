package com.lec.ex05_accuracy;

public class FloatToDoubleMain {

	public static void main(String[] args) {
		
		int i1 = 123456780;
		int i2 = 123456780;
		
		// 형변환 시 정밀도
		float f1 = i1;	//정밀도 문제발생
		System.out.println("i1 = "+i1);
		System.out.println("i2 = "+i2);
		System.out.println("f1 = "+f1);
		System.out.println();
		
		
		i2 = (int)f1;	//정밀도 문제발생
		System.out.println("i2 = "+i2);
		
		int result = i1-i2;
		System.out.println("정밀도 문제발생 : "+result);
		
		
		
		// 실수(float) 연산시에도 정밀도 문제발생함.
		// float 0.1은 정확히 표현 불가. 따라서 실수의 연산은 float가 아닌 double로 연산 권고.
		System.out.println("double의 연산 : "+ (1.0 - 0.1));
		System.out.println("double과 float의 연산 : "+ (1.0 - 0.1f));	//형변환
		System.out.println("float와 float의 연산 : "+ (1.f - 0.1f));	//형변환
		
	}

}
