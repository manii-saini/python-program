
class Assignment6
 {
    private String holderName;
    private int accountNumber;
    private double balance;

    public Assignment6(String hn, int an, double b) {
        holderName=hn;
        accountNumber=an;
        balance=b;
    }

    public void deposit(double amount) {
        balance=amount+balance;
        System.out.println(holderName + " deposited: " + amount);
    }

    public void display() {
        System.out.println("Account Holder name: " + holderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

  class Demo
 {
    public static void main(String[] args) 
   {
        Assignment6 ass1 = new Assignment6("manish", 101, 5000);
        Assignment6 ass2 = new Assignment6("pawan", 102, 3000);

        ass1.deposit(2000);
        ass2.deposit(1500);
	System.out.println();
        ass1.display();
	System.out.println();
        ass2.display();
    }

}