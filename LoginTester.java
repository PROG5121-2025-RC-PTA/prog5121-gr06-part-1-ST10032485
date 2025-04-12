/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Assignmenr_1;
import java.util.Scanner;

public class LoginTester {

    public static void main(String[] args) {
       
       Scanner input = new Scanner (System.in);// Create and instantiate Scanner object
       String firstname,lastname,username,password,phone;//Declare user inputs
      
       //Prompt and Receiving user inputs
       
       System.out.println("******REGISTER******");
       System.out.print("Enter firstname: ");
       firstname = input.nextLine();
       System.out.print("Enter lastname: ");
       lastname = input.nextLine();
       System.out.print("Enter username: ");
       username = input.nextLine();
       System.out.print("Enter password: ");
       password = input.nextLine();
       System.out.print("Enter phone number( starting with South African international code (+27)): ");
       phone = input.nextLine();
         
       Login login = new Login();//Create and instantiate Login object
       
       boolean validatePhone = login.checkCellPhoneNumber(phone);
       boolean validateUsername = login.checkUserName(username);
       boolean validatePassword = login.checkPasswordComplexity(password);
       
       //Checks and validate user name
       if (validateUsername == true){
           System.out.println("Username successfully captured.");
       }else{
           System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than five characters in length. ");
       }
       
       //Checks and validate password
       if (validatePassword == true){
           System.out.println("Password successsfully captured.");
       }else{
           System.out.println("Password is not correctly formated, please ensure that the password contains at least eight characters, a capital and small letter, a number, and a specila character. ");
       }
       
       // Checks and validate phone number
       if (validatePhone == true){
           System.out.println("Cell phone number successfully added.");
       }else{
           System.out.println("Cell phone number incorrectly formatted or does not contain international code.");
       } 
       
       if (validatePhone == true && validateUsername == true && validatePassword == true){
           System.out.println("User is successfully registered");
           String loginUsername;
           String loginPassword;
       
           System.out.println("*******LOGIN************");
      
           System.out.println("Enter username: ");
           loginUsername = input.nextLine();
           System.out.println("Enter password: ");
           loginPassword = input.nextLine();
           
           if(loginUsername.equals(username)&& loginPassword.equals(password)){
               System.out.println("Welcome" + firstname +"," + lastname+ "it is great to see you again.");
           }else{
               System.out.println("incorrect username or password please try again");
           }    
       }else{
           System.out.println("Failed to registrater");
           main(null);
          
       }
    }
}
  
       