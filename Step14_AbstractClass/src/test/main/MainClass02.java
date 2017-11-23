package test.main;

import test.mypac.MyWeapon;
import test.mypac.Weapon;

public class MainClass02 {
	public static void main(String[] args) {
		// 추상 클래스 Type 지역변수 만들기
		Weapon w1 = null;
		// 추상 클래스 Type 의 참조값이 필요 하다면?(자식 객체를 부모 Type 객체로 받는다.)
		w1 = new MyWeapon();
		
		doSomething(w1);
	}
	
	//추상 클래스 Type 의 참조값을 전달해야 호출할 수 있는 메소드
	public static void doSomething(Weapon w) {
		w.prepare();
		w.attack();
	}
}
