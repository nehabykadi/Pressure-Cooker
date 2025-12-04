package cooker;

public class FoodOrder {
    private final String base;
    private final String protein;
    private final String sauce;

    private FoodOrder(OrderBuilder builder) {
        this.base = builder.base;
        this.protein = builder.protein;
        this.sauce = builder.sauce;
    }

    @Override
    public String toString() {
        return base + " with " + protein + " and " + sauce;
    }

    public static class OrderBuilder {
        private String base;
        private String protein;
        private String sauce;

        public OrderBuilder setBase(String base) {
            this.base = base;
            return this;
        }
        public OrderBuilder setProtein(String protein) {
            this.protein = protein;
            return this;
        }
        public OrderBuilder setSauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public FoodOrder build() {
            return new FoodOrder(this);
        }
    }
}
