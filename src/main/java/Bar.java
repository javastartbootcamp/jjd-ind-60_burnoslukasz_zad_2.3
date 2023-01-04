import java.awt.*;

public class Bar {
    public static void main(String[] args) {
        Drink drink1 = new Drink();
        drink1.drinkName = "Mojito";
        drink1.drinkPrice = 13;
        drink1.alcohol = false;

        Ingredient ingredient1 = new Ingredient();
        ingredient1.ingrName = "woda";
        ingredient1.ingrAmount = 60;
        drink1.ingredient1 = ingredient1;

        Ingredient ingredient2 = new Ingredient();
        ingredient2.ingrName = "sok cytrynowy";
        ingredient2.ingrAmount = 80;
        drink1.ingredient2 = ingredient1;

        Ingredient ingredient3 = new Ingredient();
        ingredient3.ingrName = "wódka";
        ingredient3.ingrAmount = 0;
        drink1.ingredient3 = ingredient1;

        int drinkCapacity = ingredient1.ingrAmount + ingredient2.ingrAmount + ingredient3.ingrAmount;

        System.out.println("Drink: " + drink1.drinkName + "\n" + "Cena: " + drink1.drinkPrice + "zł");
        System.out.println("Czy zawiera alkohol? " + drink1.alcohol);
        System.out.println("Składniki: " + "\n" + ingredient1.ingrName + "\n" + ingredient2.ingrName + "\n" + ingredient3.ingrName);
        System.out.println("Pojemność: " + drinkCapacity + "ml");
    }
}
