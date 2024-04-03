package oop1.oopEx;

public class Account {
    int balance; //잔액

    void deposit(int account) {
        balance += account;
    }
    void withdraw(int account) {
        if(balance >= account) {
            balance -= account;
        } else {
            System.out.println("잔액 부족");

        }
    }
}
