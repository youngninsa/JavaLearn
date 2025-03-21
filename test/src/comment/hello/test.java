package comment.hello;
import java.util.Scanner;

public class test
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num,count = 0;
        boolean flag = false;
        System.out.print("请输入十个数:");
        for(int i=1;i<=10;i++)
        {
            num = input.nextInt();
            if(num > 0)
                count++;
            if(num == 666)
            {
                flag = true;
                break;
            }
        }
        System.out.printf("正数有%d个\n",count);
        if(flag)
            System.out.print("正常退出");
        else
            System.out.print("被迫退出");
    }
}
