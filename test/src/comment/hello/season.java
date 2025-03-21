package comment.hello;
import java.util.Scanner;

public class season
{
    public static void main(String[] args)
    {
        int month;
        Scanner input = new Scanner(System.in);
        System.out.print("请输入月份:");
        month = input.nextInt();
        switch (month)
        {
            case 12:
            case 1:
            case 2:
                System.out.print("It's winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.print("It's spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.print("It's summer");
            case 9:
            case 10:
            case 11:
                System.out.print("It's autumn");
                break;
            default:
                System.out.print("Invalid month");
        }
    }
}
