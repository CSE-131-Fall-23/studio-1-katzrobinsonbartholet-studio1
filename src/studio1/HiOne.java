package studio1;

import java.util.Scanner;

public class HiOne {

	/**
	 * Says hello to the supplied argument
	 */
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("What is your name?");
		String name = in.nextLine();
		//
		// Below this line, enter code so that this program's output says
		//      Hi, Bob.  How are you?
		// if the value of name is "Bob"
		//
		System.out.print("Hi " + name + ", how are you?");
	}

}
