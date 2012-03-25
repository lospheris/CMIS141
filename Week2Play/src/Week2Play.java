/*******************************************************************
 * File Name  : Week2Play.Java
 * Course Name: UMUC - CMIS 141
 * Date    :
 * Compiler   : JDK 6
 * IDE        : Eclipse Juno 4.2.0
 * @author Dell-Ray Sackett
 *
 * Program Description:
 		This program is to practice things that I learn during the course of week 2 of the class.
 * Testing: Tested the program using ...
  		Display obtained with testing:
 ********************************************************************/

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Week2Play
{
	public static void main(String[] args)
	{
		// Play with displaying some Unicode and JOptionPane
		JOptionPane.showMessageDialog(null, "\u6B22\u8FCE \u03b1 \u303b2 \u03b3", "\u6B22\u8FCE Welcome", JOptionPane.INFORMATION_MESSAGE);
		
		// Escape sequences
		System.out.println("\"Double Quote\" \'Single Quote\' LineBack Space\b Tab\t Linefeed\n Formfeed \f Carriage return \r Backslash\\");
		
		// I think for fun what we will do next is play with char/byte/ints and the ++ operator
		int i = (int)'A'; // the first letter of the alphabet (caps)
		System.out.println((char)i);
		i++;
		System.out.println((char)i);
		// Give me a for or while loop and I could print you the alphabet with 5 lines of code.
		
		// String concatenation
		String myFirstString = "This is my";
		myFirstString += " first String!";
		System.out.println(myFirstString);
		
		// get some scanner input, this was worked in week 1 but I am doing it again here for practice.
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a mutli word string");
		String s1 = input.next();
		System.out.println("The Scanner.next() method was used to get your string all that was returned was " + s1);
		System.out.println("Enter more text");
		String s2 = input.nextLine();
		System.out.println("The Scanner.nextLine() method was used this time so everything in the buffer before the enter button was pressed (carriage return) is returned");
		System.out.println("you entered: " + s2);
		// the book explicitly states not to use nextLine() after nextByte(), nextShort(), nextInt(), nextLong(), nextFloat(), nextDouble(), or next()
		// So i did it to see what happenes.
		System.out.println("The result of using nextLine() after next() (explicitly prohibited by the book) seems to be that");
		System.out.println("the carriage return from the previous method is still in the input buffer so you never get the chance");
		System.out.println("to enter any more text because the nextLine() method reaches the already stored carriage return and quits");
		System.out.println("only returning the information stored in the buffer before the nextLine() was called.");
		
		// Time to play with some string formatting
		System.out.printf("%s\t\t%s\t\t%s\n", "Oneasd", "Two", "Three"); // no new line unless you use a \n
		System.out.printf("%s\t\t%s\t\t%s", "One", "Two", "Three"); // test out the tab alignment
		System.out.println("Test for newline");
		// The tabs align to each other as long as the text doesn't bust the tab barrier
		
		// Test out the confirm dialog
		/*int option = JOptionPane.showConfirmDialog(null, "Continue");
		System.out.println(option);
		option = JOptionPane.showConfirmDialog(null, "more");
		System.out.println(option);
		option = JOptionPane.showConfirmDialog(null, "finally");
		System.out.println(option);*/
		// now that I found out what the return values are lets ad a little logic
		dialogTest(JOptionPane.showConfirmDialog(null, "Continue"));
		dialogTest(JOptionPane.showConfirmDialog(null, "More"));
		dialogTest(JOptionPane.showConfirmDialog(null, "Finally"));
		dialogTest(5);
		
	}
	
	// Handles what happens when a JOptionPane.showConfirmDialog() is used.
	// All it does now is show what option you chose. I chose to write a method here so I didn't have to use
	// a switch/case combo for each of the calls.
	public static void dialogTest(int option)
	{
		switch(option)
		{
		case(0):
			System.out.println("You chose Yes!");
			break;
		case(1):
			System.out.println("You chose No!");
			break;
		case(2):
			System.out.println("You chose Cancel!");
			break;
		default:
			System.out.println("Invalid Input!");
			break;
			
		}
	}
}