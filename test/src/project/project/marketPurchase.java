package project.project;
import java.util.Scanner;

public class marketPurchase
{
    public static void main(String[] args)
    {
        int penCount,noteCount,shelfCount,pay,total;
        Scanner input = new Scanner(System.in);
        System.out.printf("请分别输入您要购买钢笔、笔记本、书架的数量及付款额:\n");
        penCount=input.nextInt();noteCount=input.nextInt();shelfCount=input.nextInt();pay=input.nextInt();
        total = 25*penCount+3*noteCount+10*shelfCount;
        System.out.printf("\t\t\t人工智能超市\n");
        System.out.printf("【欢迎光临，所有商品9折】\n");
        System.out.printf("品名\t\t单价\t\t数量\t\t金额\n");
        System.out.printf("------------------------------\n");
        System.out.printf("钢笔\t\t￥25\tX %d\t￥%d\n",penCount,25*penCount);
        System.out.printf("笔记本\t￥3\t\tX %d\t￥%d\n",noteCount,3*noteCount);
        System.out.printf("书架\t\t￥10\tX %d\t\t￥%d\n",shelfCount,10*shelfCount);
        System.out.printf("------------------------------\n");
        System.out.printf("件数\t\t%d\t\t合计\t\t￥%d\n",penCount+noteCount+shelfCount,total);
        System.out.printf("应付金额\t ￥%.0f\n",total*0.9);
        System.out.printf("收款    \t ￥%d\n",pay);
        System.out.printf("找零    \t ￥%.0f\n",pay-total*0.9);
        System.out.printf("本次交易所获积分: %d\n",(int)(total*0.9)/100*3);
        System.out.printf("------------------------------\n");
        System.out.printf("\t\t欢迎下次光临!!!\n");
    }
}
