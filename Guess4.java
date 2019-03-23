// Guess the letter game
class Guess4 {
   public static void main (String args[] ) 
     throws java.io.IoException {
     char ch, ignore,  answer = 'k' ;
     do {
         System.out.println("I'm thinking of a letter b/w  A & Z. ") ;
         System.out.print ("Can you guess it:");
         ch = (char) System.in.read ();
//discard any other characters in input buffer
     do {
         ignore =  (char) System.in.read();
     } while (ignore != '\n') ;
       if (ch == answer) System.out.println("**Right**");
       else {
          System.out.println("...Sorry, you're wrong.");
           //nested if
          if (ch<answer) System.out.println ("too low");
          else  System.out.println ("too high");
          System.out.println("Try again!\n");
       }
    } while (answer!=ch);
  }   
} 
            }
     }
}