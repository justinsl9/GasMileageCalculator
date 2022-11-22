package gasmileagejl;   //@author Justin Little
import java.util.Scanner;
public class GasMileageJL {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int miles = 0, gallons = 0;
       float totalMiles = 0, totalGallons = 0, gasPrice = 0;
       
       System.out.println("Gas Mileage Calculator");
       System.out.print("Enter miles for the trip: ");
       miles = input.nextInt();
       System.out.print("Enter the gallons used: ");
       gallons = input.nextInt();
       System.out.print("Enter the price per gallon: ");
       gasPrice = input.nextFloat();
       
       while (miles != -1)
       {
           totalMiles = miles + totalMiles;
           totalGallons = gallons + totalGallons;
           
           System.out.println("Trip Total");
           System.out.printf("Miles Per Gallon this trip is: %s%n", miles / gallons);
           System.out.printf("Total Miles Per Gallon is: %s%n", totalMiles / totalGallons);
           System.out.printf("Price Per Gallon this trip is: %s%n", gasPrice * gallons);
           break;
    
       }
       }
       }