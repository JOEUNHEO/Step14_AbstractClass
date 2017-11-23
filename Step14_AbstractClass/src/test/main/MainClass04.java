package test.main;

import test.mypac.MyWeapon;
import test.mypac.Weapon;

public class MainClass04 {
		
	public static void main(String[] args) {
		
		// local inner class
		class GuraWeapon extends Weapon{
			@Override
			public void attack() {
				System.out.println("김구라를 공격해요");				
			}
		}
		
		// 추상 클래스 Type 지역변수 만들기
		Weapon w1 = new GuraWeapon();
		doSomething(w1);
	}
	
	//추상 클래스 Type 의 참조값을 전달해야 호출할 수 있는 메소드
	public static void doSomething(Weapon w) {
		w.prepare();
		w.attack();
	}
}
