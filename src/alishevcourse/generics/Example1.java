package alishevcourse.generics;
import java.util.List;
import java.util.ArrayList;


public class Example1 {
    public static void main(String[] args) {
        ///////////////////////////// JAVA 5 ////////////////////////////////
        // �� ���������, ����� ����������� <>, � ������ ������ � ������ List, �� ����� �������� ���� ����� ���
        // ���� ����� ����� ����� ��� Object ��� ����������� �� ����, ��� �� ���� �����
        // �.�. List <Object> list = new ArrayList<Object>();
//        List list = new ArrayList();
//        list.add("Black");
//        list.add("White"); // 1
//        list.add("Blue");
        // ���� �� ������� ���� �����-������ ��������� �����, �� ������ �� ���������� � ����� ���������� CastException
        // ��������� ������ (���� �� ���������� � ����� ������), �� �������� � ���, ��� ���� ����� �������� ��� Object
        // ��� ��� �� Object ����������� ��� ����
        // ������� ��� ���������� ����� ������ downCast (�������������� � ������ ������ � ���� String)
        // ��� ����� �� ������
//        String s = (String) list.get(1);
//        System.out.println(s);

        ////////////////////////// � ���������� ���������� (generics) ////////////////////////////////
        // ���� ������ �� ����� ������ ������ ������
        List <String> list = new ArrayList<String>();
        list.add("Audi");
        list.add("BMW");
        list.add("Reno"); // 2

        // ����� ������ ��������� ��� downcast (���������� �����)
        String s1 = list.get(2);
        System.out.println(s1);

        ////////////////////////// JAVA 7 ///////////////////////////////
        List <String> list1 = new ArrayList<>(); // �� ������ <> ����� �� ��������� ���
    }
}
