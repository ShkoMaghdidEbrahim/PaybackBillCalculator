public class Main {
    public static void main(String[] args) {
        //        for (int i = 1; i < 11; i++) {
        //            if (i % 2 == 0)
        //            System.out.print(i + " ");
        //        }
        //
        //        System.out.println();
        //
        //        int i = 1;
        //        while (i < 11) {
        //            if (i % 2 == 0)
        //            System.out.print(i + " ");
        //            i++;
        //        }
        //
        //        for (int k = 1; k < 11; k++) {
        //            if (i / 2 * 2 == 0)
        //                System.out.print(i + " ");
        //        }
        
        //        for (int i = 1; i < 11; i++) {
        //            System.out.print(i + " Is ");
        //            modulus(i);
        //        }
        
        //        for (int i = 1; i < 11; i++) {
        //            for (int j = 1; j < 11; j++) {
        //                System.out.print(i * j + "\t");
        //            }
        //            System.out.println();
        //        }
        //        System.out.println();
        
        int payment = 100;
        int price = 73;
        
        payback(price, payment);
        
        boolean flag = true;
        for (int i = 2; i < 100; i++) {
            flag = true;
            for (int j = 2; j < 100; j++) {
                if (i % j == 0 && j != i) {
                    flag = false;
                    break;
                }
            }
            if (flag) System.out.println(i + " is prime");
        }
    }
    
    public static void payback(int price, int payment) {
        int payback = payment - price;
        int[] bills = new int[6];
        String[] billNames = {" 100$", " 50$", " 20$", " 10$", " 5$", " 1$"};
            if (payback > 100) {
                bills[0] = payback / 100;
                payback = payback % 100;
            }
            if (payback > 50) {
                bills[1] = payback / 50;
                payback = payback % 50;
            }
            if (payback > 20) {
                bills[2] = payback / 20;
                payback = payback % 20;
            }
            if (payback > 10) {
                bills[3] = payback / 10;
                payback = payback % 10;
                
            }
            if (payback > 5) {
                bills[4] = payback / 5;
                payback = payback % 5;
            }
            if (payback > 1) {
                bills[5]++;
                payback = payback - 1;
            }
        
        for (int i = 0; i < bills.length; i++) {
            if (bills[i] != 0) {
                System.out.println(bills[i] + billNames[i] + " Bill(s)");
            };
        }
    }
    
    public static void modulus(int num) {
        if (num / 2 * 2 == num) {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }
}