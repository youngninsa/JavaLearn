package comment.hello;
import java.util.Random;

public class getRandomNum
{
    public static void main(String[] args)
    {
        Random rand = new Random();
        int num,count=1;
        for(num = rand.nextInt(1,10);num!=7;num=rand.nextInt(1,10),count++)
            System.out.println(num);
        System.out.printf("循环了%d次",count);
    }
}
