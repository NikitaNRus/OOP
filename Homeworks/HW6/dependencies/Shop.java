package Homeworks.HW6.dependencies;

// Допустим мы пишем приложение для магазина и решаем вопросы с проведением оплат. Вначале это просто небольшой магазин, где оплата происходит только за наличные. Создаем класс Cash и класс Shop.

// class Cash {
//     public void doTransaction(BigDecimal amount){
//         //logic
//     }
// }

// public class Shop {
//     private Cash cash;
//     public Shop(Cash cash) {
//         this.cash = cash;
//     }
//     public void doPayment(Object order, BigDecimal amount){
//         cash.doTransaction(amount);
//     }
// }

// мы уже нарушили принцип инверсии зависимостей, так как мы тесно связали оплату наличными к нашему магазину. 
// И если в дальнейшем нам необходимо будет добавить оплату еще банковской картой и телефоном


public interface Payments {
    void doTransaction(BigDecimal amount);
}

public class Cash implements Payments{
    @Override
    public void doTransaction(BigDecimal amount) {
        //logic
    }
}

public class BankCard implements Payments{
    @Override
    public void doTransaction(BigDecimal amount) {
         //logic
    }
}

public class PayByPhone implements Payments {
    @Override
    public void doTransaction(BigDecimal amount) {
        //logic 
    }
}


public class Shop {
    private Payments payments;

    public Shop(Payments payments) {
        this.payments = payments;
    }

    public void doPayment(Object order, BigDecimal amount){
        payments.doTransaction(amount);
    }
}