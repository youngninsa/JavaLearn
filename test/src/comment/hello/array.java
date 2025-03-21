package comment.hello;

import java.util.Scanner;

public class array {
    public static int len=0;
    public static void main(String[] args) {
        int []arr = new int[10];
        Scanner input = new Scanner(System.in);

        for(int i = 0;i<5;i++){
            System.out.printf("please enter %dth number:",i+1);
            if(!attend(arr,input.nextInt()))
            {
                System.out.print("array is already full\n");
                break;
            }
        }
        printarr(arr);

        System.out.print("please enter the insert number and index:");
        if(!inserte(arr,input.nextInt(),input.nextInt()))
            System.out.print("array is already full\n");
        else
            printarr(arr);

        System.out.print("please enter the delete number:");
        if(!delete(arr,input.nextInt()))
            System.out.print("target is not in array");
        else
            printarr(arr);

        System.out.print("please enter the update number and target:");
        if(!update(arr,input.nextInt(),input.nextInt()))
            System.out.print("update number is not in array");
        else
            printarr(arr);

        System.out.print("please enter the find number:");
        int index;
        if((index = find(arr,input.nextInt())) == -1)
            System.out.println("this number is not found");
        else
            System.out.printf("this number is in %dth",index);
    }

    public static boolean attend(int[] arr,int target) {
        if(len <= arr.length)
        {
            arr[len] = target;
            len++;
            return true;
        }
        return false;
    }
    public static boolean inserte(int[] arr,int target,int index) {
        if(len < arr.length)
        {
            if(index <= len)
            {
                for(int i=len;i>index;i--)
                    arr[i] = arr[i-1];
                arr[index] = target;
                len++;
                return true;
            }
        }
        return false;
    }
    public static boolean delete(int[] arr,int target) {
        int index = find(arr,target);
        if(index == -1)
            return false;
        for(int i=index;i<arr.length-1;i++)
            arr[i] = arr[i+1];
        len--;
        return true;
    }
    public static boolean update(int[] arr,int target,int newtarget) {
        int index = find(arr,target);
        if(index == -1)
            return false;
        arr[index] = newtarget;
        return true;
    }
    public static int find(int[] arr,int target) {
        for (int i=0;i<arr.length;i++)
            if(arr[i] == target)
                return i;
        return -1;
    }
    public static void printarr(int[] arr) {
        for (int i=0;i<len;i++) System.out.printf("%d ", arr[i]);
        System.out.println();
    }
}
