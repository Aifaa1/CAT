FARDHOSA HUSSEIN ABDI
SCT221-0499/2023
JAVA PROGRAMMING ASSIGNMENT
Section 1
1.	Differences Between Primitive and Reference Data Types:
•	Primitive Data Types: These are the basic data types provided by Java. They hold their values directly and include types like int, char, double, boolean, etc. They are not objects and have a fixed size.
•	Reference Data Types: These refer to objects and hold the memory address of the object rather than the actual data. Examples include arrays, strings, and user-defined classes. They can be null, indicating that they do not point to any object.
2.	Scope of a Variable:
•	Local Variable: A variable defined within a method or block, accessible only within that method or block.
•	Global Variable: Also known as instance variables, these are defined at the class level and can be accessed by all methods within the class.
3.	Why Initialization of Variables is Required:
•	Initialization is necessary to ensure that variables have a defined value before they are used. Using uninitialized variables can lead to unpredictable behavior and runtime errors.
4.	Differences Between Static, Instance, and Local Variables:
•	Static Variables: These belong to the class rather than any instance. They are shared among all instances of the class and are initialized only once.
•	Instance Variables: These are specific to an instance of a class. Each object has its own copy of instance variables.
•	Local Variables: These are declared within a method and can only be accessed within that method. They do not retain their values after the method execution.
5.	Widening vs. Narrowing Casting:
•	Widening Casting: This is converting a smaller primitive type to a larger primitive type (e.g., int to double). It is done automatically by the Java compiler.
•	Narrowing Casting: This is converting a larger primitive type to a smaller primitive type (e.g., double to int). It must be done explicitly by the programmer using a cast.
6.	Data Type Table Completion:
TYPE	SIZE (IN BYTES)	DEFAULT	RANGE
boolean	1 bit	false	true, false
char	2	'\u0000'	'\u0000' to '\uffff'
byte	1	0	-128 to +127
short	2	0	-32,768 to +32,767
int	4	0	-2,147,483,648 to +2,147,483,647
long	8	0L	-9,223,372,036,854,775,808 to +9,223,372,036,854,775,807
float	4	0.0f	-3.40282347E+38 to +3.40282347E+38
double	8	0.0d	-1.79769313486231570E+308 to +1.79769313486231570E+308
7.	Define Class as Used in OOP:
•	A class in Object-Oriented Programming (OOP) is a blueprint for creating objects. It defines properties (attributes) and methods (functions) that the objects created from the class can have.
8.	Importance of Classes in Java Programming:
•	Classes encapsulate data and behavior, promoting code reusability and modularity. They allow for the creation of objects that can model real-world entities, making it easier to manage complex programs.

SECTION 2
1.Program to Check Surname Length and Age Odd/Even:
import java.util.Scanner;

public class SurnameAgeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your surname: ");
        String surname = scanner.nextLine();
        
        System.out.print("Enter your current age: ");
        int age = scanner.nextInt();
        
        System.out.println("The number of characters in your surname is: " + surname.length());
        if (age % 2 == 0) {
            System.out.println("Your current age is an even number.");
        } else {
            System.out.println("Your current age is an odd number.");
        }
        
        scanner.close();
    }
}



2.Program to Compute Average Marks:

import java.util.Scanner;

public class AverageMarksCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalMarks = 0;
        int subjects = 5;

        for (int i = 1; i <= subjects; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            totalMarks += scanner.nextDouble();
        }

        double average = totalMarks / subjects;
        System.out.printf("The average marks are: %.2f%n", average);
        
        scanner.close();
    }
}


3.Divisibility Test Program:

import java.util.Scanner;

public class DivisibilityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
        for (int i = 1; i <= 9; i++) {
            if (number % i == 0) {
                System.out.println("The number is divisible by " + i + " because it ends with " + (i == 5 ? "5" : "0"));
            }
        }
        
        scanner.close();
    }
}




4.Program to Display Multiples of 2, 3, and 7:


public class MultiplesDisplay {
    public static void main(String[] args) {
        System.out.println("Multiples of 2, 3, and 7 between 71 and 150:");
        for (int i = 71; i <= 150; i++) {
            if (i % 2 == 0 || i % 3 == 0 || i % 7 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}


5.Simple Calculator Program:

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        double result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error! Division by zero.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operator.");
                return;
        }
        
        System.out.println("Result: " + result);
        scanner.close();
    }
}
