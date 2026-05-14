import java.util.Scanner;
class main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Original Price:");
        double op=sc.nextDouble();
        System.out.println("Enter the Discount Price:");
        double  dp=sc.nextDouble();
        double Discount= op*dp/100;
        double dsp=op-Discount;
       System.out.println("Final Price");
         System.out.println(dsp);

    }
}