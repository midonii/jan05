package enum01;

// Enum : 열거타입. 사용할 수 있는 것들을 고정해두고, 이 중 골라서 사용하기.
// 			열거한 데이터만 사용할 수 있음. 같은 값 중복 불가.
// 			enum 명은 클래스명하고 중복될 수 없음.
enum Week {
	MON, TUE, WED, THU, FRI, SAT, SUN;
}


public class Enum01 {
	/* 이렇게 사용했던것을, enum으로 편하게 쓸 수 있음.
	static final String MON = "월요일";
	static final String TUE = "화요일";
	static final String WED = "수요일";
	static final String THU = "목요일";
	static final String FRI = "금요일";
	static final String SAT = "토요일";
	static final String SUN = "일요일";
	*/
	
	public static void main(String[] args) {
		Week week = /* ctrl+spc */ Week.FRI;
	//	열거명 객체명 = 열거명.데이터명;
		
		var number = 10; 
		// var : java10버전에 도입된 변수
		// 값으로 데이터타입을 추론함. 지역변수로만 사용가능.
		// 꼭 초기화 후 사용해야하고 null초기화 불가, 배열사용 불가
		// 잘 안씀
		System.out.println(number);
		
		var name = "홍길동";
		String str = name;
		
		
	}
	
}
