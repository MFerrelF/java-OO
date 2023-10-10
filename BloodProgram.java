package ObjectOriented;
/**
 * This is the main class of the Blood Clinic Program.
 * 
 * The main method calls for information from the variables of the class bloodClinic provided by the user's input. Then calls from two other classes the output depending on the
 * users input.
 * 
 * @param myProgram.displayChoice() enables the user to input data;
 * @param fName call the value of method getFirstName from the class bloodClinic;
 * @param lName call the value of method getLastName from the class bloodClinic;
 * @param choice call the value of method getChoice from the class bloodClinic;
 * @param bloodtype call the value of method getBType from the class bloodClinic;
 * @param bTypeArray call the value of method getBTypeArray from the class bloodClinic;
 * @cond choice.equals("1") call the output if the user has selected the option 1 from the class bloodClinic;
 * @cond choice.equals("2") call the output if the user has selected the option 2 from the class bloodClinic;
 *
 * @author (Marcos Ferrel Fonseca - 71094)
 * @version (09/04/2023)
 */

public class BloodProgram {
	public static void main(String[] args){
        BloodClinic myProgram = new BloodClinic();
        myProgram.displayChoice();
        String fName = myProgram.getFirstName();
        String lName = myProgram.getLastName();
        String choice = myProgram.getChoice();
        String bloodtype = myProgram.getBType();
        
        
        if (choice.equals("1")){
            GivingBlood checkResult = new GivingBlood();
            System.out.println("Hello "+fName+" "+lName+",");
            System.out.print("You can donate blood to the following blood types: ");
            checkResult.displayResult(bloodtype);
            System.out.println(" ========================================================================= ");
        }
        else if (choice.equals("2")){
            ReceivingBlood checkResult = new ReceivingBlood();
            System.out.println("Hello "+fName+" "+lName+",");
            System.out.print("You can receive blood from the following blood types: ");
            checkResult.displayResult2(bloodtype);
            System.out.println(" ========================================================================= ");
        }    
    }  
}