package singleton;


public class Student {
	private static Student student = new Student();
	
	private Student() {
		
	}
	// 서로다른 주소 프로토타입
	public static Student getInstance() {
		return new Student();
	}
	
	// 같은주소 싱글턴
	public static Student getInstance2() {
		return student;
	}
	
}
