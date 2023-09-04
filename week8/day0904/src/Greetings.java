import java.util.Date;

public enum Greetings {
    GREETING();
    private String message;
    Greetings(String message) {
        this.message = message;
    }
    Greetings() {
        Date date = new Date();
        int hour = date.getHours();
        if (hour > 6 && hour <= 11) {
            this.message = "早上好";
        } else if (hour > 11 && hour <= 14) {
            this.message = "中午好";
        } else if (hour > 14 && hour <= 18) {
            this.message = "下午好";
        } else if (hour > 18) {
            this.message = "晚上好";
        } else {
            this.message = "凌晨好";
        }
    }

    public String getMessage() {
        return message;
    }
}

class Test003 {
    public static void main(String[] args) {
        Greetings greetings = Greetings.GREETING;
        System.out.println(greetings.getMessage());
    }
}
