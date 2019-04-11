import java.util.*;
public class OddsAndEvens {

    private String BreakLines = "- + - - + - - + - - + - - + - - + - - + - + - - + - + - - + -";
    private Scanner input = new Scanner(System.in);
    private String Fingers = "\"fingers\"";
    private String Odd = "odd!";
    private String Even = "even!";

    public static void main (String [] args) {
        OddsAndEvens yourProgram = new OddsAndEvens();
        yourProgram.playTheGame();
        //System.out.print("Your name:" + you.Name);
        //System.out.print("Your age:" + you.Age);
    }

    public String userName() {
        System.out.print("What is your name? ");
        String uName = input.nextLine();
        return uName;
    }
    public String usersChoice (String uName) {
        boolean checker = false;
        String usersChoice = "";
        while (!checker) {
            System.out.print("Hello "+ uName + " , which do you choose? (O)dds or (E)vans? ");
            String uChoice = input.next();
            String uChoiceUp = uChoice.toUpperCase();
            if(uChoiceUp.equals("O")) {
                System.out.println(uName + " has picked odds! The Computer will be evans.");
                checker = true;
                usersChoice += uChoiceUp;
            }else if(uChoiceUp.equals("E")) {
                System.out.println(uName + " has picked evens! The computer will be odds.");
                checker = true;
                usersChoice += uChoiceUp;
            }else {
                System.out.println("Please enter either e for evens or o for odds.");
            }
    }
        System.out.println(BreakLines);
        return usersChoice;
    }

    /*public Person GetUserDetails()
    {
        Person newPerson =  new Person();
        System.out.print("Hello dude, what's your name?");
        newPerson.Name = input.nextLine();
        System.out.print("What's your age?");
        newPerson.Age = input.nextInt();
        return newPerson;
    }*/

    private void playTheGame() {
        System.out.println("Lets play a game called \"Odds and Evens\"");
        String userName = userName();
        String usersChoice = usersChoice(userName);

        System.out.print("How many fingers do you put out? ");
        int userNumber = input.nextInt();
        Random rand = new Random();
        int computerNumber;
        computerNumber = 2; //rand.nextInt(6);
        System.out.println("The Computer plays " + computerNumber + " " + Fingers + ".");
        System.out.println(BreakLines);

        //Results
        int result = userNumber + computerNumber;
        System.out.println(userNumber + " + " + computerNumber + " = " + result + "\n");


        if (result % 2 == 0) {
            if (usersChoice.equals("E")) {
                System.out.println("That means " + userName + " Wins !! :) ");
            } else {
                System.out.println(userName + " , you lost and the Computer Wins !! :( ");
            }
        } else {
            if (usersChoice.equals("O")) {
                System.out.println("That means " + userName + " Wins !! :) ");
            } else {
                System.out.println(userName + " , you lost and the Computer Wins !! :( ");
            }
        }
    }
}

