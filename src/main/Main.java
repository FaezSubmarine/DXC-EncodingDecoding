package main;
import java.util.Scanner;

import encoding.Encoding;
import encoding.Decoding;
public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("would you like to encode or decode?");
		if(Character.toLowerCase(scan.next().charAt(0))=='d') {
			scan.nextLine();
			decodeChoice(scan);
		}
		else {
			scan.nextLine();
			encodeChoice(scan);
		}
		
	}
	static void decodeChoice(Scanner scan) {
		Decoding decoder = new Decoding();
		System.out.println("Enter your String");
		String subject = scan.nextLine();
		
		System.out.println(decoder.decode(subject));
		
	}
	
	static void encodeChoice(Scanner scan) {
		Encoding encoder = new Encoding();
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
