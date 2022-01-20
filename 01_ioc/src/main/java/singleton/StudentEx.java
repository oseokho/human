package singleton;

public class StudentEx {
	public static void main(String[] args) {
//		public protected () private		
		
// 		생성자를 private 로 하여 외부에서 객체생성 불가능
//		Student student = new Student();
//		System.out.println(student);
		System.out.println("---------------------------------");
		// Factory pattern > prototype 서로다른 주소
		Student student2 = Student.getInstance();
		Student student3 = Student.getInstance();
		
		System.out.println(student2);
		System.out.println(student3);
		System.out.println("---------------------------------");
		// Factory > singleton 같은주소
		Student student4 = Student.getInstance2();
		Student student5 = Student.getInstance2();
		
		System.out.println(student4);
		System.out.println(student5);
		System.out.println("---------------------------------");
	}
}
