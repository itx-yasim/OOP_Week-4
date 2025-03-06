public class Person{

	String name;
	String number;
	Address address;
	
	Person(String name,String number,Address address){
		this.name=name;
		this.number=number;
		this.address=address;
	}

	void displayPerson(){
		System.out.printf("\n%s\n%s\n",this.name,this.number);
		address.displayAddress();
	}
}