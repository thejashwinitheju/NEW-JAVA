 //Prime number is a number that is greater than 1 and divided by 1 or itself only.

 package programs;
 public class prime{
    public static void main(String[] args){
        for (int i=2;i<=100;i++){
            boolean isprime = true;

            for(int j=2; j<i ;j++){
                if(i%j==0){
                    isprime = false;
                    break;
                }
            }
            if(isprime){
                System.out.print( i +" , ");
            }
        }
    }
 }