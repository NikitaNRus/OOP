package Homeworks.HW6.openclose;

// public class NotificationService {
//     public void sendMessage(String typeMessage, String message) {
//         if (typeMessage.equals("email")) {
//             //write email
//             //use JavaMailSenderAPI
//         }
//         if (typeMessage.equals("sms")) {
//             //write sms
//             //send sms
//         }

//     }
// }

// Нарушается приницип открытости и закрытости, так как для добавления возможности отправить смс нам пришлось дописывать метод
// Создаем интерфейс с методом sendMessage
// затем создаем классы для каждого вида уведомления, которое сущесвует и расширяем интерфейс

public interface NotificationService {
    public void sendMessage(String message);
}

class EmailNotification implements NotificationService{
    @Override
    public void sendMessage(String message) {
        //write email
        //use JavaMailSenderAPI
    }
}

class MobileNotification implements NotificationService{
    @Override
    public void sendMessage(String message) {
        //write sms
        //send sms
    }
}