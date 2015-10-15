package mobi.lab.j2objc;

import com.google.gson.Gson;

import mobi.lab.j2objc.dto.Message;

public class CoreLib {

    private Gson gson;

    private CoreLib() {
        gson = new Gson();
    }

    public static CoreLib getInstance() {
        return new CoreLib();
    }

    public String getMessageOfTheDay() {
        return "MessageOfTheDay";
    }

    public String getMessageJson() {
        Message msg = new Message(getMessageOfTheDay());
        String raw = gson.toJson(msg);
        return raw;
    }

    public Message parseMessage(String rawJson) {
        if (rawJson == null) {
            return null;
        }
        return gson.fromJson(rawJson, Message.class);
    }
}
