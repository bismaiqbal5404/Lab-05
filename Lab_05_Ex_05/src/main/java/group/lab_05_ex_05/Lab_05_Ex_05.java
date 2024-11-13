package group.lab_05_ex_05;

import java.util.Scanner;

public class Lab_05_Ex_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int weeklyTotalMinutes = 0;

        while (true) {
            System.out.println("Enter task duration in minutes (or type -1 to finish):");
            int taskMinutes = scanner.nextInt();

            if (taskMinutes == -1) break;

            if (taskMinutes > 0) {
                weeklyTotalMinutes += taskMinutes;
                System.out.println("Task added! Total time so far: " + weeklyTotalMinutes + " minutes.\n");
            } else {
                System.out.println("Please enter a positive number.");
            }
        }

        int totalHours = weeklyTotalMinutes / 60;
        int totalMinutes = weeklyTotalMinutes % 60;

        System.out.println("\nTotal time this week: " + totalHours + " hours and " + totalMinutes + " minutes.");

        if (totalHours < 40) {
            System.out.println("Warning: Less than 40 hours logged this week.");
        }

        scanner.close();
    }
}
