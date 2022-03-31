package composite.ex1;

public class Manager {
    Manager manager;
    Employee[] emps;
    String dept;

    public Manager(Manager manager, Employee[] emps, String dept) {
        this.manager = manager;
        this.emps = emps;
        this.dept = dept;
    }

    public Manager(Employee[] emps, String dept) {
        this.emps = emps;
        this.dept = dept;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public Employee[] getEmps() {
        return emps;
    }

    public void setEmps(Employee[] emps) {
        this.emps = emps;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}
