package memory;
// 자바의 메모리
// 앞으로 배울 예외처리.. 호출스택

/*
 메소드영역 : 클래스데이터(클래스변수)
 			프로그램 실행 중 어떤 클래스가 사용되면 JVM이 해당 클래스파일을 읽어서 
 			클래스데이터를 이곳에 저장하고 동시에 클래스변수도 이곳에 저장.
 호출스택 : 메인메소드(지역변수). 
 (선입후출)	메소드작업에 필요한 메모리공간을 제공.
 			메소드가 호출되면 호출스택에 메소드 활용을 위한 메모리가 할당됨.
 			메모리에서 메소드가 작업을 수행하는동안 지역변수와 연산의 중간 결과가 저장됨.
 			메소드가 작업을 마치면 할당된 메모리공간은 반환/비워짐.
 			호출스택은 제일 상위에 있는 메소드가 현재 실행되고 있는 메소드.
 			나머지는 모두 대기
 			-> 아래에 있는 메소드는 바로 위에 있는 메소드를 호출해서 사용중인 메소드. 
 
 힙영역 : 인스턴스(인스턴스변수)
 Heap 	인스턴스가 생성되는 곳.
 */
public class Memory {
	public static void main(String[] args) {	// 메인메소드
		System.out.println("메인메소드시작");
		first(); 								// first 메소드 호출
		System.out.println("메인메소드끝");
	}
	static void first() {						// first 메소드
		System.out.println("first메소드 시작");
		second();								// second 메소드 호출
		System.out.println("first메소드 끝");
		
	}
	static void second() {						// second 메소드
		System.out.println("second메소드 시작");
		System.out.println("second 일하는 중");
		System.out.println("second메소드 끝");
	}

}
