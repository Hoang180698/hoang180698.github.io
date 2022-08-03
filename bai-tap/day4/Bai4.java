public class Bai4 {
    public static void main(String[] args) {
        // Liệt kê 10 số nguyên tố đầu tiên
        int primeCount = 0;
        int num = 2;
        System.out.println("Mười số nguyên tố đầu tiên: ");
        while(primeCount < 10) {
           if (num == 2) {
               System.out.print(num +"\t");
               primeCount++;
               num++;
               continue;
           }
           boolean isPrime = true;
           for(int i = 2; i <= num / 2; i++) {
               int temp =  num % i;
               if(temp == 0){
                   isPrime = false;
                   break;
               }
           }
           if (isPrime == true) {
                System.out.print(num +"\t");
                primeCount++;
           }
           num++;
        }
        // Liệt kê các số nguyên tố nhỏ hơn 10
        System.out.println("\nCác số nguyên tố nhỏ hơn 10: ");
        for (int i = 2; i < 10; i++){
            boolean isPrime = true;
            for(int j = 2; j <= i/2; j++){
                int temp = i % j;
                if(temp == 0){
                    isPrime = false;
                    break;
                }             
            }
            if (isPrime == true){
                System.out.print(i +"   ");
            }
            
        }
    }
}
