
/**
 * Write a description of class TMSimulator here.
 * A turing machine simulator fpr binary palindrome
 *
 * @author: Brandon Ozsahin
 * @version (a version number or a date)
 */
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.text.*;
public class TMSimulator
{  

   public static boolean validate( char array[] , int start , int end)
   {
     boolean valid;
     /* if(start == end) // error is around this avenue (it cannot differenciate right from wrongmaybe need an else?)
      {
         return true; 
          
        }
      */

      
      
      
          System.out.println(array[start]);
            //System.out.println("fodder");

           if ( array[start] == array[end])
           {
              
               if(array.length % 2 == 1 && (int)array.length/2 == start)
               {
                   System.out.println(array[start++]);
                }
                else if(array.length % 2 == 0 && (int)array.length/2 == start)
                {
                
                    System.out.println(array[start++]);
                }

                else
  
                {
                    
               if(!(validate(array,start+1, end - 1)))
               {
                return false;
               }
               
            }
            }
            else
            {
                  System.out.println(array[end]);
              return false; 
 
            }
             System.out.println(array[end]);

           return true;
        
    
    }
    
    
  public static void main(String[] args)
  {
     System.out.println("Enter Binary Palindrome onto the tape: ");
     Scanner s = new Scanner(System.in); // user input
     String tape = s.nextLine(); // tape will be whatever user input is
    // String Revtape = ""; // empty string of reverse tape (DUD useless)
     char[] tapelength=tape.toCharArray();
     boolean i;
     i = validate(tapelength,0, tapelength.length-1);
     System.out.println(i);
     
     if( i == true)
     {
         System.out.println("Accepted "+ tape + " is a palindrome"); // basic if else to printout if its a valid palindrome accepted by a turing machine or not.
        }
         else
        {
            System.out.println("Rejected");
        }
     //int tapelength = tape.length(); // variable tapelength is the size of string input from tape
     
     /*for(int o = tapelength.length - 1; o >=0; o--) // for loop initializes i into the size of tape length and subtracts it by 1 each iteration
     {
        //Revtape = Revtape + tape.charAt(i); // Revtape is the reverse of tape taking on the palindrome of the input string
        Revtape =Revtape+tapelength[o];
        System.out.println(Revtape);
       

        }
     

     if(tape.equals(Revtape))
     {
         System.out.println("Accepted "+ tape + " is a palindrome"); // basic if else to printout if its a valid palindrome accepted by a turing machine or not.
        }
        else 
        {
            System.out.println("Rejected");
        }*/

  }
}
