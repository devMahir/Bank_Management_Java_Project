public class AccountHolderFactory {

    public AccountHolder getAccountHolder(String accountType){

        if (accountType == null){
            return null;
        }

        if (accountType.equalsIgnoreCase("Savings")){
            return new SavingsAccountHolder();
        }

        if (accountType.equalsIgnoreCase("Current")){
            return new CurrentAccountHolder();
        }
        return null;
    }
}