package sec04.exam05;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("1. 이름: ___________");
		String name = scanner.nextLine();
		
		System.out.println("2. 주민번호 앞 6자리: ___________");
		String Hnum = scanner.nextLine();
		
		System.out.println("3. 전화번호: ___________");
		String Tnum = scanner.nextLine();
		
		System.out.println("[입력한 내용]");
		System.out.println(name);
		System.out.println(Hnum);
		System.out.println(Tnum);

	}

}
