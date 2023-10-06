//An Armstrong number is a positive m-digit number that is equal to the sum of the mth powers of their digits.

package programs;

import java.util.Scanner;

public class amrstrong {
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        int backUP = num;
        int sum = 0;

        while(num>0){
            sum = sum + (num%10)*(num%10)*(num%10);
            num = num/10;
        }
        if(sum==backUP){
            System.out.println("Amrstrong");
        }else{
            System.out.println("NOT Amrstrong");
        }
    }

}