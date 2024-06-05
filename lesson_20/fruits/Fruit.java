package fruits;

public class Fruit {
   private String [] vitamins;
   private int sugar;

   public Fruit(String[] vitamins, int sugar) {
      this.vitamins = vitamins;
      this.sugar = sugar;
   }

   public String[] getVitamins() {
      return vitamins;
   }

   public int getSugar() {
      return sugar;
   }

}
