package facade;

public class LoanApp {

    public String applyForLoan(double amount) {

        String loanStatus="rejected";
        CreditSystem cr= new CreditSystem();

       int score= cr.getCreditScore();
        if(score>=750){
            TaxInfo ti=new TaxInfo();
                String taxReport=ti.getTaxStatus();
                    if(taxReport.equals("good")){
                        Bank bankInfo=new Bank();
                        String info=bankInfo.getAccountDetails();
                        loanStatus="approved";
                    }
        }
        return loanStatus;
    }


}
