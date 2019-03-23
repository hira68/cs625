// Read a character from the keyboard.
class KbIn {
 public static void main (String args[] )
   throws java.io.IoException {
   char ch;
   System.out.print ("press a key followed by enter :);
   ch = (char) System.in.read();
   System.out.println("your key is :" + ch);
   }
}