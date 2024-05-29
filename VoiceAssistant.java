package com.example.voice;


import javax.security.auth.login.AppConfigurationEntry;
import java.lang.module.Configuration;

public class VoiceAssistant {

    public  static  void  main ( String[] args){

        Configuration configuration = new Configuration() {
            @Override
            public AppConfigurationEntry[] getAppConfigurationEntry(String name) {
                return new AppConfigurationEntry[0];
            }
        };
        configuration.resolve("");



    }
}
