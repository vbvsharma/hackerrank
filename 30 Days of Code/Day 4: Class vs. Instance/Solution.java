import java.io.*;
import java.util.*;

public class Person {
    private int age;	
  
	public Person(int initialAge) {
  		if (initialAge < 0) {
            System.out.println("Age is not valid, setting age to 0.");
            age = 0;
        } else {
            age = initialAge;
        }
	}

	public void amIOld() {
  		// Write code determining if this person's age is old and print the correct statement:
        String message = "You are young.";
        if (13 <= this.age && this.age < 18)
            message = "You are a teenager.";
        else if (18 <= this.age)
            message = "You are old.";
        System.out.println(message);
	}

	public void yearPasses() {
  		// Increment this person's age.
        this.age++;  
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			Person p = new Person(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
        }
		sc.close();
    }
}