import java.io.*;
import java.util.Scanner;
class Nuke2{
	//Scanner is used for parsing tokens from the contents of the stream while BufferedReader 
	//just reads the stream and does not do any special parsing.
    // In fact you can pass a BufferedReader to a scanner as the source of characters to parse.
     public static void main(String[] args) {
     	System.out.println("Please enter one line of string:");
    	Scanner sc = new Scanner(System.in);
    	if( sc.hasNextLine() ){
    		String line = sc.nextLine();
    		System.out.println(line.charAt(0) + line.substring(2));
    	}
    	System.exit(1);

   }
}
    
