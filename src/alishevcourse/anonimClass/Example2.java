package alishevcourse.anonimClass;
// ��������� ������
interface Car {
    public void getPower();
}

// ����� ������� ����� � ���������������� ������ ��������� � �������������� �����, �� ����� �� ��� �� ����� ������
public class Example2 {
    public static void main(String[] args) {
        Car car = new Car(){
            // ������ �� ���������� �� ������� �� ������
            // ����� �������� ��������� ����� (������� ��������������� �� Car) � �� ���� �������� ��������� (����� Car ����� new)
            // ������ ��� ����� ������� �� �������������� ����� power
            public void getPower() {
                System.out.println("Power");
            }
        };
    }
}
