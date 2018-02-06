import java.util.Scanner;

public class Öv109 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		int e = c + d - (a + b);
		c = c + 2;
		a = (2 * e + c) / 4;
		System.out.println(a + " " + b + " " + c + " " + d + " " + e);

	}

}
