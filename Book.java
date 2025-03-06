public class Book{

	String title;
	String  issn;
	String edition;
	Person author;
	Date dop;

	Book(String title,String  issn,String edition,Person author,Date dop){
		this.title=title;
		this.issn=issn;
		this.edition=edition;
		this.author=author;
		this.dop=dop;
	}

	void displayBook(){
		System.out.printf("\n--BOOK--\nTitle:%s\nISSN:%s\nEdition:%s\n",this.title,this.issn,this.edition);
		dop.displayDate();
		System.out.printf("\n\n-Author Details-");
		author.displayPerson();
	}
}
	