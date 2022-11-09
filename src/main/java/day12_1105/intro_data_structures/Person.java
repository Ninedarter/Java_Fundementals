package day12_1105.intro_data_structures;

class Person {
    public String name;
    public Integer salary;

    public Person(String name, Integer salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
