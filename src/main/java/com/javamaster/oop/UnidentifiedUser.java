package com.javamaster.oop;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author zach malonjao
 */
public class UnidentifiedUser {
    private String username;
    private String password;
    private String role;
    private String employeeID;
   
   public String getUsername(){
       return username;
   }
   
   public void setUsername(String username){
       this.username=username;
   }
   
   
   public String getPassword(){
       return password;
   }
   
   public void setPassword(String password){
       this.password=password;
   }
   
   public String getRole(){
       return role;
   }
   public void setRole(String role){
       this.role=role;
   }
   
   public String getEmployeeID(){
       return employeeID;
   }
   public void setEmployeeID(String index){
       this.employeeID=index;
   }
    
}
