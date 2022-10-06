
public class Account {
    private int accountNumber;
    private int pin;
    private double balance;

    public Account(int accountNumber, int pin) {
        this.accountNumber = accountNumber;
        int temp, checksum = 0;
        while (pin > 0) {
            temp = pin % 10;
            checksum += temp;
            pin = pin / 10;
        }
        this.pin = checksum;
        this.balance = 0;

    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getPin() {
        return pin;
    }

    public double getBalance() {
        return balance;
    }


    public void credit(double amount) {
        this.balance += amount;
    }

    public boolean debit(double amount, int pin) {
        int temp, checksum = 0;
        while (pin > 0) {
            temp = pin % 10;
            checksum += temp;
            pin = pin / 10;
        }
        if (checksum == this.pin && this.balance >= amount) {
            this.balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    public boolean transferTo(Account recipient, double amount, int pin) {
        int temp, checksum = 0;
        while (pin > 0) {
            temp = pin % 10;
            checksum += temp;
            pin = pin / 10;
        }
        if (checksum == this.pin && this.balance >= amount) {
            this.balance -= amount;
            recipient.balance += amount;
            return true;
        } else {
            return false;
        }
    }


}
