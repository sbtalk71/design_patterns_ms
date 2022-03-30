package facade;

public class CustomerApp {
    public static void main(String[] args) {
       LoanApp app=new LoanApp();
       String response=app.applyForLoan(600000);
        System.out.println(response);
    }
}
