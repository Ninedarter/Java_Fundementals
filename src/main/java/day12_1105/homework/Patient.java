package day12_1105.homework;

public class Patient {
    String name;
    int age;
    String bloodType;
    int heightInCm;
    double weightInKg;

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", bloodType='" + bloodType + '\'' +
                ", heightInCm=" + heightInCm +
                ", weightInKg=" + weightInKg +
                '}';
    }

    public Patient(String name, int age, String bloodType, int heightInCm, double weightInKg) {
        this.name = name;
        this.age = age;
        this.bloodType = bloodType;
        this.heightInCm = heightInCm;
        this.weightInKg = weightInKg;

    }

    public Patient() { //prireike susikurt nauja tuscia konstruktoriu,kad nekurti viso PatientService
    }
}
