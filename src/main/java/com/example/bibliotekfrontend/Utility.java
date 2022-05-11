package com.example.bibliotekfrontend;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class Utility {

    public String encodeToURL(String inputString) {
        return URLEncoder.encode(inputString, StandardCharsets.UTF_8);
    }


    public String trimResponse(String response){
        int first = 0;
        int last = 0;
        for(int i = 0; i<response.length();i++){
            if(response.charAt(i) == '['){
                first = i;
            }
            if(response.charAt(i) == ']'){
                last = i;
            }
        }
        String trimmedStringResponse = response.substring(first,last+1);

        return trimmedStringResponse;
    }

    public String getIsbnFromString(String str){

        String [] splitString = str.split(" ");


        return splitString[1];

    }



}
