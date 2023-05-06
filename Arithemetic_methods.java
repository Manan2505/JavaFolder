import java.util.Scanner;
class Arithemetic_methods
{
void addition(int a,int b){
int c=a+b;
System.out.println(c);
}
void substraction(int a,int b){
	int c=a-b;
	System.out.println(c);
}
void division(int a,int b){
	int c=a/b;
	System.out.println(c);
}
void multiplication(int a,int b){
	int c=a*b;
	System.out.println(c);
}
public static void main(String[] args){
	 Arithemetic_methods d=new  Arithemetic_methods();
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a value");
	int a=sc.nextInt();
	System.out.println("enter b value");
	int b=sc.nextInt();
    d.addition(a,b);
	d.multiplication(a,b);
	d.substraction(a,b);
	d.division(a,b);
	
}
}
