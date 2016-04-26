/*
 Design and implement an application that 
 reads a number of integers that are in the range 0 to 50 inclusive 
 and counts how many times each one is entered. 
 After all input has been processed, 
 print all of the values with the number of times each one was entered.
 */
 
import java.util.Scanner;


class ZeroFiftyCount {

    public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    
    int num;
    
    boolean goon = true;
    
    int[] arr = new int[51];
    
    System.out.println("Enter numbers");
    
    
    do {
    
    num = in.nextInt();
    
    if(num != 99){
    arr[num]++;
    }
    if(num == 99){
       goon = false;
    }
    
    }while(goon == true);
     
    for(int i=0; i <= 50; i++) {
    
       System.out.println(i + " was entered a total of " + arr[i] + " times");

    }    
    
  }

}