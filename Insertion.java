
package insertion;
public class Insertion {
    public static void main(String[] args) {
 int[] num= { 1,4,2,9,3,8,5};
   System.out.println("Before insertion sort:");   
   for (int element: num) {
            System.out.print(" "+element);  
    }
  sort (num);
  printArray(num);
    }
    
    public static int[] sort (int[]A){
    for (int i= 1; i< A.length; i++){
        int key= A[i];
        int j= i-1;
    
        while(j>=0 && A[j]>key){
            A[j+1]= A[j];
            j--;
        }
        A[j+1]=key ;
    }
    return A;
    }
    
    public static void printArray(int[]A){
          System.out.println("");
       System.out.println("After insertion sort:");
        for (int i = 0; i<A.length; i++)  
     System.out.print(" "+A[i]);
     }
}

