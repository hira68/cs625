// Guess the letter game
class Guess {
   public static void main (String args[] ) 
     throws java.io.IoException {
     char ch, answer = 'k' ;
     System.out.println("I'm thinking of a letter b/w A & Z. ") ;
     System.out.print ("Can you guess it:");
     ch = (char) System.in.read ();
     if (ch == answer) System.out.println("**Right**");
     else System.out.println("...Sorry, you're wrong.");
     }
}