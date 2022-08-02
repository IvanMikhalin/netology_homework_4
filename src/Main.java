public class Main {
    public static void main(String[] args) {

        int ticketprice = 3741; // стоимость биллета
        int bonus_per_rubble = 20; // количества рублей для одной бонусной милли

        int bonus = ticketprice / bonus_per_rubble; // переменная для количества бонусов

        System.out.println("Стоимость билета: " + ticketprice + " руб.");
        System.out.println("Вам начисленно бонусных милль: " + bonus);

    }
}
