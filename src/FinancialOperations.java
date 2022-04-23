import java.util.Scanner;
public class FinancialOperations {
    public FinancialOperations()
    {}
    public void buyStuff(Account[] accountsList)
    {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Введите счет покупателя\n");
        int firstAccount= scan.nextInt();
        System.out.printf("Введите счет продавца\n");
        int secondAccount= scan.nextInt();
        System.out.printf("Сколько товара вы хотите купить\n");
        double amountOfGoods = scan.nextDouble();
        System.out.printf("За сколько вы хотите его купить\n");
        double amountOfMoney = scan.nextDouble();
        accountsList[firstAccount].credit += amountOfMoney;
        accountsList[firstAccount].amountOfGoods +=amountOfGoods;

        accountsList[secondAccount].debit += amountOfMoney;
        accountsList[secondAccount].amountOfGoods -=amountOfGoods;

    }
    public void sellStuff(Account[] accountsList)
    {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Введите счет покупателя\n");
        int firstAccount= scan.nextInt();
        System.out.printf("Введите счет продавца\n");
        int secondAccount= scan.nextInt();
        System.out.printf("Сколько товара вы хотите продать\n");
        double amountOfGoods = scan.nextDouble();
        System.out.printf("За сколько вы хотите его за продать\n");
        double amountOfMoney = scan.nextDouble();

        accountsList[firstAccount].credit += amountOfMoney;
        accountsList[firstAccount].amountOfGoods +=amountOfGoods;

        accountsList[secondAccount].debit += amountOfMoney;
        accountsList[secondAccount].amountOfGoods -=amountOfGoods;

    }
    public void showInfo(Account[] accountsList)
    {
        System.out.printf("Номер счета: "+accountsList[41].accountNumber+"\nОстаток: "+(accountsList[41].debit - accountsList[41].credit)+"\nКол-во товаров: "+accountsList[41].amountOfGoods+"\n\n");
        System.out.printf("Номер счета: "+accountsList[50].accountNumber+"\nОстаток: "+(accountsList[50].debit - accountsList[50].credit)+"\nКол-во товаров: "+accountsList[50].amountOfGoods+"\n\n");
        System.out.printf("Номер счета: "+accountsList[60].accountNumber+"\nОстаток: "+(accountsList[60].debit - accountsList[60].credit)+"\nКол-во товаров: "+accountsList[60].amountOfGoods+"\n\n");
        System.out.printf("Номер счета: "+accountsList[62].accountNumber+"\nОстаток: "+(accountsList[62].debit - accountsList[62].credit)+"\nКол-во товаров: "+accountsList[62].amountOfGoods+"\n\n");
        System.out.printf("Номер счета: "+accountsList[90].accountNumber+"\nОстаток: "+(accountsList[90].debit - accountsList[90].credit)+"\nКол-во товаров: "+accountsList[90].amountOfGoods+"\n\n");
    }
}
