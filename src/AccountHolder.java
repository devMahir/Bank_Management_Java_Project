public abstract class AccountHolder {
    protected static int AccountHolderSerialNumber = 0;
    protected int AccountNumber;
    protected double AccountBalance;
    protected float AccountOpeningBalance;
    protected float Deposit;
    protected float Withdraw;

    AccountHolder() {
        AccountHolderSerialNumber++;
        this.AccountNumber = AccountHolderSerialNumber;
        this.AccountBalance = 500;
    }

    AccountHolder(float AccountOpeningBalance) {
        AccountHolderSerialNumber++;
        this.AccountNumber = AccountHolderSerialNumber;
        this.AccountBalance = AccountOpeningBalance;
    }

    public int getAccountNumber() {

        return AccountNumber;
    }

    public void Deposit(float deposit) {
        this.AccountBalance = this.AccountBalance + deposit;
    }

    public double getAccountBalance() {

        return AccountBalance;
    }


    public void withdraw(float withdrawAmount) {
        if (this.AccountBalance - withdrawAmount > 500) {
            this.AccountBalance = this.AccountBalance - withdrawAmount;
        } else {
            System.err.println("Account Balance After Withdraw: Insufficient Balance");
        }
    }


    public abstract void updateAccountBalance();

}
