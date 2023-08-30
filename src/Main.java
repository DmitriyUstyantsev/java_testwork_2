import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Raffle r = new Raffle();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("""
                    Главное меню:
                    1 - Добавить игрушку в розыгрыш, например (Robot. Pazzl. Doll)
                    2 - Сменить частоту выпадания определенной игрушки
                    3 - Начать розыгрыш и запись результата
                    0 - Выход
                    >\s""");
            var selection = sc.next();
            switch (selection) {
                case "1" -> r.addToy();
                case "2" -> r.setFrequency();
                case "3" -> r.raffle();
                case "0" -> {
                    System.out.println("Всё");
                    System.exit(0);
                }
                default -> System.out.println("Неправильный выбор. Попытайтесь снова.");
            }
        }
    }
}