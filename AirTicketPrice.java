import java.util.Scanner;



public class AirTicketPrice{

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double distance;
        int age, ticket; 
        
        
        
        System.out.println("Please write the distance in km: ");
        distance=input.nextDouble();
        System.out.println("Please write your age:  ");
        age=input.nextInt();
        System.out.println("Please select your ticket type : 1. one way and 2. round-trip ");
        ticket=input.nextInt();

        double totalFee;
        totalFee= distance*0.10;
        
        if(distance>0 && ticket<3){
            if(age<12){
                 totalFee=totalFee*0.5;
            }
             else if(12>=age && age<=24){
                totalFee = totalFee;
            }    
            else if(age>65){
                totalFee=totalFee*0.7;
            }    
            else{
                totalFee=totalFee;
            }
            if(ticket==2){
                totalFee=totalFee*0.8;
            }   
            else{
                totalFee=totalFee;
            }
        }

        System.out.println("The final price you must pay is: "+totalFee+"$");








    }
}