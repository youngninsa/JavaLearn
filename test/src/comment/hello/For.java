package comment.hello;

public class For
{
    public static void main(String[] args)
    {
        /*
        for(int i=1;i<=9;i++)
        {
            int k = Math.min(i,10-i);
            for(int j=1;j<=k;j++)
                System.out.print("*");
            for(int j=1;j<=Math.abs(10-2*i);j++)
                System.out.print(" ");
            for(int j=1;j<=k;j++)
                System.out.print("*");
            System.out.println();
        }
        */
        /*
        for(int i=1;i<=7;i++)
        {
            int k=i<5 ?4-i :i-4;
            for(int j=1;j<=k;j++)
                System.out.print(" ");
            k=i<5 ?2*i-1 :2*(7-i)+1;
            for(int j=1;j<=k;j++)
                System.out.print("*");
            System.out.println();
        }
        */
        for(int i=1;i<=7;i++)
        {
            int k=i<5 ?4-i :i-4;
            for(int j=1;j<=k;j++)
                System.out.print(" ");
            k=i<5 ?2*i-1 :2*(7-i)+1;
            for(int j=1;j<=k;j++)
            {
                if(j==1 || j==k)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
