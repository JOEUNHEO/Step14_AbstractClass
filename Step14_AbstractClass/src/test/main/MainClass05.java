package test.main;

import test.mypac.MyWeapon;
import test.mypac.Weapon;

public class MainClass05 {
		
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
		
		// �͸��� local inner class �� �̿��ؼ� Weapon type ��ü
		// �����ؼ� �������� Weapon type ������ ���
		Weapon w2 = new Weapon() {// �͸��� local inner class�̸�, �߻� Ŭ������� extends Weapon �� Ŭ������.(Weapon �� ��ӹ��� Ŭ����)
			@Override
			public void attack() {
				System.out.println("�ƹ��� �����ؿ�!");
			}
			
		};
		doSomething(w2);
	}
	
	//�߻� Ŭ���� Type �� �������� �����ؾ� ȣ���� �� �ִ� �޼ҵ�
	public static void doSomething(Weapon w) {
		w.prepare();
		w.attack();
	}
}
