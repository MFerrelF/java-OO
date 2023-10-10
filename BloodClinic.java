package ObjectOriented;
import java.util.*;
/**
 * This is the data class of the Blood Clinic Program.
 * 
 * The method public bloodClinic() enable the variables. The program requests the user to input their first name, last name, 1- donating and 2- receiving (if a wrong input
 * is applied a loop should activate preventing the user to provide a wrong value) and blood type (also a loop is applied).
 *
 * The method public void displayChoice() enables the user to input data to the program.
 * 
 * @param firstName value of the user input for First Name;
 * @param lastName value of the user input for Last Name;
 * @param choice value of the user input for giving or receiving blood;
 * @param bloodtype value of the user input for their blood type;
 * @param bTypeArray array created in order to compare with the user input and limit their choice;
 * @return firsName returns the value of firstName;
 * @return lastName returns the value of lastName;
 * @return choice returns the value of choice;
 * @return bloodtype returns the value of bloodtype;
 * @return bTypeArray returns the value of bTypeArray;
 * 
 * @author (Marcos Ferrel Fonseca - 71094)
 * @version (09/04/2023)
 */

public class BloodClinic {
Scanner kb = new Scanner(System.in);
    
    private String firstName, lastName, choice, bloodtype;
    private String[] bTypeArray;        
    
    public BloodClinic(){
        this.firstName = firstName;
        this.lastName = lastName;
        this.choice = choice;
        this.bTypeArray = bTypeArray;
        this.bloodtype = bloodtype;        
    }
    
    public void displayChoice(){
        System.out.println("Welcome to our Blood Clinic!");
        System.out.println(" ========================================================================= ");
                
        System.out.println("Please insert your first name: ");
        firstName = kb.nextLine();
        System.out.println(" ");
        
        System.out.println("Please insert your last name: ");
        lastName = kb.nextLine();
        System.out.println(" ========================================================================= ");        
        
        System.out.println("Are you looking for information about donating or receiving blood?"); 
        
        System.out.println(" ");
       
        System.out.println("1- Donating."); 
        System.out.println("2- Receiving.");        
        choice = kb.nextLine();      
        
        while (!choice.equals("1") && !choice.equals("2")){
            System.out.println(" ");
            System.out.println("Incorrect choice!!! Please, choose between 1 for Giving or 2 for Receiving: ");
            choice = kb.nextLine();
        }
        
        System.out.println(" ");
        
        String[] bTypeArray = {"A+","B+","O+","AB+","A-","B-","AB-","O-"};        
            
        System.out.println("Please, input your blood type: "); 
        bloodtype = kb.nextLine();
        
        boolean check = true;// Flag boolean triggering the while loop;
      
        while(true){
            for(String i : bTypeArray){// For loop will run through the array;
                if(bloodtype.equalsIgnoreCase(i)){
                    check = false;// if a valid value is inputed the boolean will become false allowing the user to flee from the loop;
                    break;
                }
            }
            if(check){//else if the user inputs a wrong value the loop will continue;
                System.out.println(" ");
                System.out.println("Invalid blood type!!! Please, choose the correct blood type: ");
                bloodtype = kb.nextLine();
                continue;
            }
            break;
        }
        
        System.out.println(" ========================================================================= ");
    }
    
	    String getFirstName(){
	        return firstName;
	    }
	    
	    String getLastName(){
	        return lastName;
	    }
	    
	    String getChoice(){
	        return choice;
	    }
	    
	    String getBType(){
	        return bloodtype;
	    }
	    
	    String[] getBTypeArray(){
	        return bTypeArray;
	    }
}