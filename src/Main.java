
public class Main {


public static void main(String[] args){
        Fish fish=new Fish();
        fish.setName("Farel");
        fish.setAge(2);
        fish.setColor("yellow");
        Popygay popygay = new Popygay();
        popygay.setName("Moty");
        popygay.setAge(3);
        popygay.setColor("Red");
        Cat cat=new Cat();
        cat.setName("Tom");
        cat.setAge(4);
        cat.setColor("blue");
        Dog dog=new Dog();
        dog.setName("Bobyk");
        dog.setAge(5);
        dog.setColor("White");
        System.out.println("FISH");
        System.out.println(fish.getName()+"\n"+fish.getAge()+"\n"+fish.getColor());
        System.out.println("-------------------------------");
        System.out.println("POPYGAI");
        System.out.println(popygay.getName()+"\n"+popygay.getAge()+"\n"+popygay.getColor());
        System.out.println("-------------------------------");
        System.out.println("CAT");
        System.out.println(cat.getName()+"\n"+cat.getAge()+"\n"+cat.getColor());
        System.out.println("-------------------------------");
        System.out.println("DOG");
        System.out.println(dog.getName()+"\n"+dog.getAge()+"\n"+dog.getColor());

        }
        }
