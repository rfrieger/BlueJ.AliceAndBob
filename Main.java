/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args ){
        

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your name");
        String userInput = in.nextLine();
        
        
        if(userInput.equalsIgnoreCase("alice") || userInput.equalsIgnoreCase("bob") ) {
            System.out.println("Hello " + userInput);
        } else {
            System.out.println("Hello random person you're not Bob or Alice");

        }
    }
}
