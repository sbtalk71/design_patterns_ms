package composite.ex2;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee {
    private List<Employee> manages = new ArrayList<>();

    public Manager(int id, String name) {
        super(id, name);
    }

    @Override
    public void add(Employee e) {
        manages.add(e);
    }

    @Override
    public void remove(Employee e) {
        manages.add(e);
    }

    @Override
    public Employee getChild(int i) {
        return manages.get(i);
    }

    @Override
    public List<Employee> manages() {
        return manages;
    }
}

