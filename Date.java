public class Date{
	
	int day;
	int month;
	int year;

	Date(int day,int month,int year){
		this.day=day;
		this.month=month;
		this.year=year;	
	}

	void displayDate(){
		System.out.printf("Date of publication:%d-%d-%d",this.day,this.month,this.year);
	}

}