class Student{
	String name="Adam";
	int marks=100;
	
	Student(){
		name="NoName";
	}
	
	Student(String n){
	name=n;
	}
	
	Student(String n, int m){
		name=n;
		marks=m;
	}
}

class StudentDemo{
	public static void main(String[] args){
		System.out.println("Hi From StudentDemo Class");
		System.out.println("Creating an Object of Student Class");
		
		
		Student s1=new Student("Nice Name");
		System.out.println("Name value of the object is " +s1.name);
		System.out.println("Marks value of the object is " +s1.marks);
		
		s1.name="Bobi";
		s1.marks=15;
		System.out.println("Name value of the object is " +s1.name);
		System.out.println("Marks value of the object is " +s1.marks);
		
		
	}
}

