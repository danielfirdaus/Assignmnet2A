
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
        System.out.println("Please enter service code: \nAdventure Guide(a) \nCity Guide(b) \nCulture Guide(c) \nForest Guide(d) ");
        char choice = Keyboard.nextLine().charAt(0);
        System.out.println("------------------------------------------------");
        
       if( choice == 'a' || choice == 'A'){ 
        Adventure a = new Adventure();
        Adventure b = new Adventure();
        System.out.println(" | Welcome to Adventure Guide | ");
        b.PrintTour();
        System.out.println("================================");
        b.printAdventure();
        a.setActivity("Trekking Guide");
        System.out.println("Suggestion of Activity: " + a.getActivity());
        b.printPlaces();
       }
       else if( choice == 'b' || choice == 'B'){
        City b = new City();
        City c = new City();
        System.out.println(" | Welcome to City Guide | ");
        c.PrintTour();
        System.out.println("================================");
        c.printCity();
        b.setActivity("City Tour Guide");
        b.setTrans("Bus");
        System.out.println("Suggestion of Activity: " + b.getActivity());
        c.printPlaces();
        System.out.println("Suggestion of Transportation: " + b.getTrans());
       }
       else if(choice == 'c' || choice == 'C'){
        Culture a = new Culture();
        Culture b = new Culture();
        System.out.println(" | Welcome to Cultural Guide | ");
        b.PrintTour();
        System.out.println("================================");
        a.printCulture();
        b.setActivity("Culture Tour Guide");
        b.setTrans("Bus");
        System.out.println("Suggestion of Activity: " + b.getActivity());
        a.printPlaces();
        System.out.println("Suggestion of Transportation: " + b.getTrans());
       }
       else if(choice == 'd' || choice == 'C'){
        Forest a = new Forest();
        Forest b = new Forest();
        System.out.println(" | Welcome to Cultural Guide | ");
        b.PrintTour();
        System.out.println("================================");
        a.printCulture();
        b.setActivity("Forest Tour Guide");
        b.setTrans("Bus");
        System.out.println("Suggestion of Activity: " + b.getActivity());
        a.printPlaces();
        System.out.println("Suggestion of Transportation: " + b.getTrans());
       }
       }
    }
    
}
