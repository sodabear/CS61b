/* OpenCommercial.java */

import java.net.*;
import java.io.*;

/**  A class that provides a main function to read five lines of a commercial
 *   Web page and print them in reverse order, given the name of a company.
 */

class OpenCommercial {

  /** Prompts the user for the name X of a company (a single string), opens
   *  the Web site corresponding to www.X.com, and prints the first five lines
   *  of the Web page in reverse order.
   *  @param arg is not used.
   *  @exception Exception thrown if there are any problems parsing the 
   *             user's input or opening the connection.
   */
  public static void main(String[] arg) throws Exception {

    BufferedReader keyboard;
    String inputLine;

    keyboard = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Please enter the name of a company (without spaces): ");
    System.out.flush();        /* Make sure the line is printed immediately. */
    inputLine = keyboard.readLine();
    URL company = new URL("http://www." + inputLine + ".com");
    //URLConnection myURLConnection = company.openConnection();
    //myURLConnection.connect();
    BufferedReader in = new BufferedReader(new InputStreamReader(company.openStream()));

    //print first 5 Line
    String inputLine_web;
    int counter = 5;
    while((inputLine_web = in.readLine()) != null && counter >0){
      System.out.println(inputLine_web);
      counter--; 
      
    }
    //Print first 5 Line in reverse order
    // String[] lines = new String[5];
    // for (int i = 0; i < 5; i++)
    //     lines[i] = in.readLine();
    // for (int i = 4; i >= 0; i--)
    //     System.out.println(lines[i]);

    /* Replace this comment with your solution.  */

  }
}
