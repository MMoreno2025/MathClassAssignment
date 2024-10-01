//Malia Moreno | 26 September 2024//
package com.mycompany.mathclassassignment;
import java.util.Random;
import java.util.Scanner;

public class MathClassAssignment {
    public static void main(String[] args) {
        //define "ran" variable as a random() object//
        Random ran = new Random();
        Scanner myObj = new Scanner(System.in);
        
        //generate ran num between 0-99 including both sides
        //display sin, cos, and tan of num, display has to be rounded 3 decimal places
        //Format:  Number: 45 Sine:0.851 Cosine:0.525 Tangent:1.620
        int num01 = ran.nextInt(0, 99);
        double radNum = Math.toRadians(num01);
        double sinNum = Math.sin(radNum), cosNum = Math.cos(radNum), tanNum = Math.tan(radNum);
        System.out.println("Number: "+num01+"  Sine: "+Math.round(sinNum*1000d)/1000d + "  Cosine: "+Math.round(cosNum*1000d)/1000d + "  Tangent: "+Math.round(tanNum*1000d)/1000d);
        
        //generage (real) ran num from 1.0 to 20.0 - for radius of a circle
        //use MathClass to find area of the circle and volume of a sphere with that radius
        float num02 = ran.nextFloat(1, 20);
        double area = Math.pow(num02,2)*Math.PI;
        double volume = Math.pow(num02,3)*Math.PI*(4D/3);
        System.out.println("Number: "+num02+"  Area: "+area+"  Volume: "+volume);
        
        //get ran num in range from 1000.0 and 100000000.0
        //use MathClass and get the square root, get natural logarthm, and its log10 value
        //all values rounded to 5 decimals
        float num03 = ran.nextFloat(1000, 100000000);
        double sqrtNum = Math.round(Math.sqrt(num03)*100000d)/100000d;
        double natLogNum = Math.round(Math.log(num03)*100000d)/100000d;
        double logNum = Math.round(Math.log10(num03)*100000d)/100000d;
        System.out.println("Number: "+Math.round(num03*100000d)/100000d+"  Square Root: "+sqrtNum+"  Natural Log: "+natLogNum+"  Log Base 10: "+logNum);
        
        
        //use high real num value just generator to calculate Mass (in grams) needed
        //to generate that much energy using numer03 as the energy (E=mc^2)
        System.out.print("\nPlease input an integer for length: \t"); 
        int inputPlace = myObj.nextInt(); 
        int speedLight = 299792458;
        double massNum03 = num03/Math.pow(speedLight, 2);
        System.out.println("Energy: "+num03+"  Mass: "+roundAvoid(massNum03, inputPlace));
        
        //use scanner to get real num as an integer from the user
        //return value of power of the integer using mathClass method
        //round value returned to integer the inputed
        System.out.print("\nPlease input an integer: \t"); 
        int inputInt = myObj.nextInt(); 
        System.out.println(roundAvoid(Math.pow(inputInt, inputInt), inputInt));
    }
    
    public static double roundAvoid(double value, int places){
        double scale = Math.pow(10, places);
        return Math.round(value * scale)/scale;
    }
    
    public static double trigRound(int num, String func){
        System.out.println("I work!");
        return num;
    }
}
