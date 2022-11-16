package day13_1112.ob_basics.encapsulation;

public class Main {
    public static void main(String[] args) {
        Employee tom = new Employee("Tom", 123133, 3000);

        //tom.name nepasiekamas per "." nes padarem private, todel paisdarem Getteri
//        System.out.println(tom.name + " " + tom.personalCode + " " + tom.salary);
//        tom.personalCode = 9999;
//        System.out.println(tom.personalCode);

       tom.setSalary(4500);
        System.out.println(tom.getSalary());
        System.out.println();
        tom.setSalary(300);
        System.out.println(tom.getSalary());

        Employee justas = new Employee();
        justas.setName("Justas");
        justas.setSalary(5500);
        justas.setPersonalCode(123456);
        System.out.println(justas);
    }

}
