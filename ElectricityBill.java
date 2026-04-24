import java.util.Scanner;

class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of units: ");
        double units = sc.nextDouble();
        double bill = 0;
        if(units<=100){
            bill = units*1.5;
        }
        else if(units<=200){
            bill = 100*1.5+ (units-100)*3.5;

        }        
        else {
            bill = 100*1.5+100*3.5+ (units-200)*5;
        }
        bill = bill+50;
        System.out.println("Before add" + bill);

        if(bill>2000){
            double tenPer = bill*0.10;
            bill = bill+ tenPer;
        }
        System.out.println("Total Bill: Rs." + bill);

        sc.close();
    }
}

