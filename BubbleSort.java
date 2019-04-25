class BubbleSort {
    public static void main (String args[]) {
      int nums [ ] = {10,3,7,2,5,4,9,1,8,6 };
      int a, b , t , size =10;
      // original array
      System.out.print("Original array : ");
         for (int i=0; i < size; i++)
             System.out.print(" " + nums [i]);
       System.out.println();

    // This is the bubble sort.
    for (a=1 ; a< size ; a++) {
      for (b=size-1 ; b>=a ; b--) {
         if (nums [b-1] > nums[b] ) { 
           // exchange elements
           t = nums[b-1];
           nums[b-1] = nums [b];
           nums[b] = t;
        }
     }
   }

     //sorted array
         System.out.print ("Sorted array :");
            for (int i=0; i<size; i++)
              System.out.print(" " + nums [i]);
         System.out.println();
   }
}     