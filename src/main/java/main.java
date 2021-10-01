import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int s1 = s/1000;
        int s2 = s%1000;

    }
    public static boolean LuckyTicket(int s1, int s2){
        if ((s1&10+s1/100+s1%100/10) == (s2&10+s2/100+s2%100/10)){
            return true;
        } else
            return false;
    }
}
