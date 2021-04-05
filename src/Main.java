import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập số tiền ban đầu: ");
        int money = sc.nextInt();
        System.out.print("nhập tỉ lệ lãi suất: ");
        double inRate = sc.nextDouble();
        System.out.print("nhập số tháng gửi: ");
        int month = sc.nextInt();

        double totalMoney = 0;
        for(int i = 0; i < month; i++){
            totalMoney += money * (inRate / 100) /12 * month;
        }

        System.out.println("Lãi suất nhận được là: "+totalMoney+ " sau "+month+" tháng");
    }
}
