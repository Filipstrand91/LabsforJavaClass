import java.util.Scanner;
public class Övning121
{
	 public static void main(String[] args) 
	 
	 {
		int fact=1;
		int num;
		// or you can write int num, fact=1 same as inte fact=1 ; int num
		
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter the number");
		 num = scan.nextInt();
		 if(num<=0)
			 System.out.println("The factorial is not defined");
			 else
		 {
				 for(int i =1;i<=num;i++) // Ersätt for med while
				 {
		 	fact= fact*i ;
				}
	 System.out.println("Factorial of " + num + " = " + fact);
}

}
}
