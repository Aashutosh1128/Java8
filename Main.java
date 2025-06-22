import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter Name of Student = ");
        String name=sc.nextLine();
        System.out.println("Please Enter Roll number of Student = ");
        int roll=sc.nextInt();
        System.out.println("Please Enter Math marks of Student = ");
        int m=sc.nextInt();
        System.out.println("Please Enter Physis of Student = ");
        int p=sc.nextInt();
        System.out.println("Please Enter Chemistry of Student = ");
        int c=sc.nextInt();

        TotalAndAvg rahul=new TotalAndAvg(roll,name,m,p,c);
         rahul.dispalyRes();


    }

}
