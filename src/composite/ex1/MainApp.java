package composite.ex1;

public class MainApp {
    public static void main(String[] args) {
        Employee[] empList1={
                                new Employee("John",88000),
                                new Employee("Scott",89000)
                            };

        Employee[] empList2={
                new Employee("Kiran",69000),
                new Employee("Pavan",59000),
                  new Employee("Ramu",80000),
                new Employee("Chandra",69000)
        };

        Manager m1= new Manager(empList1,"Deve");

        Manager m2=new Manager(m1,empList2,"Accounts");

        Manager mgr= m2.getManager();
        for(Employee e:m1.getEmps()){
            System.out.println(e.getName()+":"+e.getSalary());
        }
        for(Employee e:m2.getEmps()){
            System.out.println(e.getName()+":"+e.getSalary());
        }
    }
}
