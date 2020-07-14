package ru.shakov.lesson13;

import java.util.Random;

class TastePreferences extends Exception {
    @Override
    public String toString() {
        return "еда не понравилась";
    }
}

public class Mather {

    public static void main(String[] args){

        try {
            Random random = new Random();
            int newRandom = random.nextInt(Food.values().length);       // Генерируем случайное число [0, 4), где 4 это "длина" массива enum
            //System.out.println(newRandom);

            // По сгенерированному числу (принимаем его за порядковый номер в enum) выводим выбранную еду
            String good = Food.chosenFood(newRandom);
            System.out.println("Мама дает ребенку " + good);
            // Вызываем метод "Кормим ребенка" и выводим его реакцию, или исключение, если еда не понравилась
            System.out.println(Child.eat(good));
        } catch (TastePreferences tp) {
            System.out.println("Исключение: " + tp.toString());
        } finally {
            // Сообщение будет выведено не зависимо, сработало исключение, или нет
            System.out.println("Спасибо, мама!");
        }

    }
}
