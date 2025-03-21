package project.project;
import java.util.Scanner;

public class systemeModelPrint {
    public static void main(String[] args) {
        System.out.println("**********智慧校园管理系统**********");
        System.out.println("**********************************");
        System.out.println("         1、学生信息管理");
        System.out.println("         2、校园卡管理");
        System.out.println("         3、学生饭堂管理");
        System.out.println("         4、学生商铺管理");
        System.out.println("         5、退出");
        System.out.println("**********************************");
        System.out.println("请输入数字选择系统:");
        Scanner input = new Scanner(System.in);
        boolean flag = true;
        while (flag){
            int choice = input.nextInt();
            switch (choice){
                case 1:System.out.println("欢迎进入学生信息管理系统");flag = false;break;
                case 2:System.out.println("欢迎进入校园卡管理系统");flag = false;break;
                case 3:System.out.println("欢迎进入学生饭堂管理系统");flag = false;break;
                case 4: System.out.println("欢迎进入学生商铺管理系统");flag = false;break;
                case 5: System.out.println("退出系统");return;
                default:System.out.println("输入有误,请重新选择");
            }
        }
    }
}
