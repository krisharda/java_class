import java.util.Scanner;


public class assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("check "+(a+=b));
        System.out.println("see"+(a));
        System.out.println("check "+(a-=b));
        System.out.println("see"+(a));
        System.out.println("check "+(a*=b));
        System.out.println("see"+(a));
        System.out.println("check "+(a/=b));
        System.out.println("see"+(a));
        System.out.println("check "+(a%=b));
        System.out.println("see"+(a));
    }   
}