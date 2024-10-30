/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poepart1;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author RC_Student_lab
 */
public class PoePart1 {

    public static void main(String[] args) {
        //condition 1 = username contains underscore and is no more than 5 characters
        /*condition 2 = password is up to 8 characters long
        contains a capital letter
        contains a number
        contains a special character
        */
        
        
      //access the sub classes
    UsersAuthentification create_user = new UsersAuthentification();
    Task create_task = new Task();
    
   
      
    Scanner obj = new Scanner(System.in);
    
    //declarations
    String username ;
    String password;
    String firstname = null;
    String lastname = null ;
   

   
    
    
    //use if statements to make sure that the user is properly logged in
    boolean exit = false;
    
    while(!exit)
        {
            
            //ask the user to select an option
                    
            String[] options = {"Register", "Login", "Exit"};
            int option = JOptionPane.showOptionDialog(
            null,
            "Choose an option",
            "UserAuthentification",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.INFORMATION_MESSAGE,
            null,
            options,
            options[0]
            );
            
            
        //provide options and highlight the user choice
            if (option == 0)
            {
                //prompt the user to enter their name
                firstname = JOptionPane.showInputDialog("Enter your firstname");
                 
                  //prompt the user to enter their lastname
                lastname = JOptionPane.showInputDialog("Enter your lastname");
                
                //prompt the user to enter their username
                username = JOptionPane.showInputDialog("Enter your username");
                 //prompt the user to enter their password
                 
               password = JOptionPane.showInputDialog("Enter your password");
              
               //method checks if registration verification is correct
              boolean usernameCorrect =  create_user.CheckUserName(username);
              boolean passwordCorrect = create_user.CheckPasswordComplexity(password);
                
                if(usernameCorrect && passwordCorrect){
                    create_user.LoginUser(firstname, lastname);
                    
                    //return message if the verication if correct
                    JOptionPane.showInternalMessageDialog(null,"Registration is successful");
                }else{
                            JOptionPane.showMessageDialog(null, "Registration is unsuccessful. Please check username and password requirements.");
                            }
                }
            else if(option == 1)
            {
                 //propmt the user to enter their login details
                username = JOptionPane.showInputDialog("Enter your username");
                
                password = JOptionPane.showInputDialog("Enter your password");
               
                //method verifies the login details
               boolean CheckUserName= create_user.CheckUserName(username);
               boolean CheckPasswordComplexity = create_user.CheckPasswordComplexity(password);
                
                //use an if statement to validate the login details
                if(CheckUserName && CheckPasswordComplexity){
                  create_user.LoginUser( firstname  ,  lastname);
                  
                 
                //return these staments if login is true  
                JOptionPane.showMessageDialog(null, "A successful login");
                boolean loggedIn = true;
                // Once logged in display the task options
         
                     // display welocme message
        JOptionPane.showMessageDialog(null, "=================\nWelcome to EasyKanban\n================="
                + "==============", "Welcome", JOptionPane.INFORMATION_MESSAGE);
        
                
                
        while(loggedIn){
        
        //menu options
        String[] taskOptions = {
            "Add tasks",
            "Show report",
            "Get Total Hours",
            "Quit"       
        };
        //provide options and highlight the user choice
        
        option = JOptionPane.showOptionDialog(
                  null,
                "PLEASE CHOOSE FROM THE OPTIONS",
                "EasyKanban",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                null,
                taskOptions,
                   taskOptions[0] 
        );
        // user selection
        switch(option){
            case 0: 
                //call the add tasks method 
               create_task.AddTasks();
               
                break;
            case 1:
             //show ths message when option is selected
                JOptionPane.showInternalMessageDialog(null, "Feature coming soon!!");
                break;
            
            case 2:
                //call the total hours method to calculate hours
                int totalHours = create_task.GetTotalHours();
            JOptionPane.showMessageDialog(null, "Total task hours: " + totalHours, "Total Hours", JOptionPane.INFORMATION_MESSAGE);
                break;
                
           
            case 3:
                loggedIn = false;
                //display message as user exits the application
                JOptionPane.showMessageDialog(null, " Thank you for using EasyKanban.Leaving the application","Exit", JOptionPane.INFORMATION_MESSAGE);
                break;
            default:
                JOptionPane.showMessageDialog(null,"Invalid option, please choose again.", "Error", JOptionPane.ERROR_MESSAGE);
                break;
        }
        
       }
        
                                 
        
    }else{
                    JOptionPane.showMessageDialog(null,"Failed login. Username or password is incorrect.");
                }
            }else if (option ==2){
                        exit = true;
                        
                       
                        
                        }else{
                        JOptionPane.showMessageDialog(null,"Invalid option, please try again.","Exit", JOptionPane.ERROR_MESSAGE);
                        }
            }    
     
        }
        }
    
    
    
    
    
    
    
    
    
    
        
      
        
        

         
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
            
       
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
        
        
        
        
        
        
        
    
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   
    
   
    
    
     
    
      
      
           
            
            
        
            
        
       
       
        
      
        
        
        
        
        
        
        
        
       
        
        
        
       
        
        
            
   
    








