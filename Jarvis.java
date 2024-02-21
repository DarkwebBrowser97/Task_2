import javax.speech.Central;
import javax.speech.synthesis.Synthesizer;
import javax.speech.synthesis.SynthesizerModeDesc;
import java.util.Locale;
import java.util.Scanner;

public class Jarvis {

    public static void main(String[] args) {
        try {
            // Set up the voice synthesizer
            System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
            Central.registerEngineCentral("com.sun.speech.freetts.jsapi.FreeTTSEngineCentral");
            Synthesizer synthesizer = Central.createSynthesizer(new SynthesizerModeDesc(Locale.US));

            synthesizer.allocate();
            synthesizer.resume();

            // Start interacting with the user
            Scanner scanner = new Scanner(System.in);
            String userInput;
            do {
                System.out.print("You: ");
                userInput = scanner.nextLine();

                // Implement your Jarvis logic here
                String response = "I'm sorry, I cannot do that.";

                System.out.println("Jarvis: " + response);
                synthesizer.speakPlainText(response, null);

            } while (!userInput.equalsIgnoreCase("exit"));

            // Shutdown the synthesizer
            synthesizer.deallocate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
