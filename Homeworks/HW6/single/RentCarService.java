package Homeworks.HW6.single;

// public class RentCarService {
//     public Order orderCar(String carNo, Client client) {
//         //client order car
//         return order;
//     }

//     public void printOrder(Order order) {
//         //print order
//     }
// }

// Нарушается первый принцип единственной ответственности, так как включает в себя сразу несколько методов, 
// Изменение одного метода, потребует переписать другой метод, например изменение метода orderCar приведет к изменению метода
// printOrder 
// Чтобы решить проблему надо создать отдельные классы для каждой операции

class OrderService{
    public Order orderCar(String carNo, Client client) {
        //client order car
        return order;
    }
}

class PrinterService {
    public void printOrder(Order order) {
        //print order
    }
}
