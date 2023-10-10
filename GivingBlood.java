package ObjectOriented;
/**
 * This class provides the output if the user has chosen the option of donating blood.
 * 
 * The method public void displayResult(String bloodtype) display the output depending on the users blood type input.
 * 
 * @param bloodtype the value of the user input for blood type.
 *
 * @author (Marcos Ferrel Fonseca - 71094)
 * @version (09/04/2023)
 */

public class GivingBlood {
String bloodtype;            
    
    public void displayResult(String bloodtype){
        if (bloodtype.equalsIgnoreCase ("A+")){
            System.out.println("A+ or AB+."); 
        }
        else if (bloodtype.equalsIgnoreCase ("O+")){
            System.out.println("O+, A+, B+ or AB+.");
        }
        else if (bloodtype.equalsIgnoreCase ("B+")){
            System.out.println("B+ or AB+.");
        }
        else if (bloodtype.equalsIgnoreCase ("AB+")){
            System.out.println("AB+.");
        }
        else if (bloodtype.equalsIgnoreCase ("A-")){
            System.out.println("A+, A-, AB+ or AB-.");
        }
        else if (bloodtype.equalsIgnoreCase ("O-")){
            System.out.println("All types of blood supported.");
        }
        else if (bloodtype.equalsIgnoreCase ("B-")){
            System.out.println("B+, B-, AB+ or AB-.");
        }
        else if (bloodtype.equalsIgnoreCase ("AB-")){
            System.out.println("AB+ or AB-.");
        }
    }    
}