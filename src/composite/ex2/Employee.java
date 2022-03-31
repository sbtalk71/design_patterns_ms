package composite.ex2;

import java.util.List;

public abstract class Employee {
    protected int id;
    protected String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void add(Employee e) {
        throw new UnsupportedOperationException();
    }

    public void remove(Employee e) {
        throw new UnsupportedOperationException();
    }

    public Employee getChild(int i) {
        throw new UnsupportedOperationException();
    }

    public List<Employee> manages() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String toString() {
        return String.format("%s: %d", name, id);
    }
}