public class Test{

public static void main(String args[]){
	
	Address addressAuthor=new Address("Lahore","ABC colony,Block D,");
	Person author=new Person("Yasim","03344890000",addressAuthor);
	
	Address addressStaff=new Address("Lahore","DEF colony,Block E1,");
	Person staff=new Person("Ahmed","035448911111",addressStaff);

	Address addressIncharge=new Address("Sialkot","Haha colony,Block G23,");
	Person 	incharge=new Person("Haris","035448911111",addressIncharge);

	Date d1=new Date(2,4,2022);
	Book book=new Book("Java","3248","Edition-1",author,d1);
	Library library=new Library(staff,book,"LMS-Lahore",incharge);

	library.display();
	}
}