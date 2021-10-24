package sec03.exam05;

public class OperationPromotionExample {

	public static void main(String[] args) {

		byte byteValue1 = 10;
		byte byteValue2 = 20;
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);
		
		char charValue1 = 'A' ;
		char charValue2 = 1;
		int charValue3 = charValue1 + charValue2;
		System.out.println("유니코드 =" +charValue3);
		System.out.println("출력문자 =" + (char)charValue3);
		
		int intValue3 = 10;
		int intValue4 = intValue3 / 4; 
		System.out.println(intValue4);
		
		
		double doubleValue = intValue3 / 4.0;
		System.out.println(doubleValue);

		
		int x = 1;
		int y = 2;
		double result = (double)x / y; 
		System.out.println(result);

	}

}
