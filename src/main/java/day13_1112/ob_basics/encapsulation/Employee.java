package day13_1112.ob_basics.encapsulation;

public class Employee {

    private String name;
    private int personalCode;
    private int salary;

    public Employee(String name, int personalCode, int salary) {
        this.name = name;
        this.personalCode = personalCode;
        this.salary = salary;
    }

    public Employee() {
    }

    /**
     * Viesas metodas, leidziantis pasiekti musu nurodyta objekto lauko reiksme.
     * Sis metodas vadinasi Getteris arba Accessorius(nuo zodzio access)
     * @return
     */

    public String getName() {
        return name;
    }

    public int getPersonalCode() {
        return personalCode;
    }

    public int getSalary() {
        return salary;
    }

    //neukuriu kol kas setterio vardui, nenoriu suteikti galimytbes pakeisti pradiniu duomenis
    // nekurio setterio asmens kodui

    /**
     * Viesas Setteris arba mutatorius
     * Skirtas pasiekti enkapsuliuotus privacius klases laukur ir juos pakeisti
     * @param salary
     */

    public void setSalary(final int salary) {
        if (salary < 500){
            System.out.println("Alga yra mazesne negu minimumas " +
                    "todel alga negali buti pakeista");
        } else{
            this.salary = salary;
        }

    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", personalCode=" + personalCode +
                ", salary=" + salary +
                '}';
    }

    public void setName(String name) {
        if(name != null && !name.isEmpty()){
            this.name = name;
        }
        else {
            System.out.println("Vardas neegzistuoja, nes jis yra tuscias");
        }

    }






    public void setPersonalCode(int personalCode) {
        this.personalCode = personalCode;
    }
}
