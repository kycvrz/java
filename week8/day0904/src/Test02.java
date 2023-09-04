import javax.xml.crypto.Data;
import java.util.Date;

public enum Test02 {
    MORNING("早上好"),NOON("中午好"),AFTERNOON("下午好"),NIGHT("晚上好"),WEEHOURS("凌晨好");
    private String name;
    Test02(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class Test002{
    public static void main(String[] args) {
        Date date=new Date();
        int hour=date.getHours();
        Test02 test02=null;
        if (hour>6 && hour<=8){
            test02=Test02.MORNING;
        }else if (hour>8 && hour<=11){
            test02=Test02.NOON;
        }else if (hour>11 && hour<=18){
            test02=Test02.AFTERNOON;
        }else if (hour>18 && hour<=21){
            test02=Test02.NIGHT;
        }else {
            test02=Test02.WEEHOURS;
        }
        System.out.println(test02.getName());
    }
}
