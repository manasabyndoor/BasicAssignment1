import java.util.Scanner;
public class DateProgram{
	public void main(String args[])
	{
Scanner scan=new Scanner(System.in);
	int date,month,year;
		System.out.println("Enter date in the format DD,MM,YY");
		//read date month and year
		date=scan.nextInt();
		month=scan.nextInt();
		year=scan.nextInt();
		String mon = null;
		
		//switch case to print month according user entered month
		switch(month)
		{
			case 1: mon="January";
			break;
			case 2: mon="Feb";
			break;
			case 3: mon="Mar";
			break;
			case 4: mon="April";
			break;
			case 5: mon="may";
			break;
			case 6: mon="june";
			break;
			case 7: mon="july";
			break;
			case 8: mon="august";
			break;
			case 9: mon="sep";
			break;
			case 10: mon="october";
			break;
			case 11: mon="nov";
			break;
			case 12: mon="decem";
			break;
			default: System.out.println("Invalid");
			
			
		}
		System.out.println(date+"/"+mon+"/"+year);
		
		
	}
}