package binarysearch;
import java.util.*;
public class BInarySearch {
    
        public static void main(String[] args) {
            Scanner in = new Scanner (System.in);
            System.out.print("Enter the size of an array: ");
            int n = in.nextInt();
            
            int[] arr=new int[n];
            System.out.println("Enter the values in the array: ");
               for (int i= 0 ; i< n; i++){
               arr[i]= in.nextInt();
               }
               System.out.print("Enter value to be searched: " );
               int num = in.nextInt();
               
               int low=0;
               int high = n-1;
               int mid= 0;
               
               while (low<= high ){
               mid= (low+high)/2;
               if (arr[mid]== num){
               System.out.println ("Value is found at index:  "+mid);
               break;
               }else if (arr[mid]> num){
                   high = mid-1;
               }else if (arr[mid]< num){
                   low = mid+1;
               }
            }
               if (low> high){
               System.out.println("Value is not found in Array");
                       }
        }
}
