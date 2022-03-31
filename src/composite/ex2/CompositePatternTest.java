package composite.ex2;

import java.util.ArrayList;
import java.util.List;

public class CompositePatternTest {
    public static void main(String args[]) {
        // creating a bunch of developers
        Developer john = new Developer(101, "John");
        Developer robin = new Developer(102, "Robin");
        Developer peter = new Developer(103, "Peter");
        Developer luke = new Developer(104, "Luke");
        Developer amy = new Developer(105, "Amy");
        // creating a manager and adding developers under him
        Manager steve = new Manager(106, "Steve");
        steve.add(john);
        steve.add(robin);
        steve.add(peter);
        // creating another manager and adding his directs
        Manager frank = new Manager(107, "Frank");
        frank.add(luke);
        frank.add(amy);
        frank.add(steve);
        // creating a list of Employee
        List<Employee> org = new ArrayList<>();
        org.add(john);
        org.add(robin);
        org.add(peter);
        org.add(luke);
        org.add(amy);
        org.add(steve);
        org.add(frank);
        // iterating over all employees
        for (Employee e : org) {
            System.out.printf("%s manages %s %n", e.getName(), e.manages());
        }
    }
}

