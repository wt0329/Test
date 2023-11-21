package test;

public class Test {
	public static void main(String[] args) {
		
	
		String str = new String("Class 클래스 테스트");

		// getClass() 메서드로 얻기
		Class<? extends String> cls = str.getClass();
		System.out.println(cls);
	}
}
