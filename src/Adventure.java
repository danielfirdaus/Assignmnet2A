/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Danielfirdaus
 */
public class Adventure extends Tour {
    
    String name;
    String activity;
    String places;
    double age;
    
   Adventure(){
       this.name = "Mr.Raja";
       this.age = 33;
       this.places = "Adam's Peak (Sri Lanka)";
   }
    
   public void printAdventure(){
       
       System.out.println("Tour Guide Name: " + name);
        System.out.println("Age: " + age);
   }
   
   
    public void printPlaces(){
        System.out.println("Suggestion of Places: " + places);
    }
    
    public void setActivity(String activity){
        this.activity = activity;
    }
   
    public String getActivity(){
        return this.activity;
    }
    
}
