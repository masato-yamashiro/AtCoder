package ABC158.stationandbus;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String S = sc.nextLine();

		if(S.equals("AAA") || S.equals("BBB")) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
	}
}