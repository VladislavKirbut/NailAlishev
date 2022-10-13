package alishevcourse.anonimClass;
// Анонимные классы
class Animal {
    public void eat() {
        System.out.println("Animal is eating.");
    }
}

//Допустим нам необходимо переопределить метод eat(), но создавать новый дочерний класс (для Animal) для этого не очень удобно
public class Example1 {
    public static void main(String [] args) {
        Animal animal = new Animal(){
            // здесь создаётся анонимный класс (который является дочерним для Animal) и по сути заменяет объект (слово Animal после new)
            // только для этого объекта мы переопределяем метод eat
            public void eat() {
                System.out.println("Nyam");
            }
        };
        animal.eat();
    }
}