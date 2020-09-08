package Lesson_6;

public class MainAnimals {

    public static void main(String[] args) {
        Dog dog1=new Dog("FirstDog",4,500,0.5,10);
        Dog dog2=new Dog("SedondDog",10,700,0.3,20);
        Cat cat1=new Cat("FirstCat",7,200,2,0);
        Cat cat2=new Cat("SecondCat",4,300,0.5,10);


        dog1.printInfo();
        dog2.printInfo();
        cat1.printInfo();
        cat2.printInfo();
    }

}
