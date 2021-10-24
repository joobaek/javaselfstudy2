package sec03.exam07;

public class PrimitiveAndStringConversionExample {

	public static void main(String[] args) {

		/*
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
		String str1 = String.valueOf(10);
		String str2 = String.valueOf(3.14);
		String str3 = String.valueOf(true);

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);

		
		long var1 = 2L;
		float var2 = 1.8f;
		double var3 = 2.5;
		String var4 = "3.9";
		int result = (int)var1 + (int)var2 + (int)var3; 
		
		System.out.println(result);
		
		
		int intValue = 10;
		char charValue = 'A';
		double doubleValue = 5.7;
		String strValue = "A";
		
		double var5 = (double)intValue;
		byte var6 = (byte)intValue;
		int var7 = (int) doubleValue;
		
		System.out.println(var5);
		System.out.println(var6);
		System.out.println(var7);
		
		
		double var10 = 3.5;
		double var11 = 2.7;
		int result5 = (int)var10 + (int)var11;
		System.out.println(result5);
		
		
		*/
		
		long var1 = 2L;
		float var2 = 1.8f;
		double var3 = 2.5;
		String var4 = "3.9";
		

		int result =  (int) (var1 + var2 + var3 + (int)Double.parseDouble(var4));
		System.out.println(result);


		char c1 = 'a';
		char c2 =(char) (c1 + 1);
		System.out.println(c2);

	
	}
	

}
