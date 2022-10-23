package main.Lesson12;


import java.util.HashMap;


public class uniqueWords {

    public static void main(String[] args) {
//
        String[] words = {"Клавиатура", "Мышь", "Лист", "Чашка", "Ноутбук", "Буквы", "Телефон",
                "Ручка", "Микрофон", "Мышь", "Ноутбук", "Лист", "Папка", "Стул", "Стол", "Лист",
                "Джава", "Мышь", "Ручка", "Лист", "Мышь", "Монитор", "Лист"};

        HashMap<String, Integer> speech = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            if (speech.containsKey(words[i])) {
                speech.put(words[i], speech.get(words[i]) + 1);
            } else {
                speech.put(words[i], 1);
            }
        }

        System.out.println(speech);

    }
}

