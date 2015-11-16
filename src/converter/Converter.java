package converter;
import com.sun.xml.internal.ws.util.xml.ContentHandlerToXMLStreamWriter;
import java.util.Scanner;
public class Converter {

    public static void main(String[] args) {
        
        Scanner GetStuff = new Scanner(System.in);
        
        String degree_of_measure = "";
        String degree_of_measure2 = "";
        int input = 0;
        int choice1 = 0;
        double Choice1 = 0;
        int choice2 = 0;
        double conversion = 0;
        int f = 1;
        int c = 1;
        int k = 1;
        int F = 0;
        int C = 0;
        int K = 0;

        System.out.println("What degree of measure of temperature do you want to input?"
                + "\n1 for Fahrenheit"
                + "\n2 for Celsius"
                + "\n3 for Kelvin");
        
        input = GetStuff.nextInt();
        
        switch(input)
        {
            case 1: 
                degree_of_measure = "Fahrenheit";
                choice1 = f;
                break;
            case 2: 
                degree_of_measure = "Celsius";
                choice1 = c;
                break;
            case 3: 
                degree_of_measure = "Kelvin";
                choice1 = k;
                break;
        }
        System.out.println("How much?");
        
        Choice1 = GetStuff.nextDouble();
        
        System.out.println(Choice1 + " degrees " + degree_of_measure);
        
        System.out.println("What degree of measure of temperature would you like to convert this into?"
                + "\n1 for Fahrenheit"
                + "\n2 for Celsius"
                + "\n3 for Kelvin");
        
        input = GetStuff.nextInt();
        
        switch(input)
        {
            case 1: 
                degree_of_measure2 = "Fahrenheit";
                choice2 = F;
                break;
            case 2: 
                degree_of_measure2 = "Celsius";
                choice2 = C;
                break;
                
            case 3: 
                degree_of_measure2 = "Kelvin";
                choice2 = K;
                break;
        }

        System.out.println("You want to convert " + Choice1 + " " + degree_of_measure + " into " + degree_of_measure2 + ".");
        
        if (degree_of_measure == "Fahrenheit" && degree_of_measure2 == "Fahrenheit") {
            conversion = Choice1;
        }else{
        if (degree_of_measure == "Fahrenheit" && degree_of_measure2 == "Celsius") {
            conversion = (Choice1 -32) / 1.8;
        }else{
        if (degree_of_measure == "Fahrenheit" && degree_of_measure2 == "Kelvin") {
            conversion = (Choice1 + 459.67) * 0.5555556;
        }else{
        if (degree_of_measure == "Celsius" && degree_of_measure2 == "Fahrenheit") {
            conversion = Choice1 * 1.8 + 32;
        }else{
        if (degree_of_measure == "Celsius" && degree_of_measure2 == "Celsius") {
            conversion = Choice1;
        }else{
        if (degree_of_measure == "Celsius" && degree_of_measure2 == "Kelvin") {
            conversion = Choice1 + 273.15;
        }else{
        if (degree_of_measure == "Kelvin" && degree_of_measure2 == "Fahrenheit") {
            conversion = Choice1 * 1.8 - 459.67;
        }else{
        if (degree_of_measure == "Kelvin" && degree_of_measure2 == "Celsius") {
            conversion = Choice1 - 273.15;
        }else{
        if (degree_of_measure == "Kelvin" && degree_of_measure2 == "Kelvin") {
            conversion = Choice1;
        }
        }}}}}}}}

        System.out.println((int)Choice1 + " " + degree_of_measure + " is the same as " + (int)conversion + " " + degree_of_measure2 + ".");
        
        
        
        
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------
        
        
        String area_unit = "";
        String area_unit2 = "";
        int choice_1 = 0;
        int choice_2 = 0;
        int sq_miles = 1;
        int sq_km = 1;
        int sq_Miles = 0;
        int sq_Km = 0;
        double conversion2 = 0.0;
        double Choice2 = 0;
        
        System.out.println("What degree of measure of area do you want to input?"
                + "\n1 for Square Miles"
                + "\n2 for Square Kilometers");
        
        input = GetStuff.nextInt();
        
        switch(input)
        {
            case 1:
                area_unit = "Square Miles";
                choice_1 = sq_miles;
                break;
            case 2:
                area_unit = "Square Kilometers";
                choice_1 = sq_km;
                break;
        }
        
        System.out.println("How much?");
        
        Choice2 = GetStuff.nextDouble();
        
        System.out.println(choice_1 + area_unit);
        
        System.out.println("What degree of measure of area do you want to convert this into?"
                + "\n1 for Square Miles"
                + "\n2 for Square Kilometers");
        
        input = GetStuff.nextInt();
        
        switch(input)
        {
            case 1:
                area_unit2 = "Square Miles";
                choice_2 = sq_Miles;
                break;
            case 2:
                area_unit2 = "Square Kilometers";
                choice_2 = sq_Km;
                break;
        }
        
        System.out.println("You want to convert " + choice_1 + " " + area_unit + " into " + area_unit2 + ".");
        
        if (area_unit == "Square Miles" && area_unit2 == "Square Miles"){
            conversion = Choice2;
        }else{
        
        if (area_unit == "Square Miles" && area_unit2 == "Square Kilometers"){
            conversion = Choice2 * 2.5899999;
        }else{
        
        if (choice_1 == sq_km && area_unit2 == "Square Miles"){
            conversion = Choice2 * 0.621371;
        }else{
        
        if (choice_1 == sq_km && area_unit2 == "Square Kilometers"){
            conversion = Choice2;
        }
        }}}
        
        System.out.println((int)Choice2 + " " + area_unit + " is the same as " + (int)conversion + " " + area_unit2 + ".");
    }    
}