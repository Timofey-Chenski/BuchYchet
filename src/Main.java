import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        FinancialOperations financialOperations = new FinancialOperations();
        Account[] accountsList = new Account[100];
        createAccounts(accountsList);
        int menuNumber = 8;
        while (menuNumber != 0)
        {
           System.out.printf("1. Провести операцию между счетами \n" +
                             "2. Просмотреть состояние доступных счетов\n" +
                             "3. Выход\n");
            menuNumber = scan.nextInt();
            switch (menuNumber)
            {
                case 1:
                    while (menuNumber != 8)
                    {
                        System.out.printf("Какую операцию вы хотите провести?\n" +
                                          "1. Покупка\n" +
                                          "2. Продажа\n" +
                                          "3. Выход\n");
                        menuNumber = scan.nextInt();
                        switch (menuNumber)
                        {
                            case 1:
                                financialOperations.buyStuff(accountsList);
                                break;
                            case 2:
                                financialOperations.sellStuff(accountsList);
                                break;
                            default:
                                menuNumber = 8;
                                break;
                        }

                    }
                    break;
                case 2:
                    financialOperations.showInfo(accountsList);
                    break;
                case 3:
                    menuNumber = 0;
                    break;
                default:
                    System.out.printf("Вы ввели неправильную цифру, попробуйте ещё раз\n");
                    menuNumber = 8;
                    break;

            }
        }
    }

    public static void createAccounts(Account[] accountsList)
    {
        accountsList[41] = new Account(41,10000,0);
        accountsList[50] = new Account(50,1000,600);
        accountsList[60] = new Account(60,0,250);
        accountsList[62] = new Account(62,0,100);
        accountsList[90] = new Account(90,6000,0);
    }
}
