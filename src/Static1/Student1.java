package Static1;

public class Student1 {
	
	int rollno;
	String name;
	int age;
	static String collage = "CTS";
	
	 static void change()
	 {
		 collage = "CIT";
	 }
	
	 Student1(int r, String n, int a)
	{
		rollno = r;
		name = n;
		age = a;
	}
	 Student1(int r, String n)
		{
			rollno = r;
			name = n;
		}
	
	 static
	 {
		 System.out.println("static block is invoked");
		 }  
	 void display()
	 {
		 System.out.println(rollno + " " +name+ " " +age+ " " +collage);
	 }
	
	public static void main(String[] args) {
		
		Student1 s1 = new Student1(1,"mura",12);
		Student1 s2 = new Student1(2,"sow");
	
		s1.display();
		s2.display();
	
	}

}
