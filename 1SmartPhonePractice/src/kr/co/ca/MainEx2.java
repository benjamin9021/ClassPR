package kr.co.ca;

import java.util.ArrayList;

public class MainEx2 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add(new String("hello")); //�Է��ϰ� ������ �ְ� ������
		list.add(new String("world"));
		list.add(new String("hi"));
		list.add(new String("bye"));

		int size = list.size(); //  ������ ũ��, �迭�� ���� �ִ� ��
		System.out.println(size);
		
		String msg = list.get(0); // list.get Ư�� ��ü�� ���� ���� ���� �� ���
		String msg1 = list.get(1);
		String msg2 = list.get(2);
		String msg3 = list.get(3);
		System.out.println(msg+":"+msg1+":"+msg2+":"+msg3);
		
		String re = list.remove(2); // �迭�ȿ� �ִ� Ư�� �����͸� ����� ���� �� ���
		System.out.println(re);
		
		size = list.size();    // 4���� �ε����� 3���� ����ȴ�.
		System.out.println(size);
		
		list.clear();  // �迭 �� �� ��� �����͸� ����� ���� ��
		
		size = list.size();
		System.out.println(size);
		
		boolean co = list.contains(new String("world"));  // �迭�ȿ� ��� �մ��� �ƴ��� Ȯ�� �ϰ� ������ ���� Ư�� �����Ͱ� ���ٸ� false �ִٸ� true��� ���.
		System.out.println(co);
	
	}
	
}

