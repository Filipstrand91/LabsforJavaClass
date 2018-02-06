import java.util.Scanner;

public class Övning120 {

public static void main(String[] args)

{
	System.out.println("Skriv in starttid och sluttid (timmar och minuter):");
	Scanner scan = new Scanner(System.in);
	int startHour = scan.nextInt();
	int startMin = scan.nextInt();
	int stopHour = scan.nextInt();
	int stopMin = scan.nextInt();
	int hours = (stopHour - startHour);
	int minutes = (stopMin - startMin);
	System.out.println("Tidsavstånd i timmar:minuter: " + hours + ":" + minutes);
}
}
