class Student{
	int marks;
	String name;
	
	Student(){
		System.out.println("Creating a Student object");
		name="Default name";
	}
	
	Student(String n,int m){
		System.out.println("Creating object with name "+n+" and marks "+m);
		name=n;
		marks=m;
	
	}
			
}

class App{
	public static void main(String[] args){
		System.out.println("Welcome to Demo class App");
		
		
		Student s1=new Student();
		
		System.out.println("Student name is "+s1.name+". ");
		System.out.println("Student marks is "+s1.marks);
		s1.name ="Mala";
		s1.marks=80;
		
		System.out.println("Student name is "+s1.name+". ");
		System.out.println("Student marks is "+s1.marks);
	
		Student s2 =new Student("Bobi",50);
		//s2.marks=50;
		//s2.name="BOB";
		
		System.out.println("Student2 name is "+s2.name);
		System.out.println("Student marks is "+s2.marks);
	}
}