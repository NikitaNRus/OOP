package Homeworks.HW6.interfaces;

// interface BankAccounts {
//     void giveCash();
//     void takeCash();
//     void takeLoan();
// }

// class BasicAccount implements BankAccounts{

//     @Override
//     public void giveCash() {
//         // принимает кэщ
//     }

//     @Override
//     public void takeCash() {
//         // выдает кэш
//     }

//     @Override
//     public void takeLoan() {
//         // только для ВИП клиентов
//         throw new UnsupportedOperationException("Базовый счет не позволяет зачислить кредит");
//     }

// }

// нарушается принцип разделения интерфейсов, так как интерфейс включает в себя все действия различных типов счетов
// правильно разделить интерфейсы

interface GiveCash {
    void giveCash();
}

interface TakeCash {
    void takeCash();
}

interface TakeLoan {
    void takeLoan();
}