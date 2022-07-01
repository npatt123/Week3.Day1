package week3.Day1;

public class Desktop extends Computer{
	
	public String desktopSize() {
		String modelsize = "32 inch";
		return modelsize;
				
	}
	
	public static void main(String[] args) {
				
		Desktop dSize = new Desktop();
		System.out.println(dSize.computerModel());
		System.out.println(dSize.desktopSize());	
		
	}
}
