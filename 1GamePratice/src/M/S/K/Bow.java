package M.S.K;

public class Bow extends Weapon {
	
	public Bow() {
	}

	public Bow(int attackPower) {
		super(attackPower);
	}

	@Override
	public void img() {
		System.out.println("ȭ���� ����Ĩ�ϴ�.");
	}

	@Override
	public String toString() {
		return "Ȱ";
	}

	
	

}
