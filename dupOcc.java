import java.util.Scanner;
class  dupOcc
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str = input.next();

		
		System.out.print("Number of Duplicate Characters are : ");
		int cnt=0;
		for(int i=0;i<str.length();i++){
			for(int j=i+1;j<str.length();j++){
				if(str.charAt(i)==str.charAt(j)){
					cnt++;
				}
			}
		}
		System.out.println(""+cnt);
	}
}