/*
 * PopulationChange Class
 */


public class PopulationChange {
    
    //Establish attributes
    private int startingPopulation;
    private double averageDailyIncrease;
    private int numberOfDays;
    
    //The ShowGrowth method accepts arguments for the starting population,
    //average daily increase (%), and the number of days the growth is 
    //recorded, and returns the daily population
    public String showGrowth(int sp, double adi, int nd)    {
        
        startingPopulation = sp;
        averageDailyIncrease = adi;
        numberOfDays = nd;
        
        String returnMessage = "";
        
        int population = startingPopulation;
        double change = adi/100;
        int dailyGrowth;
        int dailyPopulation;
        
        for (int x = 1; x <= numberOfDays; x++)  {
            
            dailyGrowth = (int) (population * change);
            population += dailyGrowth;
            
            returnMessage += "Day " + x + ":\t " + population + "\n";
            
            
        }
        
        return returnMessage;
           
    }
    
    
}
