package com.lec.robot.v4_인터페이스.impl;

import com.lec.robot.v4_인터페이스.inter.InterFly;

public class FlyYes implements InterFly {
	
	@Override
	public void fly() {
		System.out.println("날 수 있습니다");
	}
}
