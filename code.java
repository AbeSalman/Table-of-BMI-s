package as_t_of_bmi.s;

import java.util.Scanner;

/**
 *
 * @author iCloud
 */
public class AS_T_of_BMIS {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); /*creat input scanner/s*/

        int height_F; /*height in feet*/

        int height_I; /*height in inches*/

        int weight_L; /*low weight in pounds*/

        int weight_H; /*high weight in pounds*/

        float height; /*height in inches*/

        double Bmi;   /*body mass index*/

        //Prompt the user to enter height// 

        System.out.print("Using spacebar between Feet and Inches \n"
                + "Please enter your height in Feet and Inches: ");
        height_F = input.nextInt();
        height_I = input.nextInt();

        //Prompt the user to enter both weights// 
        
        System.out.print("Enter your low weight in Pounds: ");
        weight_L = input.nextInt();
        System.out.print("Enter your high weight in Pounds: ");
        weight_H = input.nextInt();

        //Converting feet into incehs// 
        height = (float) ((height_F * 12) + height_I);


        //Screen relative rsults to BMI table ranges// 
        System.out.printf("Weight\t\t\tBMI\t\t\tDescritption\n");/*9_spaces header*/


        for (int counter = weight_L; counter <= weight_H; counter += 5) {
            
            // Conducting T_of_BMIS formulas// 
            
            Bmi = ((counter * 703f) / (height * height));
            
            System.out.print(counter);

            System.out.printf("\t\t\t%.4f\t\t\t", Bmi);

            if (Bmi < 18.5) {
                System.out.println("You are Underweight");
            } else if (Bmi < 25) {
                System.out.println("You have normal weight");
            } else if (Bmi < 30) {
                System.out.println("You are overweight");
            } else {
                System.out.println("You are obese");
            }

        }

    }
}
