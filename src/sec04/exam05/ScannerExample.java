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
			System.out.println("�Էµ� ���ڿ�: " + inputData + "\"");
			if(inputData.equals("q"))
			{
				break;
			}
		
		}
		System.out.println("����");

		*/

		String name = "���ڹ�";
		int age = 25;
		String tel1="010" , tel2 = "123" , tel3 = "4567";
		
		System.out.println("�̸�: " + name);
		System.out.print("����: " + age);
		System.out.printf("\n��ȭ: %1$s - %2$s - %3$s" , tel1 , tel2 , tel3);

		
		

	}

}
