package sec04.exam02;

public class KeyCodeExample {

	public static void main(String[] args) throws Exception // 예외처리 코드
	{

		int keyCode;
		
		keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode);
		
		keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode);
		
		keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode);
	}

}
