package ObjectOriented;
/**
 * This class provides the output if the user has chosen the option of receiving blood.
 * 
 * The method public void displayResult2(String bloodtype) display the output depending on the users blood type input.
 * 
 * @param bloodtype the value of the user input for blood type.
 *
 * @author (Marcos Ferrel Fonseca - 71094)
 * @version (09/04/2023)
 */

public class ReceivingBlood {
String bloodtype;
    
    public void displayResult2(String bloodtype){
        if (bloodtype.equalsIgnoreCase ("A+")){
            System.out.println("A+, A-, O+ or 0-."); 
        }
        else if (bloodtype.equalsIgnoreCase ("O+")){
            System.out.println("O+ or O-.");
        }
        else if (bloodtype.equalsIgnoreCase ("B+")){
            System.out.println("B+, B-, O+ or O-.");
        }
        else if (bloodtype.equalsIgnoreCase ("AB+")){
            System.out.println("All types of blood supported.");
        }
        else if (bloodtype.equalsIgnoreCase ("A-")){
            System.out.println("A- or O-.");
        }
        else if (bloodtype.equalsIgnoreCase ("O-")){
            System.out.println("O-.");
        }
        else if (bloodtype.equalsIgnoreCase ("B-")){
            System.out.println("B- or O-.");
        }
        else if (bloodtype.equalsIgnoreCase ("AB-")){
            System.out.println("AB-, A-, B- or O-.");
        }
    }    
}