package alishevcourse.generics;
import java.util.List;
import java.util.ArrayList;


public class Example1 {
    public static void main(String[] args) {
        ///////////////////////////// JAVA 5 ////////////////////////////////
        // по умолчанию, когда отсутствуют <>, в данный момент у класса List, мы можем положить туда любой тип
        // весь класс будет иметь тип Object вне зависимости от того, что мы туда кладём
        // т.е. List <Object> list = new ArrayList<Object>();
//        List list = new ArrayList();
//        list.add("Black");
//        list.add("White"); // 1
//        list.add("Blue");
        // если мы положим сюда какой-нибудь рандомный обект, он просто не закастится и будет исключение CastException
        // возникнет ошибка (хотя мы вкладывали в класс строки), но проблема в том, что этот класс содержит тип Object
        // так как от Object наследуются все типы
        // поэтому нам необходимо будет делать downCast (преобразование в данный момент к типу String)
        // что очень не удобно
//        String s = (String) list.get(1);
//        System.out.println(s);

        ////////////////////////// с появлением дженериков (generics) ////////////////////////////////
        // сюда теперь мы можем класть только строки
        List <String> list = new ArrayList<String>();
        list.add("Audi");
        list.add("BMW");
        list.add("Reno"); // 2

        // можем теперь присвоить без downcast (преведения типов)
        String s1 = list.get(2);
        System.out.println(s1);

        ////////////////////////// JAVA 7 ///////////////////////////////
        List <String> list1 = new ArrayList<>(); // во вторых <> можно не указывать тип
    }
}
