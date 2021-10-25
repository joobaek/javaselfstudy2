package sec04.exam05;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
/*
		Scanner scanner = new Scanner(System.in);
		
		String inputData;
		
		while(true)
		{
			inputData = scanner.nextLine();
			System.out.println("입력된 문자열: " + inputData + "\"");
			if(inputData.equals("q"))
			{
				break;
			}
		
		}
		System.out.println("종료");

		*/

		String name = "감자바";
		int age = 25;
		String tel1="010" , tel2 = "123" , tel3 = "4567";
		
		System.out.println("이름: " + name);
		System.out.print("하이: " + age);
		System.out.printf("\n전화: %1$s - %2$s - %3$s" , tel1 , tel2 , tel3);

		
		

	}

}
