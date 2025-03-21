package comment.hello;
import java.util.Scanner;

public class getBMI
{
    public static void main(String[] args)
    {
        double weight,tall,BMI;
        Scanner input = new Scanner(System.in);
        System.out.print("please enter your weight(Kg):");
        weight = input.nextDouble();
        System.out.print("please enter your height(m):");
        tall = input.nextDouble();
        BMI = weight/(tall*tall);
        System.out.printf("您的BMI为:%.2f\n",BMI);
        if(BMI>=28)
            System.out.print("喂喂,有点太胖啦!管住嘴巴哦~");
        else if(BMI>=24)
            System.out.print("看起来有些超重呢,宝宝一起运动起来吧!");
        else if(BMI>=18.5)
            System.out.print("哇,完美的身材耶,宝宝继续保持哦!");
        else
            System.out.print("呜呜我的宝宝也太瘦了,今晚加餐!");
    }
}