package test.main;

import test.mypac.MyWeapon;
import test.mypac.Weapon;

public class MainClass04 {
		
	public static void main(String[] args) {
		
		// local inner class
		class GuraWeapon extends Weapon{
			@Override
			public void attack() {
				System.out.println("�豸�� �����ؿ�");				
			}
		}
		
		// �߻� Ŭ���� Type �������� �����
		Weapon w1 = new GuraWeapon();
		doSomething(w1);
	}
	
	//�߻� Ŭ���� Type �� �������� �����ؾ� ȣ���� �� �ִ� �޼ҵ�
	public static void doSomething(Weapon w) {
		w.prepare();
		w.attack();
	}
}