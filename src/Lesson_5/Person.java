package Lesson_5;

public class Person {
    private String name;
    private String position;
    private String email;
    private String telephone;
    private int salary;
    private int age;



    public Person(String name, String position, String email, String telephone, int salary, int age) {
        this.name=name;
        this.position=position;
        this.email=email;
        this.telephone=telephone;
        this.salary=salary;
        this.age=age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void PrintInfo(){
        System.out.println("имя сотрудника: "+ this.name+" занимаемая должность: "+ this.position
                +" эл. почта: "+this.email+" конт. телефон: "+
                this.telephone+ " оклад:" +this.salary+"руб/мес"+" возраст "+this.age);
    }


}
