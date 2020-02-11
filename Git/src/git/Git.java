//author alejandroplagar 04/02/2020
package git;

import java.util.Scanner; 

public class Git {
static  Scanner keyboard = new Scanner(System.in);
static String[] letters;
static int dni;
static double Resdni;
    public static void main(String[] args) {
        keyboard.useDelimiter("\n");

        System.out.print("What is your DNI: ");   
        dni = keyboard.nextInt();

        char letters= DNIletter(dni);
        System.out.println(dni+":"+letters);
        
    }
    
    private static char DNIletter(int dni){
       /*char letter='T';
        String letters="TRWAGMYFPDXBNJZSQVHLCKE";
        int Resdni=dni%23;
        letter = letters.charAt(Resdni);
        return letter;
        */
        return "TRWAGMYFPDXBNJZSQVHLCKE".charAt(dni %23);
    }
}
