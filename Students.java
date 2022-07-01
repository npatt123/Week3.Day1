package week3.Day1;

public class Students {
	
	public void getStudentInfo(String name) {		
		System.out.println("Name of the student: " + name);	
	}
	
	
	public void getStudentInfo(int id, String name) {		
		System.out.println(("Student id: " + id) + "  " +("Student Name: " + name));
		}
	
	
	public void getStudentInfo(String emailID, long phoneNumber) {		
		System.out.println(("Student emailid: " + emailID) + " " + ("Student phonenumber : " +  phoneNumber));
		}
	
	public void getStudentInfo(int age) {		
		System.out.println("Student age : "+ age);	
		}
	
	public static void main(String[] args) {
		
		Students info = new Students();
		info.getStudentInfo(17);
		info.getStudentInfo("Nalini");
		info.getStudentInfo(123, "Nalini");
		info.getStudentInfo("nalini.patttabiram@gmail.com", 822484860);	
	}
}
