import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int amountcorrect = 0;
        Scanner kb = new Scanner(System.in);

        //Name
        System.out.print("What is your name?: ");
        String name = kb.nextLine();
        //System.out.println("Your name is: " +name);

        //Answer Int
        System.out.print("What is the answer to 5 x 2: ");
        int AnswerInt = kb.nextInt();
        //System.out.println("Your AnswerInt is: " +AnswerInt);

        if (AnswerInt == 10) {
            System.out.println("You are correct 10 is the right answer!");
            amountcorrect = amountcorrect + 1;
            //System.out.println(amountcorrect);
        }
        else{
            System.out.println("WRONG!!!!! The answer is supposed to be 10");
        }

        //Answer double
        System.out.print("What is the answer to 5 / 2: ");
        double AnswerDouble = kb.nextDouble();
        //System.out.println("Your AnswerDouble is: " +AnswerDouble);

        if (AnswerDouble == 2.5) {
            System.out.println("You are correct 2.5 is the right answer!");
            amountcorrect = amountcorrect + 1;
            //System.out.println(amountcorrect);
        }
        else{
            System.out.println("WRONG!!!!! The answer is supposed to be 2.5");
        }

        //Answer boolean
        System.out.print("Does this project deserve a 100 (true or false)?: ");
        boolean AnswerBoolean = kb.nextBoolean();
        //System.out.println("Your AnswerBoolean is: " +AnswerBoolean);

        if (AnswerBoolean) {
            System.out.println("You are correct it is true that this project deserves a 100");
            amountcorrect = amountcorrect + 1;
            //System.out.println(amountcorrect);
        }
        else{
            System.out.println("WRONG!!!!! The answer was supposed to be true");
        }

        System.out.print("Well done " +name);
        System.out.print(", you got " +amountcorrect);
        System.out.print("/3 questions correct");
    }
}