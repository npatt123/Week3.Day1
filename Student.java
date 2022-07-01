package week3.Day1;

public class Student extends Department {
	
	public void studentName() {
		System.out.println("Student name is Nalini");	
		}
	
	public void studentDept() {		
		deptName();
		}
	
	public int studentId(int a) {
		int Code = collegeCode();	
		String stuid = Integer.toString(Code)+Integer.toString(a);
		int studentid = Integer.parseInt(stuid);			
		System.out.println("Student id : " + studentid);
		return studentid;
	}
	
	public static void main(String[] args) {
		
		Student stu = new Student();
		stu.collegeName();
		stu.collegeCode();
		stu.collegeBank();
		stu.deptName();				
		stu.studentName();
		stu.studentId(123);
		stu.studentDept();
		
		
	}
	
	
	
	

}
