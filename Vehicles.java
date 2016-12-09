/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package supreme.rentals;

/**
 *
 * @author Jesuye
 */
public class Vehicles {
       public String make;
       public String model;
       public String color;
       public String year;
       public boolean automaticGearbox;
       public boolean airConditioner;
       public int numberSeats;
       public int dailyPrice;
       public String vehiID;
    
    public Vehicles(){
        
    }  
   
    public String getMake(){
        return make;
    }
    
    public String getModel(){
        return model;
    }
    
    public boolean getAutomaticGearbox(){
        return automaticGearbox;
    }
    
    public boolean getAirConditioner(){
        return airConditioner;
    }
    
    public int getNumberSeats(){
        return numberSeats;
    }
    
    public int getDailyPrice(){
        return dailyPrice;
    }
}
