/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Danielfirdaus
 */
public class Culture extends Tour {
    String name;
    double age;
    String activity;
    String places;
    String transportation;
    
    Culture(){
        this.name = "Ms.Gaya";
        this.age = 29;
        this.places = "\n1. Craft Museum \n2. Traditional Culinary Institution \n3. Culture Expo";
    }
    
    public void printCulture(){
        
        System.out.println("Tour Guide Name: " + name);
        System.out.println("Age: " + age);
    }
    
   public void printPlaces(){
       System.out.println("Suggestion of Places: " + places);
   }
    public void setActivity(String activity){
        this.activity = activity;
    }
    
    public void setTrans(String transportation){
        this.transportation = transportation;
    }
    
   
    public String getActivity(){
        return this.activity;
    }
    
    public String getTrans(){
        return this.transportation;
    }
}

