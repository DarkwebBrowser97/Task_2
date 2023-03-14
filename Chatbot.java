import java.util.Scanner;

public class Chatbot {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String message = "";

        while (!message.equals("bye")) {
            System.out.print("You: ");
            message = input.nextLine();
            switch (message.toLowerCase()) {
                case "hi":
                case "hello":
                    System.out.println("Bot: Hi there!");
                    break;
                case "how are you":
                    System.out.println("Bot: I'm doing well, thanks for asking!");
                    break;
                case "what's your name":
                    System.out.println("Bot: My name is Chatbot!");
                    break;
                case "bye":
                    System.out.println("Bot: Goodbye!");
                    break;
                default:
                    System.out.println("Bot: I didn't understand what you said.");
            }
        }
    }
}
