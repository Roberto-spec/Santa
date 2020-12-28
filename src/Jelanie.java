import java.util.Scanner;



public class Jelanie {
    String jelanie;
    Jelanie(String Jelanie){
        this.jelanie=Jelanie;
    }
    //Форма выбора желания, Я предположил что
    // этот список желаний не конечный и чтоб можно
    // было его расширить сделал еще класс под желания
    Jelanie(){
        jelanie=null;

    }

    public String getJelanie() {
        return jelanie;
    }
}
