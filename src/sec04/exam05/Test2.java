package sec04.exam05;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("1. �̸�: ___________");
		String name = scanner.nextLine();
		
		System.out.println("2. �ֹι�ȣ �� 6�ڸ�: ___________");
		String Hnum = scanner.nextLine();
		
		System.out.println("3. ��ȭ��ȣ: ___________");
		String Tnum = scanner.nextLine();
		
		System.out.println("[�Է��� ����]");
		System.out.println(name);
		System.out.println(Hnum);
		System.out.println(Tnum);

	}

}
