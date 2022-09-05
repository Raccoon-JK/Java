
public class Casting {

	public static void main(String[] args) {

		double a = 1.1;
		double b = 1;             // 자동으로 된것
		double b2 = (double) 1;   // 수동으로 바꾼것    위에것과 같은것 
		
		System.out.println(b);
		
	//	int c = 1.1;
		double d = 1.1;
		int e = (int) 1.1;  // 강제로 더블을 인티저로 바꿈
		
		System.out.println(e);
		
		//1 to String
		String f = Integer.toString(1);
		System.out.println(f.getClass());        // .getClass 앞에 변수가 어떤 테이터 타입인지 알수있는 코드
		
	}

}
