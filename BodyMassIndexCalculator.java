public class BodyMassIndex {
    private String name;
    private int age;
    private double weight;
    private double height;

    public BodyMassIndex(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public double calculateBMI() {
        return weight / (height * height);
    }

    public void printPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Height: " + height + " m");
    }

    public void printBMIResult() {
        double bmi = calculateBMI();
        System.out.println("BMI: " + bmi);
        if (bmi >= 30) {
            System.out.println("You are OBESE.");
        } else if (bmi >= 25) {
            System.out.println("You are OVERWEIGHT.");
        } else if (bmi >= 18.5) {
            System.out.println("You have a NORMAL WEIGHT.");
        } else {
            System.out.println("You are UNDERWEIGHT.");
        }
    }
}
