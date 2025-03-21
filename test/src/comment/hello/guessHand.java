package comment.hello;
import java.util.Scanner;
import java.util.Random;

public class guessHand
{
    public static void main(String[] args)
    {
        int play1,play2,index,count=0,win=0;
        int[] num = {0,2,5};
        System.out.println("----------欢迎来到石头剪刀布游戏3.0----------\n---------0表示石头,2表示剪刀,5表示布---------\n---------------输入-1停止游戏--------------");
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        while(true)
        {
            System.out.print("请玩家1输入:");
            play1 = input.nextInt();
            if(play1 == -1)
                break;
            else
                count++;
            if((play1!=0 && play1!=2 && play1!=5))
            {
                System.out.println("耍赖,你输了");
                continue;
            }
            index = random.nextInt(num.length);
            play2 = num[index];
            System.out.println("玩家2输入为:"+play2);

            if(play1 == play2)
                System.out.println("平局");
            else if((play1 == 0 && play2 == 2) || (play1 == 2 && play2 == 5) || (play1 == 5 && play2 == 0))
            {
                System.out.println("玩家1获胜");
                win++;
            }
            else
                System.out.println("玩家2获胜");
            System.out.println("你还要继续玩吗?");
        }
        System.out.printf("总共玩了%d局,共赢了%d局,胜率为%.2f%%",count,win,(double)win/count*100);
    }
}
