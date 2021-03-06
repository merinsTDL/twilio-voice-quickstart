package com.assignment.respondtophonecall;

import com.twilio.twiml.voice.Say;
import com.twilio.twiml.VoiceResponse;

import static spark.Spark.*;

public class VoiceApp {
    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello!");

        post("/", (req, res) -> {
            Say say = new Say.Builder(
                    "Hello!")
                    .build();
            VoiceResponse voiceResponse = new VoiceResponse.Builder()
                    .say(say)
                    .build();

            return voiceResponse.toXml();
        });
    }
}
