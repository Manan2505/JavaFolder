//Class for this keyword

import java.util.Scanner;
class day3second{
	 /*void fun(){
		 System.out.printlnln(this);// "this" is used to print the address of current object
		 System.out.println("hello");
		 
		
	}
	public static void main(String[] args){

		
		day3second d1=new day3second();
		day3second d2 =new day3second();
		//System.out.println(d1);
		d1.fun();
	    d2.fun();	
	}*/

	
	     bank details question: 1st approach

	/*int total=100;
	String username="abc@gmail.com"; // 3 instance variables
	int password=1234;
	int login(String username,int password){
		if(this.username.equals(username) && this.password==password){ //.equals is only used for string
			return 1;
		}
		return 0;
		
	}
	public static void main(String[] args){
		day3second d =new day3second();
		int result=d.login("abc@gmail.com",134);
		if(result==1){
			System.out.println("Login successful");
		}
		else{
			System.out.println("Wrong details\nPlease try again after some time");
		}
	}*/

	
	//2nd approach by scanner function/method

	int total=100;
	String username="pub@gmail.com";
	int password=12345;

	public int login(String username,int password){
		if(this.username.equals(username) && this.password==password){
			return 1;
		}
		else{
			return 0;
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter username: ");
		String username=sc.next();
		System.out.print("enter password: ");
		int password=sc.nextInt();
		day3second b=new day3second();
		int result=b.login(username,password);
		if(result==1){
			System.out.println("You are successfully logged in!");
		}
		else{
			System.out.println("Wrong Credentials");
		}

		
		
	}

}

