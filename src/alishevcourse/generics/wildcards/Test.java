package alishevcourse.generics.wildcards;
import java .util.List;
import java.util.ArrayList;
//WildCards - ������������� �����
public class Test {
    public static void main(String[] args) {

        // ����� toString ��� ������ ����� ������� �� <>, ������� � ������������ �� ������ ���� � ��������������� ������
        // (� ������� ������� � ������ Animal)
        List <Animal> listOfAnimal = new ArrayList<>();
        listOfAnimal.add(new Animal(1));
        listOfAnimal.add(new Animal(2));

        List<Dog> listOfDog = new ArrayList<>();

        listOfDog.add(new Dog());
        listOfDog.add(new Dog());
        // ���� � ����� test ����������� �������� listOfDog (�� ���� ���������� Animal), �� ���� ����������� �����������
        // �� ������ �� ���������, �� �� �� ���, ��� ��� � ������ test() � ��� ��������� ������ ����� Animal � ��������
        // ������, � ��� �������� listOfDog �� ���������, ����� ������
        test(listOfDog);
    }

    // �� ���� � <> �������� ����� Animal �� ? extends Animal (������, ��� � �������� ���������� �� ����� ��������
    // ���� ����� ��������, ������� �������� ������������ Animal)
    // ���� �������� <?> �� ���������� �� ����� ����� � ������ ������
    // � ��� ���� ������ ��� <? super Animal> - ����� ���������� ���� ���� � ������ ������ Animal (��� ��� Object)
    // ������ � �������� ��������� �� ����� �������� listOfDog
    public static void test(List<? extends Animal> list) {
        for(Animal animal: list) {
            animal.eat();
        }
    }
}
