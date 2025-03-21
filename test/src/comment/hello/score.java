package comment.hello;
import java.util.Scanner;

public class score
{
    public static void main(String[] args)
    {
        int score;
        Scanner input = new Scanner(System.in);
        System.out.print("请输入成绩:");
        score = input.nextInt();
        if (score >= 90 && score <= 100)
            System.out.print("A");
        else if (score >= 80)
            System.out.print("B");
        else if (score >= 70)
            System.out.print("C");
        else if (score >= 60)
            System.out.print("D");
        else if(score >= 0)
            System.out.print("E");
        else
            System.out.print("不合法的成绩");
    }
}
