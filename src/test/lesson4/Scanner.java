package test.lesson4;

public class Scanner {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.print("Введите логин: ");
        String login = scan.nextLine();
        System.out.print("Введите пароль: ");
        String pass = scan.nextLine();
        if ((login.equals("admin") || login.equals("Admin")) && pass.equals("123") ){
            System.out.println("Все пользователи:");
        }
        else if (!pass.equals("123")) {
            System.out.println("Введен неправильный пароль");
        }
        else {
            System.out.println("Как вас зовут?");
            String name = scan.nextLine();
            System.out.println("Hello, " + name);
        }
    }
}
