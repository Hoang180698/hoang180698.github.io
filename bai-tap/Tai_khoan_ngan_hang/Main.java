public class Main {
    public static void main(String[] args) {
        Account account = new Account("Nguyen Van Hoang", "106003495648",
                                      "hoang180698@gmail.com", 2000000);
        
        account.displayInfo();

        account.recharge(310824000);
        account.changeEmail("hoang1806@gmail.com");    
        System.out.println("\nThong tin account moi: ");
        account.displayInfo();
                                  
    }
}
