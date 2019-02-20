/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationibm;

import java.util.Scanner;

/**
 *
 * @author aluno.si
 */
public class JavaApplicationIBM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        Person[] arr = new Person[3];
        
        for(int i=0; i<arr.length; i++){
            Person obj = new Person();
            System.out.println("Enter Person " + (i+1) + "Name: ");
            obj.setName(read.next());
            System.out.println("\nHeight");
            obj.setHeight(read.nextDouble());
            System.out.println("\nWeight");
            obj.setWheight(read.nextDouble());
            
            arr[i] = obj;
        } 
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i].getInfo());
        }       
    }
    
}
