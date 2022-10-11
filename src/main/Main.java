package main;
import java.util.Scanner;

import encoding.Encoding;
public class Main {

	public static void main(String[] args) {
		Encoding encoder = new Encoding();
		Scanner scan = new Scanner(System.in);
		
		boolean encryptionChoice = false;
		while(!encryptionChoice) {
			System.out.println("Select your encryption choice:");
			encryptionChoice = encoder.pickWhichEncode(scan.next().charAt(0));
			if(!encryptionChoice) {
				System.out.println(String.format("Sorry,{0} is not a valid choice, try again",scan.next().charAt(0)));
			}
			scan.nextLine();
		}
		
		System.out.println("Enter your String");
		String subject = scan.nextLine();
		
		System.out.println(encoder.encode(subject));
	}

}
