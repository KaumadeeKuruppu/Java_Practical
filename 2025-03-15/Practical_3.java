import java.io.*;

class One{
	int a =10;
	int b=45;
	
	void printDetails(){
		System.out.println("From class one a = "+a);
		System.out.println("From class one b = "+b);
		}
	}
	


class Two{
	int a,c;
	
	void printDetails(){
		System.out.println("From class two a = "+a);
		System.out.println("From class two c = "+c);
		}
}

class Practical_3{
	
	public static void main(String[] args){
		One ol = new One();
		Two tl = new Two();
		
		ol.printDetails();
		tl.printDetails();
		
		ol.a=100;
		ol.printDetails();
		tl.printDetails();
		
		tl.c=25;
		tl.a=80;
		tl.printDetails();
		
	}
}