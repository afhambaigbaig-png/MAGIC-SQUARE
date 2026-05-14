import java.util.Scanner;
class main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        double [] population= new double[100];
        int count = 0;
        double sum=0;
        System.out.println("Enter the Country Population:");
        System.out.println("Enter negative value to stop");
         System.out.println("=============================");
        while (true) { 
            System.out.println("Enter the Population");
            double pop=sc.nextDouble();
            if(pop<0){
                break;
            }
            population[count]=pop;
            sum=sum+pop;
            count++;
        }
        if(count == 0){
            System.out.println("No data Entered");
            return;
        }
        double avg=sum/count;
        System.out.println("\n Average Population:"+avg);
         System.out.println("\n All Population Values");
         for(int i=0; i<count; i++){
            System.out.println(population[i]);
         }
         System.out.println("\n Population Above Averege ");
         for(int i=0; i<count; i++){
            if(population[i]>avg){
                System.out.println(population[i]);
            }
         }
        }   
    }
