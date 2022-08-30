

/* 2022-08-24
—----------------------------------------------------------------
Используя знания о не статических внутренних классах
придумать и реализовать пример из любой близкой вам
предметной области.
(Для тех кому сложно придумать реализуйте класс
Person и класс Passport по примеру
классов BankAccount и Card c урока)
*/

public class Main {
    public static void main(String[] args) {
       Person p1 = new Person("Inna","Kuadros");
       Person p2 = new Person("Percy","Metz");
       Person.Passport passport1=p1.new Passport(9875433);
       Person.Passport passport2=p1.new Passport("Inna", 6775432);

       Person.Passport passport3=p2.new Passport(2981747);
       Person.Passport passport4=p2.new Passport("Percy", 1096354);

       passport1.passportID(87900000);
       passport2.passportID(78530453);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(passport1);
        System.out.println(passport2);
        System.out.println(passport3);
        System.out.println(passport4);
    }
}