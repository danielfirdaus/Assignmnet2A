
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Danielfirdaus
 */
import java.util.Scanner;
public class TourGuide {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Welcome to Tour Guide system");
        System.out.println("------------------------------------------------");
        Scanner Keyboard = new Scanner(System.in);
        System.out.println("Please enter service code Adventure Guide(a) or City Guide(b): ");
        char choice = Keyboard.nextLine().charAt(0);
        System.out.println("------------------------------------------------");
        
       if( choice == 'a' || choice == 'A'){ 
        Adventure a = new Adventure();
        System.out.println(" | Welcome to Adventure Guide | ");
        System.out.println("================================");
        a.setName("Mr. Raja");
        a.setAge(33);
        a.setActivity("Trekking Guide");
        a.setPlaces("Adam's Peak (Sri Lanka)");
        System.out.println("Tour Guide Name: " + a.getName());
        System.out.println("Age: " + a.getAge());
        System.out.println("Suggestion of Activity: " + a.getActivity());
        System.out.println("Suggestion of Places: " + a.getPlaces());
       }
       else if ( choice == 'b' || choice == 'B'){
        City b = new City();
        System.out.println(" | Welcome to City Guide | ");
        System.out.println("================================");
        b.setName("Ms. Farah");
        b.setAge(25);
        b.setActivity("City Tour Guide");
        b.setPlaces("1. Visit Museum /n2. city sighseeing /n3. visit main landmarks");
        b.setTrans("Bus");
        System.out.println("Tour Guide Name: " + b.getName());
        System.out.println("Age: " + b.getAge());
        System.out.println("Suggestion of Activity: " + b.getActivity());
        System.out.println("Suggestion of Places: " + b.getPlaces());
        System.out.println("Suggestion of Transportation: " + b.getTrans());
       }
    }
    
}
