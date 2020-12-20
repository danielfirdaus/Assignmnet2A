/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Danielfirdaus
 */
public class Adventure {
    
    String name;
    String activity;
    String places;
    double age;
    
    public void setName(String name){
        this.name = name;
    }
    public void setAge(double age){
        this.age = age;
    }
    public void setActivity(String activity){
        this.activity = activity;
    }
    public void setPlaces(String places){
        this.places = places;
    }
    
    public String getName(){
        return this.name;
    }
    public double getAge(){
        return this.age;
    }
    public String getActivity(){
        return this.activity;
    }
    public String getPlaces(){
        return this.places;
    }
}
