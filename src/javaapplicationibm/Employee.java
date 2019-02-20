/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationibm;

/**
 *
 * @author aluno.si
 */
public class Employee extends Person{
    private String Role;
    private double Salary;
    
    public Employee(){
        
    }
    //settrs
    public void setRole(String R){
        if(R.isEmpty()){
            System.out.println("Role can´t be empty!");
        }else{
            Role = R;
        }
    }
    
    public void setSalary(double S){
        if(S>=0){
            Salary = S;
        }else{
            System.out.println("Salary can´t be negative");
        }
    }
    
    //getters
    public String getRole(){
        return Role;
    }
    
    public double getSalary(){
        return Salary;
    }
    
    @Override
    public String getInfo(){
        return super.getInfo()+"Role"+Role+"Salary"+Salary;
    }
}
