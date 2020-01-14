package M.S.K;

import java.util.Scanner;

public class MainEx {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Monster mon = new Monster(WeaponSpec.MONSTER_HP_1);
		
		System.out.println("DB���� ���� ������ �����ɴϴ�.");
		
		Weapon[] arr = {new Bow(WeaponSpec.BOW_ATTACK_POWER_1), 
						new Sword(WeaponSpec.SWORD_ATTACK_POWER_1),
						new Spear(WeaponSpec.SPEAR_ATTACK_POWER_1)};
		
		Weapon hasWeapon = arr[1];
		
		Hero man = new Hero(arr, hasWeapon);
		
		while (true) {
			System.out.println("�޴��� ������");
			System.out.println("1: ����, 2: ���⺯��, 3: ��������");
			int menu = sc.nextInt();
			if (menu==3) {
				break;
			}else if(menu==1) {
				man.attack(mon);
			}else {
				for (int i = 0; i < arr.length; i++) {
					System.out.print(i+":");
					System.out.println(arr[i]);
				}
			int idx = sc.nextInt();
				man.changeWeapon(idx);
			}
			
		}
		
		sc.close();
		
	}

}

