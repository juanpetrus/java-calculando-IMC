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
public class Person {
        /**
     * @param args the command line arguments
     */
   
        // TODO code application logic here
        protected String Name;
        private Double Height;
        private Double weight;

        public Person(){
            Name = "";
            Height = 0.0;
            weight = 0.0;
        }
        
        public void setName(String N){
            if(N.isEmpty()){
                System.out.println("Name can´t be empty!");
            }else{
                Name = N;
            }
        }
        public void setHeight(double H){
            if(H>0.3){
                Height = H;
            }else{
                System.out.println("Height can´t be less than 0.3m!");
            }
        }
        public void setWheight(double w){
            if(w>=2){
                weight = w;
            }else{
                System.out.println("Weight has to be egual or greater than 2kg!");
            }
        }
        
        public String getName(){
            return Name;
        }
        
        public double getWeight(){
            return weight;
        }
        
        public double getHeight(){
            return Height;
        }
        
        public double BMI(){
            return weight/(Height*Height);
        }
        
        public String getInfo(){
            return "Name:" + Name + "\n" +
                    "Height:" + Height + "\n" +
                    "Weight: " + weight + "\n" +
                    "IBM: " + BMI();
            
        }
    
}
