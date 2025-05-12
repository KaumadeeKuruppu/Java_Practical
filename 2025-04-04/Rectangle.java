class Rectangle{
	
	 int  width;
	 int height;
	
	
	
	 Rectangle(){
		width=2;
		height=3;
	}
	
	
	Rectangle(int height, int width){
		this.width=width;
		this.height=height;
		System.out.println("Just create a rectangle (h*w) : "+height+"*"+width);
		print(width,height);
	}
	
	
	void print(int width, int height){
		
		for(int i=0; i<height; i++){
			for(int j=0; j<width; j++){
				System.out.print(" * ");
			}
			System.out.println(  );
		}
		
	}


	void get_detail(){
		System.out.println("Height: "+height+","+" Width: "+width);
	}
	
}

class Main{
	public static void main(String[] args){

		Rectangle r1=new Rectangle(5,4);
		Rectangle r2=new Rectangle();
		//r1.height=10;
		r1.width=20;
		Rectangle r3=r1;

		//r1.get_detail();
		//r2.get_detail();
		//r3.get_detail();

		System.out.println("Height: "+r1.height+","+"Width: "+r1.width);
		System.out.println("Height: "+r2.height+","+"Width: "+r2.width);
		System.out.println("Height: "+r3.height+","+"Width: "+r3.width);
	}
		
		
	
	}
	
	
