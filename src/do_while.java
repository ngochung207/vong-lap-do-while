import java.util.Scanner;

public class do_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pass;
        do{
            System.out.println("Nhập lại mật khẩu: ");
            pass = sc.nextLine();
        } while (!pass.equals("vung oi mo ra"));
    }
}
