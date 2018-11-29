/**
 * Dylan Klingensmith
 * CH5PC6 - Population
 * AP Computer Science 
 * 11/27/18
 */

import java.util.Scanner;

public class Population {

    public static void main(String[] args) {
        
        //Establish PopulationChange object, scanner, and variables
        PopulationChange population = new PopulationChange();
        
        Scanner keyboard = new Scanner(System.in);
        
        double growth;
        int startPopulation;
        int days;
        
        //Get information from user
        System.out.println("Input the starting population. Do not input "
                + "a number less than 2.");
        startPopulation = keyboard.nextInt();
        
        while (startPopulation < 2)   {
            
            System.out.println("Do not input a number less than 2.");
            startPopulation = keyboard.nextInt();
            
        }
        
        System.out.println("Input the average daily growth (in %). Do "
                + "not input a negative number.");
        growth = keyboard.nextDouble();
        
        while (growth < 0)  {
            
            System.out.println("Do not input a negative number.");
            growth = keyboard.nextDouble();
            
        }
        
        System.out.println("Input the number of days the population "
                + "is observed. Do not input a number less than 1.");
        days = keyboard.nextInt();
        
        while (days < 1)    {
            
            System.out.println("Do not input a number less than 1.");
            days = keyboard.nextInt();
        }
        
        //Get the daily population and display to user
        System.out.println(population.showGrowth(startPopulation, growth, days));
 
    }

}
