//library,books-2(author,address,publication date),composition,contructor call
public class Library{

	Person staff;
	Book book;
	String name;
	Person incharge;

	Library(Person staff,Book book,String name,Person incharge){
		this.staff=staff;
		this.book=book;
		this.name=name;
		this.incharge=incharge;
	}

	void display(){
		System.out.printf("--NAME OF LIBRARY--\n%s\n",this.name);
		book.displayBook();
		System.out.printf("\n\n--STAFF Details--");
		staff.displayPerson();
		System.out.printf("\n\n--OWNER Details--");
		incharge.displayPerson();
	}
}