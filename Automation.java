package week3.Day1;

	public class Automation extends MultipleLanguage implements Language,TestTool {

		public void Selenium() {
		System.out.println("Selenium in Automation class");
		
		}

		public void Java() {
			System.out.println("Java in Automation class");
		
		}

		public static void main(String[] args) {
			
			Automation obj = new Automation();
			obj.Java();
			obj.ruby();
			obj.python();
			obj.Selenium();
	
}

		@Override
		public void ruby() {
			System.out.println("ruby in automation class");
			
		}

}
