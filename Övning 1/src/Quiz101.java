import java.util.Scanner;

public class Quiz101

{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		double sum = 0;
		int pos = 0;
		for (int i = 0; i < n; i++) {
			double term = scan.nextDouble();
			if (term > 0) {
				sum = sum + term;
				pos++;
			}
		}
		System.out.println(sum / pos);
	}
}
// om term är större än noll så ska sum adderas med term. pos ökar med ett varje
// gången termen är
// större än noll sen delas sum/pos