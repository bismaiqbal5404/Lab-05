
package group.lab_05_ex_04;

public class Lab_05_Ex_04 {
   
    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        int num = 10;
        System.out.println("Fibonacci Sequence up to " + num + " terms:");

       
        for (int i = 1; i < num; i++) { 
            System.out.println( fib(i));
        }
    }
}
