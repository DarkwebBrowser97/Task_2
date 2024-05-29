import java.beans.PropertyVetoException;
import java.util.Locale;
import javax.speech.AudioException;
import javax.speech.Central;
import javax.speech.Engine;
import javax.speech.synthesis.Synthesizer;
import javax.speech.synthesis.SynthesizerModeDesc;
import javax.speech.synthesis.Voice;

public class Speech {

    SynthesizerModeDesc desc;
    Synthesizer synthesizer;
    Voice voice;


    public void test(String voiceName)
            throws EngineException, AudioException, EngineStateError,
            PropertyVetoException
    {
        if (desc == null) {

            System.setProperty("freetts.voices",
                    "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");

            desc = new SynthesizerModeDesc(Locale.ENGLISH);
            Central.registerEngineCentral
                    ("com.sun.speech.freetts.jsapi.FreeTTSEngineCentral");
            synthesizer = Central.createSynthesizer(desc);
            synthesizer.allocate();
            //synthesizer.resume();
            // SynthesizerModeDesc smd =
            desc = (SynthesizerModeDesc)synthesizer.getEngineModeDesc();
            Voice[] voices = desc.getVoices();
            Voice voice = null;
            for(int i = 0; i < voices.length; i++) {
                if(voices[i].getName().equals(voiceName)) {
                    voice = voices[i];
                    break;
                }
            }
            synthesizer.getSynthesizerProperties().setVoice(voice);
        }

    }



    public void doSpeak(String speakText)
            throws EngineException, AudioException, IllegalArgumentException,
            InterruptedException
    {
        synthesizer.speakPlainText(speakText,null);
        synthesizer.waitEngineState(Synthesizer.QUEUE_NOT_EMPTY);
    }
}