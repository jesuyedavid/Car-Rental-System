/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package supreme.rentals;

/**
 *
 * @author Jesuye
 */
public class Order {
    private String cusFirstName;
    private String cusLastName;
    private String cusDrivLic;
    private String amountPaid;
    private  String pickupDate;
    private String dropoffDate;
    
    public Order(){
        
    }
    
    public void addCusFirstName(String name){
        cusFirstName=name;
    }
    
    public void addCusDrivLic(String name){
        cusDrivLic=name;
    }
    
     public void addCusLastName(String name){
        cusLastName=name;
    }
    
     
     public String getAmountPaid(){
        return amountPaid;
    }
     
     public void addAmountPaid(String name){
        amountPaid=name;
    }
     public void addPickupDate(String name){
        pickupDate=name;
    }
     
    public void addDropoffDate(String name){
        dropoffDate=name;
    }
    
  
   
    public String getCusFirstName(){
        return cusFirstName;
    }
    
    public String getCusLastName(){
        return cusLastName;
    }
    
    public String getCusDrivLic(){
        return cusDrivLic;
    }
    
    public String getPickupDate(){
        return pickupDate;
    }
    
    public String getDropoffDate(){
        return dropoffDate;
    }

}
