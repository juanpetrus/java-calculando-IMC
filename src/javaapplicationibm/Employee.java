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
    private double IR;
    
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
            
        if(S<= 1787.77){
            IR = S;
        }else if(S>1787.78 && S<2679.29){
            IR = S - (S/(7.5*100));
        }else if(S>2679.30 && S<3572.43){
            IR = S - (S/(15*100));
        }else if(S>3572.44 && S<4463.81){
            IR = S - (S/(22.5*100));
        }else if(S>4463.81){
            IR = S - (100/(S*27.5));
        }
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
    
    public double getIR(){
        return IR;
    }
    
    @Override
    public String getInfo(){
        return super.getInfo()+"\nRole: "+Role+"\nSalary: "+Salary+"\nIR: "+IR;
    }
}
