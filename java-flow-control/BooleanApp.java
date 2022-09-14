
public class BooleanApp {

	public static void main(String[] args) {
		
		//string 문자 "" 안
		System.out.println("One");
		
		//인티저 숫자 정수
		System.out.println(1);
		
		//Boolean 2개
		System.out.println(true);
		System.out.println(false);
		
		String foo = "Hello world";
		
		
		// true , false 는 변수로 사용 불가
//		String true = "Hello world";  reserved word
		
		// contains() 는 ture 와 false 로 () 안에 문자가 들어있는지 없는지 구분하는 메소드
		System.out.println(foo.contains("world"));
		System.out.println(foo.contains("kimjinki"));

	}

}
