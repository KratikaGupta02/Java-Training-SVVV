import java.util.Scanner;

class TrafficFine{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter speed:");
        int speed =sc.nextInt();
        int fine=0;
        if(speed>80 && speed<=100){
        fine = 500;
        }else if(speed >100){
            fine =1000;
        }
        System.out.println("Is violation repeated?(Y/N):");
        char flag = sc.next().charAt(0);
        if(flag =='Y'||flag=='y'){
            fine*=2;
        
        }
        System.out.println("Total fine:" +fine);
        sc.close();
    }
}