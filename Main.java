import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dai = sc.nextInt();
        int rong = sc.nextInt();

        if (dai <= 0 || rong <= 0) {
            System.out.println("Dữ liệu không phù hợp");
        } else {
            int chuvi = (dai + rong) * 2;
            int dientich = dai * rong;
            System.out.println(chuvi + " " + dientich);
        }

        sc.close();
    }
}