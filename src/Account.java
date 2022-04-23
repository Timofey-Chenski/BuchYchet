public class Account {
    double debit;
    double credit;
    int amountOfGoods;
    int accountNumber;
    public Account(int accNumber, double startingDebitSum,int startingAmountOfGoods)
    {

        debit = startingDebitSum;
        credit = 0;
        accountNumber = accNumber;
        amountOfGoods = startingAmountOfGoods;

    }


}
