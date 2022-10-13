package alishevcourse.generics.paramMethods;
import java.util.ArrayList;

public class ParametrizedMethod {
    public static void main(String[] args) {
        ArrayList <Integer> al1 = new ArrayList<>();
        al1.add(10);
        al1.add(20);
        al1.add(5);
        int a = GenMethod.getSecondElement(al1);
        System.out.println(a);

        ArrayList <String> al2 = new ArrayList<>();
        al2.add("Wet");
        al2.add("Expected");
        al2.add("Unexpected");
        String b = GenMethod.getSecondElement(al2);
        System.out.println(b);
    }
}

// в качестве параметров методу мы передаём лист с неизвестным на данныйй момент типом
// поэтому ArrayList содержит <T> и в зависимости от типа <T> будет возвращаться соответствующий тип данных

class GenMethod {
    public static <T> T getSecondElement(ArrayList<T> al) {
        return al.get(1);
    }
}