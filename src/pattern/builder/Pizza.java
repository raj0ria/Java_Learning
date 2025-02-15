package pattern.builder;

public class Pizza {
    private String pizzaSize;
    private boolean cheese;
    private boolean pepperoni;
    private boolean mushroom;

    private Pizza(PizzaBuilder builder) {
        this.pizzaSize = builder.size;
        this.cheese = builder.cheese;
        this.pepperoni = builder.pepperoni;
        this.mushroom = builder.mushroom;
    }

    public static class PizzaBuilder {
        private String size;
        private boolean cheese;
        private boolean pepperoni;
        private boolean mushroom;

        public PizzaBuilder(String size) {
            this.size = size;
        }
    }
}
