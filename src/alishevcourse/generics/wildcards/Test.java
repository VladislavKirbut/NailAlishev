package alishevcourse.generics.wildcards;
import java .util.List;
import java.util.ArrayList;
//WildCards - одстановочные знаки
public class Test {
    public static void main(String[] args) {

        // метод toString при выводе будет браться из <>, поэтому и переопределён он должен быть в соответствующем классе
        // (в данныом примере в классе Animal)
        List <Animal> listOfAnimal = new ArrayList<>();
        listOfAnimal.add(new Animal(1));
        listOfAnimal.add(new Animal(2));

        List<Dog> listOfDog = new ArrayList<>();

        listOfDog.add(new Dog());
        listOfDog.add(new Dog());
        // если в метод test попробовать передать listOfDog (по сути наследника Animal), то если соблюдается полиморфизм
        // то должно всё получится, но всё не так, так как в методе test() у нас конкретно указан класс Animal в качестве
        // списка, у нас передать listOfDog не получится, будет ошибка
        test(listOfDog);
    }

    // но если в <> заменить класс Animal на ? extends Animal (значит, что в качестве аргументов мы можем передать
    // лист любых объектов, которые являются наследниками Animal)
    // если поставим <?> то передавать мы можем листы с любыми типами
    // и ещё одна запись это <? super Animal> - листы содержащие типы выше в данном случае Animal (тут это Object)
    // Теперь в качестве параметра мы можем передать listOfDog
    public static void test(List<? extends Animal> list) {
        for(Animal animal: list) {
            animal.eat();
        }
    }
}
