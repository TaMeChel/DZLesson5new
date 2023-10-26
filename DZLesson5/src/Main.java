import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();
        System.out.print("Выберите нужную операцию 1 = +, 2 = -, 3 = *, 4 = /: ");
        int d = scanner.nextInt();
        Scanner.close();

        switch (d) {
            case 1:
                sum(a, b);
                break;
            case 2:
                razn(a, b);
                break;
            case 3:
                proizv(a, b);
                break;
            case 4:
                del(a, b);
                break;
            default:
                System.out.println("Ошибка. Повторите ввод.");
        }

    }

    public static void razn(int a, int b) {
        int z = a - b;
        System.out.printf("Разность: " + z);
    }

    public static void sum(int a, int b){
        int z = a + b;
        System.out.printf("Сумма: " + z);
    }

    public static void proizv(int a, int b){
        int z = a * b;
        System.out.printf("Произведение: " + z);
    }

    public static void del(int a, int b){
        int z = a / b;
        System.out.printf("Частное: " + z);
    }
}