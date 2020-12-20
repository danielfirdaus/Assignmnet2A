/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Danielfirdaus
 */
public class City {
    
    String name;
    double age;
    String activity;
    String places;
    String transportation;
    
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
    public void setTrans(String transportation){
        this.transportation = transportation;
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
    public String getTrans(){
        return this.transportation;
    }
}

