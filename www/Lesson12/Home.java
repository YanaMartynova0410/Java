package main.Lesson12;

public class Home {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.add("95414", "Крокодил");
        phone.add("95415", "Слон");
        phone.add("95416", "Верблюд");
        phone.add("95417", "Крокодил");
        phone.add("95418", "Медведь");
        phone.add("95419", "Зайка");
        phone.add("95410", "Мартышка");
        phone.add("95412", "Медведь");

        System.out.println(phone.getPhoneByName("Медведь"));
        System.out.println(phone.getPhoneByName("95411"));

    }
}
