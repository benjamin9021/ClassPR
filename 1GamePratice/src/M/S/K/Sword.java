package M.S.K;

public class Sword extends Weapon{
	
	public Sword() {
	}

	public Sword(int attackPower) {
		super(attackPower);
	}

	@Override
	public void img() {
		System.out.println("������ ���� ��ϴ�.");
	}

	@Override
	public String toString() {
		return "��";
	}

	
	
}
