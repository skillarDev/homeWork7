import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cat[] cats = {
                new Cat("Барсик", 4),
                new Cat("Мурзик", 16),
                new Cat("Филипп", 5),
                new Cat("Пушок", 21),
        };
        Plate plate = new Plate(22);
        int addFood;
        int newFood;
        boolean check = true;
        for (Cat cat : cats) {
            cat.eat(plate);

            if (!cat.isFull() && check) {
                System.out.println("Подсыпать еду в тарелку?");
                do {
                    System.out.println("Введите: 1 - да, 0 - нет");
                    addFood = scanner.nextInt();
                } while (addFood != 0 && addFood != 1);
                if (addFood == 1) {
                    do {
                        System.out.println("Сколько подсыпать еды?");
                        newFood = scanner.nextInt();
                        plate.setFood(newFood);
                    } while (newFood <= 0);

                } else {
                    check = false;
                }
                cat.eat(plate);
            }
        }
    }
}
