package report_bil;
import java.util.Scanner;

public class report_bill
{
    public static double balance = 0;
    public static String bill = "";
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        printMenu();
        while(choiceSystem(input.nextInt()))
            printMenu();
    }

    public static void printMenu() {
        System.out.println("----------爱记录·爱生活----------");
        System.out.println(" -----欢迎使用Ninsa记账系统------");
        System.out.println("1.收入支出明细");
        System.out.println("2.登记收入情况");
        System.out.println("3.登记支出情况");
        System.out.println("0.退出");
        System.out.print("请输入你要提供服务的功能:");
    }
    public static void printIncomeBill() {
        System.out.print("收入金额:");
        double income = input.nextDouble();
        System.out.print("收入来源:");
        String incomeBill = input.next();
        bill += "收入金额:" + income + "\t收入来源:"+ incomeBill + "\t当前余额:" + (balance += income)+"\n";
    }
    public static void printOutlayBill() {
        System.out.print("支出金额:");
        double outlay = input.nextDouble();
        System.out.print("支出去向:");
        String outlayBill = input.next();
        bill += "支出金额:" + outlay + "\t支出去向:"+ outlayBill + "\t当前余额:" + (balance -= outlay)+"\n";
    }
    public static boolean choiceSystem(int choice) {
        boolean flag = false;
        while(!flag)
        {
            switch (choice) {
                case 0: System.out.print("期待您的下次使用");return false;
                case 1: System.out.print(bill);flag=true;break;
                case 2: printIncomeBill();flag=true;break;
                case 3: printOutlayBill();flag=true;break;
                default: System.out.println("选择错误，请重新输入");
                        System.out.print("请输入你要提供服务的功能:");
                        choice = input.nextInt();
            }
        }
        return true;
    }
}
