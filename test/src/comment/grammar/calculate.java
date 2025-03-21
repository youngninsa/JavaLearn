package comment.grammar;
import java.util.Random;
import java.util.Scanner;

public class calculate {
    public static int score=0;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        printmodel();
        int choice=0,model = input.nextInt();
        if(model != 3)
        {
            printmenu();
            choice = input.nextInt();
        }
        getQuestion(choice,model);
        System.out.printf("Your score:%d",score);
    }
    public static void add(int a, int b) {
        Scanner input = new Scanner(System.in);
        while(true)
        {
            System.out.printf("%d+%d=",a,b);
            int ans = input.nextInt();
            if(ans==a+b)
            {
                System.out.print("Correct!\n");
                score+=10;
                break;
            }
            else
                System.out.print("fucking idiot shit! You'd better do it again\n");
        }
    }
    public static void sub(int a, int b) {
        Scanner input = new Scanner(System.in);
        while(true)
        {
            System.out.printf("%d-%d=",a,b);
            int ans = input.nextInt();
            if(ans==a-b)
            {
                System.out.print("Correct!\n");
                score+=10;
                break;
            }
            else
                System.out.print("fucking idiot shit! You'd better do it again\n");
        }
    }
    public static void mul(int a, int b) {
        Scanner input = new Scanner(System.in);
        while(true)
        {
            System.out.printf("%dx%d=",a,b);
            int ans = input.nextInt();
            if(ans==a*b)
            {
                System.out.print("Correct!\n");
                score+=10;
                break;
            }
            else
                System.out.print("fucking idiot shit! You'd better do it again\n");
        }
    }
    public static void div(int a, int b) {
        Scanner input = new Scanner(System.in);
        while(true)
        {
            System.out.printf("%d/%d= ...... ",a,b);
            int ans = input.nextInt();
            int mod = input.nextInt();
            if(ans==a/b && mod==a%b)
            {
                System.out.print("Correct!\n");
                score+=10;
                break;
            }
            else
                System.out.print("fucking idiot shit! You'd better do it again\n");
        }
    }
    public static void printmenu() {
        System.out.print("-------------------------------------------------------------------------------\n");
        System.out.print("\t\t\t\t\t|\t\t\t1.addition\t\t\t\t\t|\n");
        System.out.print("\t\t\t\t\t|\t\t\t2.subtraction\t\t\t\t|\n");
        System.out.print("\t\t\t\t\t|\t\t\t3.multiplication\t\t\t|\n");
        System.out.print("\t\t\t\t\t|\t\t\t4.division\t\t\t\t\t|\n");
        System.out.print("\t\t\t\t\t|\t\t\t5.exit\t\t\t\t\t\t|\n");
        System.out.print("--------------------------------------------------------------------------------\n");
        System.out.print("Please choose the operation you want to perform:");
    }
    public static void printmodel() {
        System.out.print("----------Welcome to use The Arithmetic Calculations Self-test System----------\n");
        System.out.print("--------1.one question by once-----2.ten question by once-----3.mixture---------\n");
    }
    public static void getQuestion(int choose,int mod) {
        Random rand = new Random();
        boolean flag=false;
        int num=10;
        if(mod == 1)
            num=1;
        if(mod == 3)
            flag=true;
        for(int i=1;i<=num;i++)
        {
            int num1= rand.nextInt(100)+1,num2=rand.nextInt(100)+1;
            if(flag)
                choose=rand.nextInt(4)+1;
            switch(choose)
            {
                case 1:add(num1,num2);break;
                case 2:sub(num1,num2);break;
                case 3:mul(num1,num2);break;
                case 4:div(num1,num2);break;
                case 5:System.out.print("Looking forward to your visit!");return;
                default:System.out.print("Other function is developing!");return;
            }
        }
    }
}
