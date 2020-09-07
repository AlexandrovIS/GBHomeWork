package Lesson_5;

public class chekPerson {
    public static void main(String[] args) {


        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivanov_ivan_2020@mail.ru", "89924234572", 70000, 20);
        persArray[1] = new Person("Petrov Petr", "Engineer", "petrov@gmail.com", "89051052337", 70000, 30);
        persArray[2] = new Person("Aleksandrov Aleksandr", "Engineer", "a9001920@yandex.ru", "89219001020", 70000, 40);
        persArray[3] = new Person("Dmitriev Dmitriy", "Engineer", "ddmitriy@ymail.com", "89213123192", 70000, 50);
        persArray[4] = new Person("Sidorov Sidr", "Engineer", "sidorov@icloud.com", "89111233211", 70000, 60);

        for (Person person : persArray){
            if(person.getAge()>40) {
                person.PrintInfo();
            }
        }



    }
}


