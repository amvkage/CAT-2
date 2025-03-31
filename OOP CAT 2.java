import java.util.Scanner;
//Encapsulation
class Student {
    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        setGrade(grade);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        } else {
            this.grade = 0;
        }
    }
}

//Method Overloading and Overriding
class MathOperations {
    public int multiply(int a, int b) {
        return a * b;
    }

    public int multiply(int a, int b, int c) {
        return a * b * c;
    }
}

class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }
}

//Abstraction
abstract class Appliance {
    abstract void turnOn();
}

class Fan extends Appliance {
    @Override
    void turnOn() {
        System.out.println("Fan is now ON");
    }
}

class TV extends Appliance {
    @Override
    void turnOn() {
        System.out.println("TV is now ON");
    }
}

//Exception Handling
public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice", 105);
        System.out.println("Student: " + student.getName() + ", Grade: " + student.getGrade());
        
        MathOperations math = new MathOperations();
        System.out.println("Multiplication of 2 and 3: " + math.multiply(2, 3));
        System.out.println("Multiplication of 2, 3, and 4: " + math.multiply(2, 3, 4));
        
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        myDog.makeSound();
        myCat.makeSound();
        
        Appliance fan = new Fan();
        Appliance tv = new TV();
        fan.turnOn();
        tv.turnOn();
        
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();
            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        } finally {
            scanner.close();
        }
    }
}
