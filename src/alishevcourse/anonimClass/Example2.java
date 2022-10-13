package alishevcourse.anonimClass;
// Анонимные классы
interface Car {
    public void getPower();
}

// Можно создать класс и имплементировать данный интерфейс и переопределить метод, но опять же это не очень удобно
public class Example2 {
    public static void main(String[] args) {
        Car car = new Car(){
            // Объект от интерфейса мы создать не сможем
            // здесь создаётся анонимный класс (который мплементируется от Car) и по сути заменяет интерфейс (слово Car после new)
            // только для этого объекта мы переопределяем метод power
            public void getPower() {
                System.out.println("Power");
            }
        };
    }
}
