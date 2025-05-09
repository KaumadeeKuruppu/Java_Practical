class Paper
{
	int length,width;
	String text;
}

class Document
{
	String name;
	Paper p;
	public static void main(String[] args)
	{
		Document d=new Document();
		d.p=new Paper();
		System.out.println("Created a Document Object d");

		d.name="My First Document";
		System.out.println("Name of the document d is:"+d.name);
		System.out.println("Size of the paper in the document is:"+d.p.length+","+d.p.width);
		
		Document d2=new Document();
		System.out.println("Created a Document Object d2");
		d2.name="My Second Document";
		System.out.println("Name of the document d2 is:"+d2.name);
		
	}
}