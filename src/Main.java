public class Main {
    public static void main(String[] args) {

        int balans = 500; // Начальная сумма баланса
        int purchase = 1598; // Сумма пополнения баланса абонента
        int bonus = purchase / 100; // Начисленный бонус

        if (purchase > 1000) {
            System.out.println("Уважаемый абонент! Спасибо, что пополнили счёт!" +
                    "\n Вы заплатили: " + (purchase) +
                    "\n Начислено бонусов: " + (bonus) +
                    "\n Зачислено на Ваш счёт: " + (balans + purchase + bonus));
        } else {
            System.out.println("Уважаемый абонент! Спасибо, что пополнили счёт!" +
                    "\n Вы заплатили: " + (purchase) +
                    "\n Зачислено на Ваш счёт: " + (balans + purchase));
        }

    }
}