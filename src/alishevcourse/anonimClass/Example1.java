package alishevcourse.anonimClass;
// ��������� ������
class Animal {
    public void eat() {
        System.out.println("Animal is eating.");
    }
}

//�������� ��� ���������� �������������� ����� eat(), �� ��������� ����� �������� ����� (��� Animal) ��� ����� �� ����� ������
public class Example1 {
    public static void main(String [] args) {
        Animal animal = new Animal(){
            // ����� �������� ��������� ����� (������� �������� �������� ��� Animal) � �� ���� �������� ������ (����� Animal ����� new)
            // ������ ��� ����� ������� �� �������������� ����� eat
            public void eat() {
                System.out.println("Nyam");
            }
        };
        animal.eat();
    }
}