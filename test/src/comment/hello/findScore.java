package comment.hello;
import java.util.Scanner;

public class findScore
{
    public static void main(String[] args)
    {
        int score,basic = 425;
        Scanner input = new Scanner(System.in);
        System.out.print("please enter your score:");
        score = input.nextInt();
        if(score >= basic)
            System.out.print("congratulations!");
        else
            System.out.print("sorry,try again");
    }
}
