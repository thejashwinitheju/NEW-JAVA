//A palindrome number is a number that is same after reverse. For example 545, 151, 34543, 343, 171, 48984 are the palindrome numbers. It can also be a string like LOL, MADAM etc.

package programs;

public class palindron {
    public static void main(String[] args){
        String str="malayalam";
        String reverse="";
        int length = str.length();
        for (int i=length-1;i>=0;i--){
            reverse = reverse + str.charAt(i);
            if(str.equals(reverse)){
                System.out.println("palindrom");
            }else{
                System.out.println("NOT a palindrom");
            }
        }
        
            }
}
