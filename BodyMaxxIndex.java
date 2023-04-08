import java.util.Scanner;

public class BMI {

    private String name;
    private int age;
    private double weight; 
    private double height; 
    
    // Parameterized constructor
    public BMI(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }
    
   
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    public double getWeight() {
        return weight;
    }
    
    public void setHeight(double height) {
        this.height = height;
    }
    
    public double getHeight() {
        return height;
    }
    

    public void inputInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = scanner.nextLine();
        System.out.print("Enter your age: ");
        age = scanner.nextInt();
        System.out.print("Enter your weight in kilograms: ");
        weight = scanner.nextDouble();
        System.out.print("Enter your height in meters: ");
        height = scanner.nextDouble();
    }
    
    
    public double calculateBMI() {
        return weight / (height * height);
    }
    
  
    public void printResults() {
        double bmi = calculateBMI();
        System.out.printf("Name: %s%n", name);
        System.out.printf("Age: %d%n", age);
        System.out.printf("Weight: %.1f kilograms%n", weight);
        System.out.printf("Height: %.2f meters%n", height);
        System.out.printf("BMI: %.1f%n", bmi);
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
    
   
    public static void main(String[] args) {
        BMI person = new BMI("John", 30, 75.0, 1.8);
        person.printResults();
        person.inputInfo(); // Prompts user to input information
        person.printResults(); // Prints the results using the input values
    }
}

