package by.belhard.lesson1;

public class Person {

    private static int counter = 0;

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Person.counter = counter;
    }

    private String name;
    private int age;
    private Country country;
    private Grade grade;

    public Person(Person person){
        this.name = person.name;
        this.age = person.age;
        this.country = person.country;
        this.grade = person.grade;
        counter++;

    }

    public Person(String name, int age, Country country, Grade grade) {
        this.name = name;
        this.age = age;
        this.country = country;
        this.grade = grade;
        counter++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        counter++;
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }
    public String toString() {
        return name+" "+age+" "+country+" "+grade;
    }
}
