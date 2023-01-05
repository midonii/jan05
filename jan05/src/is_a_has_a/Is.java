package is_a_has_a;
// 클래스의 관계
/* 		is a		vs  	  has a
 *	 ~은 ~이다			~은 ~을 가지고 있다.
 *
 *	
 */
class Human {
	String name;
	int age;
	int gender;
}
// 상속관계 : 학생이 사람으로부터 상속받고있음.
// 학생은 사람입니다가 성립된다. 이런 관계를 is a관계 라고 함.
class Student extends Human{
	int number; 	// 학번
	String major; 	// 전공
}
class Gun{
	String name;
	int shot;		// 총알
}
// has a관계 : 경찰은 총을 가지고 있음.
// 경찰 클래스 속에 총 클래스의 객체를 멤버로 가지고 있는 경우
class Police{
	Gun gun; 		// Police 클래스 안에 Gun 클래스의 객체를 멤버로 가져옴. 객체생성이 아니고 객체를 가져오는것. 아직 gun 객체 생성안했음. 
//	클래스 객체명 : 이것도 Police의 필드라고 볼 수 있는지?
}
public class Is {
	public static void main(String[] args) {
		Police police = new Police();	// Police 클래스의 객체 police 생성
		Gun gun1 = new Gun();			// Gun 클래스의 객체 gun 생성. (Police에서 받아와야함)
		police.gun = gun1;				// police객체의 gun필드(?)에 Gun클래스의 객체 gun 대입하겠다는 의미
		police.gun.name = "니코니코"; 	// gun1(Gun클래스의 객체).name = "니코니코"; 의 의미.
	}

}
