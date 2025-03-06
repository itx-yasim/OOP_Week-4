public class Address{

	String city;
	String colony;	

	Address(String city,String colony){
		this.city=city;
		this.colony=colony;
	}

	void displayAddress(){
		System.out.printf("Address:%s  %s",this.colony,this.city);
	}
}