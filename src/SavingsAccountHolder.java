public class SavingsAccountHolder extends AccountHolder {

    public SavingsAccountHolder(float AccountOpeningBalance) {
        super(AccountOpeningBalance);
    }

    public SavingsAccountHolder() {
    }



    @Override
    public void updateAccountBalance(){
        this.AccountBalance= this.AccountBalance + this.AccountBalance * .07f;

    }

}