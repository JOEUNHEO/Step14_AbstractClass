package test.main;

import test.mypac.MyWeapon;
import test.mypac.Weapon;

public class MainClass02 {
	public static void main(String[] args) {
		// �߻� Ŭ���� Type �������� �����
		Weapon w1 = null;
		// �߻� Ŭ���� Type �� �������� �ʿ� �ϴٸ�?(�ڽ� ��ü�� �θ� Type ��ü�� �޴´�.)
		w1 = new MyWeapon();
		
		doSomething(w1);
	}
	
	//�߻� Ŭ���� Type �� �������� �����ؾ� ȣ���� �� �ִ� �޼ҵ�
	public static void doSomething(Weapon w) {
		w.prepare();
		w.attack();
	}
}
