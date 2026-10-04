class Account {
    private String accountName;
    private String password;
    private int balance;

    public Account(String accountName, String password, int balance) {
        this.accountName = accountName;
        this.password = password;
        this.balance = balance;
    }

    // getMoney：提領
    public void getMoney(int money) {
        balance -= money;
    }

    public void saveMoney(int money) {
        balance += money;
    }

    // 驗證帳號密碼
    public boolean checkAccount(String accountName, String password) {
        return this.accountName.equals(accountName)
                && this.password.equals(password);
    }

    public int getBalance() {
        return balance;
    }
}

public class DesignATM {
    public static void main(String[] args) {

        Account myAccount = new Account("RichMan", "abc123", 8000);

        boolean check = myAccount.checkAccount("RichMan", "abc123");
        System.out.println("帳號密碼驗證：" + check);

        myAccount.getMoney(3000);
        System.out.println("提領3000後餘額：" + myAccount.getBalance());

        myAccount.saveMoney(5000);
        System.out.println("存款5000後餘額：" + myAccount.getBalance());
    }
}