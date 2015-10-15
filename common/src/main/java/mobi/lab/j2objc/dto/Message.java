package mobi.lab.j2objc.dto;

public class Message {

    private String value;

    public Message() {
        this.value = "n/a";
    }

    public Message(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
