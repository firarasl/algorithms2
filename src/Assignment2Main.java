public class Assignment2Main {

    public static void main(String[] args) {
        Account petersAccount = new Account(1010101, 4567);
        System.out.println(petersAccount.getAccountNumber());
        System.out.println(petersAccount.getPin());

        petersAccount.credit(5000.0);
        System.out.println(petersAccount.getBalance());

        System.out.println(petersAccount.debit(150.0, 4567));
        System.out.println(petersAccount.debit(150.0, 4577));
        System.out.println(petersAccount.debit(5500.0, 4567));
        System.out.println(petersAccount.getBalance());

        Account sallysAccount = new Account(1010102, 9984);
        System.out.println(petersAccount.transferTo(sallysAccount, 563.5, 4567));
        System.out.println(petersAccount.getBalance());
        System.out.println(sallysAccount.getBalance());

    }
}
