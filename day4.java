//banking code
import java.util.Scanner;
class day4
{
	String acc_no;
	String name;
	String acc_type;
	long balance;

	//go to day4first
	void open_account(){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter acc_no ");
		this.acc_no=sc.next();
		System.out.print("enter name ");
		this.name=sc.next();
		System.out.print("enter acc_type ");
		this.acc_type=sc.next();
		System.out.print("enter balance ");
		this.balance=sc.nextLong();
		
	}
	
}