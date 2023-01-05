import java.awt.*;

public class Bar {
    public static void main(String[] args) {
        Drink drink1 = new Drink();
        drink1.drinkName = "Mojito";
        drink1.drinkPrice = 13;
        drink1.alcohol = false;

        Ingredient ingredient1 = new Ingredient();
        ingredient1.name = "woda";
        ingredient1.amount = 60;
        drink1.ingredient1 = ingredient1;

        Ingredient ingredient2 = new Ingredient();
        ingredient2.name = "sok cytrynowy";
        ingredient2.amount = 80;
        drink1.ingredient2 = ingredient1;

        Ingredient ingredient3 = new Ingredient();
        ingredient3.name = "wódka";
        ingredient3.amount = 0;
        drink1.ingredient3 = ingredient1;

        int drinkCapacity = ingredient1.amount + ingredient2.amount + ingredient3.amount;

        System.out.println("Drink: " + drink1.drinkName + "\n" + "Cena: " + drink1.drinkPrice + "zł");
        System.out.println("Czy zawiera alkohol? " + drink1.alcohol);
        System.out.println("Składniki: " + "\n" + ingredient1.name + "\n" + ingredient2.name + "\n" + ingredient3.name);
        System.out.println("Pojemność: " + drinkCapacity + "ml");
    }
}
