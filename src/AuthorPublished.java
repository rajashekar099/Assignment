package Inheritance;

public class AuthorPublished {

	public static void main(String[] args) {

	//	AuthorPublished Obj = new AuthorPublished();
		
		Published1 Obj1 = new Published1();
		//set the first author publish details
		Obj1.setAuthorName("Tom");
		Obj1.setAuthorGender('M');
		Obj1.setAuthorEmail("Tom@garypublish.org");
		Obj1.setBookName("JavaBook");
		Obj1.setNoOfPagesInBook(350);
		
		//get the first author publish details
		System.out.println("Publish First Author Name : " + Obj1.getAuthorName());
		System.out.println("Author Gender : " + Obj1.getAuthorGender());
		System.out.println("Author Email : " + Obj1.getAuthorEmail());
		System.out.println("Publish1 Book Name : " + Obj1.getBookName());
		System.out.println("Publish1 No of Pages : " + Obj1.getNoOfPagesInBook());
		System.out.println("----------------------------------------------------");
		Published2 Obj2 = new Published2();
		//set the Second author publish details
		Obj2.setAuthorName("Katrin");
		Obj2.setAuthorGender('F');
		Obj2.setAuthorEmail("Kat@publish.org");
		Obj2.setBookName("Angular");
		Obj2.setNoOfPagesInBook(540);
		
		//get the Second author publish details
		System.out.println("Publish Second Author Name : " + Obj2.getAuthorName());
		System.out.println("Author Gender : " + Obj2.getAuthorGender());
		System.out.println("Author Email : " + Obj2.getAuthorEmail());
		System.out.println("Publish2 Book Name : " + Obj2.getBookName());
		System.out.println("Publish2 No of Pages : " + Obj2.getNoOfPagesInBook());
		System.out.println("---------------------------------------------------------");
		
		Published3 Obj3 = new Published3();
		
		//set the Third author publish details
				Obj3.setAuthorName("Mark A");
				Obj3.setAuthorGender('M');
				Obj3.setAuthorEmail("Mark@publish.org");
				Obj3.setBookName("ReactJs");
				Obj3.setNoOfPagesInBook(600);
				
				//get the Third author publish details
				System.out.println("Publish Third Author Name : " + Obj3.getAuthorName());
				System.out.println("Author Gender : " + Obj3.getAuthorGender());
				System.out.println("Author Email : " + Obj3.getAuthorEmail());
				System.out.println("Publish3 Book Name : " + Obj3.getBookName());
				System.out.println("Publish3 No of Pages : " + Obj3.getNoOfPagesInBook());
				
		
	}

}
