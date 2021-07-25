import java.util.Scanner;

public class TestDome {
    public static int maxNum(int a,int b,int c){
        int ret=a>b?a:b;
        return ret>c?ret:c;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int n3 = scan.nextInt();
        int a=10;
        int b=20;

        int d=50;
        int c=maxNum(n1,n2,n3);
        System.out.println(c);
    }
    public static void main3(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 31; i >= 0 ; i-=2) {
            System.out.print((n>>i)&1);
        }
        System.out.println();
        for (int a = 30; a >=0 ; a-=2) {
            System.out.print((n>>a)&1);
        }
    }
    public static void main2(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if(((n>>i)&1)==1){
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main1(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int count=0;
        while(n!=0){
            n=n&(n-1);
            count++;

        }
        System.out.println(count);
    }
}
