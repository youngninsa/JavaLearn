package comment.hello;

public class run
{
    public static void main(String[] args)
    {
        int count;
        for(count=1;count<=10;count++)
        {
            System.out.printf("第%d圈开始\n",count);
            if(count == 5)
                //continue;
                break;
            System.out.printf("第%d圈结束\n",count);
        }
    }
}
