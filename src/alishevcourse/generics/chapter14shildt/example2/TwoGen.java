package alishevcourse.generics.chapter14shildt.example2;

// ������� ���������� ����� � ����� ����������� ����: T, V
public class TwoGen <T, V> {
    T ob1;
    V ob2;

    // �������� ������������ ������ �� ������� ���� T, V
    TwoGen(T ob1, V ob2) {
        this.ob1 = ob1;
        this.ob2 = ob2;
    }

    // �������� ���� T � V
    void showTypes() {
        System.out.println("Type T: " + ob1.getClass().getName());
        System.out.println("Type V: " + ob2.getClass().getName());
    }

    T getOb1() {
        return ob1;
    }

    V getOb2() {
        return ob2;
    }
}

// ������������������ ���������� ������ TwoGen
class SimpGen {
    public static void main(String[] args) {
        TwoGen<Integer, String> tgObj = new TwoGen<>(88, "Generics");

        // show types
        tgObj.showTypes();

        // get and show values
        int v = tgObj.getOb1();
        System.out.println("Value: " + v);

        String str = tgObj.getOb2();
        System.out.println("Values: " + str);
    }
}
