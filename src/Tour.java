/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Danielfirdaus
 */
public class Tour {
    String welcome;
    String phone;
    
Tour(){
    this.welcome = "Welcome to Tour Guide System";
    this.phone = "012-2525171";
}

public void PrintTour(){
    
    Tour n1 = new Tour();
    
    System.out.println(n1.welcome);
    System.out.println("H/P  : " + n1.phone);
}
}
