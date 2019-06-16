// Primitive types are passed by value.
class Test { 
   int a, b;
Test(int i, int j) {
     a = i;
     b = j;
}

void Change(Test ob)  {
   ob.a = ob.a + ob.b;
   ob.b = -ob.b;
  }
}

class PassObRef {
   public static void main (String args [] ) {
      Test ob = new Test (15, 20) ;

      int a = 15 , b = 20;
 
     System.out.println("ob.a and ob.b before call: " + ob.a + "  " + ob.b);

     ob.Change(ob);

          System.out.println("ob.a and ob.b after call: " + ob.a + "  " + ob.b);
   }
}