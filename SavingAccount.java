import java.util.Scanner;  

class SavingAccount {

    double balance;
    static double interest;

    public SavingAccount(double balance){
        this.balance = balance;
    }

    public void CalMonthlyInterest(){
        double monthlyInterest = (balance * interest / 12) / 100;
        balance += monthlyInterest;
    }

    public static void ModifyInterest(double newInterest){
        interest = newInterest;
    }

    public void getdata(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account balance : ");
        this.balance = sc.nextDouble();
        System.out.println("Enter interest that you want  : ");
        ModifyInterest(sc.nextDouble());  
    }

    public void showBalance(){
        System.out.println("Balance is " + balance);
    }
    
    public static void main(String[] args) {
        SavingAccount S1 = new SavingAccount(0);
        SavingAccount S2 = new SavingAccount(0);

        System.out.println("Account 1 Information: ");
        S1.getdata();
        S1.showBalance();
        S1.CalMonthlyInterest();
        System.out.println("After appling user given interst");
        S1.showBalance();
        System.out.println();
        System.out.println("With default interest the balance is : ");
        S1.ModifyInterest(5.0);  
        S1.CalMonthlyInterest();
        S1.showBalance();

        System.out.println();
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println();

        System.out.println("Account 2 Information: ");
        S2.getdata();
        S2.showBalance();
        S2.CalMonthlyInterest();
        System.out.println("After appling user given interst : ");
        S2.showBalance();
        System.out.println();
        System.out.println("With default interest the balance is : ");
        S2.ModifyInterest(5.0);  
        S2.CalMonthlyInterest();
        S2.showBalance();
    }
}
