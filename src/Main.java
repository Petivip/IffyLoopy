import java.util.Scanner;

public class Main {
    public static void main(String[]args) {
        Scanner myVar = new Scanner(System.in);
        String sta="yes";
        while(!sta.equals("no")){  int i = 1;
        String sent = "";
        while (i <= 5) {
            i++;
            System.out.println("Enter a one word that will make a sentence:");
            String word = myVar.next();

            sent += word;
        }

        System.out.println(sent);
            myVar.next();
        System.out.println("Are you eyes red?(y/n)");
        String answer = myVar.next();
        if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes")) {
            System.out.println("Go to sleep!");
        } else {
            System.out.println("You look great");
        }
        System.out.println("Do you want to continue?(no/yes)");
        sta = myVar.next();
    }
    }
}
