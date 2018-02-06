import java.util.Scanner;

public class Övning105 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner newscan = new Scanner(System.in);
	System.out.print("Skriv in ett tal här====>");
	double number1 = newscan.nextDouble();
	System.out.print("Skriv in det andra talet här===>");
	int number2 = newscan.nextInt();
		if (number2 !=0) {
			System.out.println("Kvoten mellan talen är" +(number1 / number2));
	} else {
		System.out.println("Du försökte divider med 0.");
	}
		
	}

}
