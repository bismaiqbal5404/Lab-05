

package group.lab_05_ex_01;
import java.util.Scanner;

public class Lab_05_Ex_01 {
    
public static int calculatePrimeCalories(int input) {
   int  sum=0;
    for(int i=2;i<input;i++){
        if(isPrime(i)){
            sum +=i;
            
        }
    }
    return sum;
}
  private static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

  
    public static int calculateOddCalories(int input) {
        int sum = 0;
        for (int i = 1; i < input; i += 2) {
            sum += i;
        }
        return sum;
    }

  
    public static int calculateEvenCalories(int input) {
        int sum = 0;
        for (int i = 2; i < input; i += 2) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Enter workout duration (or a negative number to exit): ");
            int input = scanner.nextInt();
            
            if (input < 0) {
                System.out.println("Exiting the app. Have a great day!");
                break;
            }
            
            int primeCalories = calculatePrimeCalories(input);
            int oddCalories = calculateOddCalories(input);
            int evenCalories = calculateEvenCalories(input);
            
            System.out.println("Calories burned from prime numbers: " + primeCalories);
            System.out.println("Calories burned from odd numbers: " + oddCalories);
            System.out.println("Calories burned from even numbers: " + evenCalories);
            System.out.println("=================================");
        }
        
        scanner.close();
    }
}      
        
        
      

