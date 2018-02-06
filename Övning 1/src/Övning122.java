import java.util.Scanner;
public class Övning122 {
public static void main(String[] args)
{
	int num, fact=1;
	Scanner scan = new Scanner(System.in); 
	System.out.println("Skriv in ett numer tack");
	num= scan.nextInt();
	if (num<=0)
			System.out.println("Fakulteten är inte definierad för detta tal");
	else
	{ 
		int i = 1;
		while (i<=num)
			
		 {
	fact= fact*i ;
	i++;
		}
System.out.println("Factorial of " + num + " = " + fact);
	
}
}
}
