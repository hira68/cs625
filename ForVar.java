// Declare loop control variable inside for.
class ForVar {
   public static void main (String args[]) {
     int sum=0,fact=1;
//compute the factorial of numbers
     for(int i =1, i<=5; i++) {
       sum +=i;
       fact  *=i;
     }
     System.out.println("Sum is " + sum);
     System.out.println("Factorial is " + fact);
   }
}