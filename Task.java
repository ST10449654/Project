/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poepart1;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author RC_Student_lab
 */
 class Task {
     
 
 
 private ArrayList<Task> tasks = new ArrayList();
    
 private String taskName;
 private int  taskNumber;
 private String description;        
 private String DeveloperDetails; 
 private int duration; //in hours
 private int Id;//task id
 private String status; // to-do, doing, done
 private int taskCounter = 0;
 
 

 //method that allows users to add their tasks
   public void AddTasks(){
       
       boolean CarryOnAdding = true;
       
       //prompt user to enter the number of tasks
       int taskNumber;
       try{
        taskNumber    = Integer.parseInt(JOptionPane.showInputDialog("Enter the amount of tasks you wish to create"));
       }catch(NumberFormatException e){
           JOptionPane.showInputDialog(null, "Please enter a valid number of the amount of tasks you wish to create.");
           return;
       }
               
       while(CarryOnAdding){
       taskNumber = tasks.size();
               
      // gather more details from user
      
       taskName = JOptionPane.showInputDialog("Enter the task name");
       if(taskName ==null && taskName.isEmpty()){
           JOptionPane.showInputDialog("Task name cannot be empty.");
           continue;
       }
       
        String description= JOptionPane.showInputDialog("Enter task description(Max 50 characters)");
         
        //verify if description is valid
        if(description == null){
            break;
        }
           if(description.length() >50){
          JOptionPane.showInputDialog("Task description is long, description must be 50 characters or less");
          continue;
        }
       
       DeveloperDetails = JOptionPane.showInputDialog("Enter the developer details: name and lastname");
       if(DeveloperDetails == null && DeveloperDetails.isEmpty()){
          JOptionPane.showInputDialog(null, "Developer details cannot be empty");
          continue;
       }
       
       duration = Integer.parseInt(JOptionPane.showInputDialog("Enter the task duration in hours"));
       
       
       status = ShowTaskStatus();// call method so that the task status can be chosen
      
       // Call the static method: MakeTaskId
        String taskId = Task.MakeTaskId(taskName, taskNumber, DeveloperDetails);
        
        
        // Create and add the task and add to the list
        tasks.add(this);//add the task to a list
        taskDetails(this);//show details immediately after adding
        taskCounter ++;
        
        int choice = JOptionPane.showConfirmDialog(
                null,
                "Do you wish to add another task?",
                " Carry on",
                JOptionPane.YES_NO_OPTION
          
      );
        
        //exit loop if choice is no
        if(choice == JOptionPane.NO_OPTION){
            CarryOnAdding = false;   
            
        }
       }
       //display message if task is successful
        JOptionPane.showMessageDialog(null, "Tasks added successfully!");
        
       
   }
   
    
    //method to enter task details
    public void taskDetails(Task task){
        
        
    
    String taskInformation = "Task Information:\n\n" +
               
                " Task Number: " + taskCounter  + "\n" +
                " Task Name: " + taskName + "\n" +
                " Description:" + task.description + "\n" +
                " DeveloperDetails: " + DeveloperDetails + "\n" +
                " Duration: " + duration + "hours\n" +
                " Status: " + status + "\n" +
                " Task Id: " + MakeTaskId(task.taskName, task.taskNumber, task.DeveloperDetails);
            
    //display this message using JOption
            JOptionPane.showMessageDialog(null, taskInformation, "Task Details", JOptionPane.INFORMATION_MESSAGE);
            
    }
    
    // a menu to choose the task status
    public static String ShowTaskStatus(){
        String [] statusOption ={"To-DO", "Doing", "Done"};
        
        // show options and note the users selection
        int StatusSelection = JOptionPane.showOptionDialog(null,
              "Choose the task status:",
              " Task Status",
              JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,
              null,
              statusOption,
              statusOption[0]);
                      
        //return status as a string
        if(StatusSelection >=0 && StatusSelection < statusOption.length){
            return statusOption[StatusSelection];
        }else{
            return "TO-DO"; //return this option if no option is made
        }
       
    }
    //method that returns total hours
    public  int GetTotalHours(){
         int totalHours = 0;
         for(Task tasks: tasks){
             totalHours += tasks.displayDuration();
         }
         return totalHours;
    }

    
    //method creates the Task Id using the first two letters of the deveopers name
    public static String MakeTaskId(String taskName,int taskNumber, String DeveloperDetails){
     //get the first two letters of task name, task number and last three latters of dev details
     taskName = taskName.substring(0,Math.min(2, taskName.length()));
     String DeveloperInitials = DeveloperDetails.substring( Math.max( DeveloperDetails.length()-3,0 )).toUpperCase();
     
     return taskName.toUpperCase() + ":" + taskNumber + ":" + DeveloperInitials;
    } 
 
  //method that gets the duration of each task
    public int displayDuration(){
        return duration;
  
    }
    //method that returns the number of tasks
    public  int CountForTasks(){
     return taskCounter;
}
    public List<Task> addTasks(){
        return tasks;
    }
    
    
    public boolean AddedTasks(String taskName, String description, String developerDetails,int duration, String status) {
        //verify the parameters
        if (taskName == null && taskName.isEmpty() && description ==null && description.length() > 50 && developerDetails == null && developerDetails.isEmpty()) {
            
        }
    return false;
    }
 }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 








































   

