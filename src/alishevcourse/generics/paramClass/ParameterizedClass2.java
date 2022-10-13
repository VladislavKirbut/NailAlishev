package alishevcourse.generics.paramClass;

public class ParameterizedClass2 {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("Hi", 20);
        System.out.println("Value pari: value1 = " + pair1.getFirstValue() + " value2 = " + pair1.getSecondValue());

        Pair<Integer, Double> pair2 = new Pair<>(1, 31.1);
        System.out.println("Value pari: value1 = " + pair2.getFirstValue() + " value2 = " + pair2.getSecondValue());

    }
}

// параметрезированный класс, если мы хотим создать класс с типами которые хотим потом заменить (несколько раз), то можно использовать generics
class Pair<V1, V2> {
    private V1 value1;
    private V2 value2;

    Pair(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V1 getFirstValue() {
        return value1;
    }

    public V2 getSecondValue() {
        return value2;
    }
}