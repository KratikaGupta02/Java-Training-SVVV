import java.util.Scanner;

public class LoginAttempt {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        String demoUsername = "Kratika";
        String demopass = "123456789";

        System.out.println("======Login Yout Account========");
        boolean isLoggedin = false;
        int loginAttempt =0;
        System.out.println("Enter username: ");
        String username = sc.nextLine();
        do {
            System.out.println("Enter password: ");
            String password = sc.nextLine();
            if(username.equals(demoUsername)  && password.equals(demopass)){
                System.out.println("Login successfull!");
                isLoggedin = true;
                break;
            }else{
                System.out.println("Username or password is incorrect!");
                loginAttempt++;
            }
        } while (!isLoggedin && loginAttempt<3);
        if (loginAttempt >=3) {
            System.out.println("Account Locked!");
        }
    }
}