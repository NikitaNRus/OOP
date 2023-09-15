package Homeworks.HW5_1;

// Создайте класс UserView, который будет отвечать за отображение информации о пользователе и взаимодействие с пользователем. 
// Этот класс будет содержать методы для отображения формы регистрации, формы входа, формы изменения пароля и т.д. 
// Он также будет содержать методы для получения введенных пользователем данных.
import java.util.Scanner;

public class UserView {
    private Scanner scanner;

    public UserView() {
        scanner = new Scanner(System.in);
    }

    public String getInput(String prompt) {
        System.out.print(prompt + ": ");
        return scanner.nextLine();
    }

    public void showMessage(String message) {
        System.out.println(message);
    }

    public static void userIteraction() {
        UserModel user = UserModel.loadFromFile("users.txt");
        UserView view = new UserView();
        UserPresenter presenter = new UserPresenter(user, view);

        int choice = 0;
        while (choice != 4) {
            System.out.println("1. Зарегистрироваться");
            System.out.println("2. Войти");
            System.out.println("3. Изменить пароль");
            System.out.println("4. Выйти");
            choice = Integer.parseInt(view.getInput("Введите дейсвие"));

            switch (choice) {
                case 1:
                    presenter.registerUser();
                    break;
                case 2:
                    presenter.loginUser();
                    break;
                case 3:
                    presenter.changePassword();
                    break;
                case 4:
                    break;
                default:
                    view.showMessage("Такого результата выбота не существует");
                    break;

            }
        }
    }
}
