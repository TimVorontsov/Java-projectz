package by.belhard.lesson1;

public class Main {

    public static void main(String[] args) {

        Point point1 = new Point(0, 0);
        Point point2 = new Point(3, 4);
        Point point3 = null;
        double d = point1.distance(point2);
        System.out.println(d);

        /*Person person1 = new Person("Peter", 20, new Country("Brazil"), Grade.STUDENT);

        Person person2 = new Person(person1);
        person2.setName("Anna");
        person2.setAge(10);
        person2.setGrade(Grade.PUPIL);
        /*System.out.println(person1.getCountry());
        System.out.println(person2.getCountry());

       String info = person1.toString();
        System.out.println(info);
        System.out.println(person1);

        System.out.println("Person");
        System.out.println(person2);
       System.out.println(Person.getCounter());

       for(int i = 0; i < 10; i++){
           new Person();
       }

       System.out.println(Person.getCounter());*/

    }
}
