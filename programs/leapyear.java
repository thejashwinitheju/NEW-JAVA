//A leap year, also known as a bissextile or intercalary year, contains 1 more additional day (a total of 366 days) as compare to other years.

package programs;

public class leapyear {
    public static void main(String[] args){
        int year = 2024;
        if((year%4==0)&&(year%100!=0)||(year%400==0)){
            System.out.println("leap year");
        }else{
            System.out.println("not leap year");
        }
    }
}
