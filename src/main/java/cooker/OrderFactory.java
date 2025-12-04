package cooker;

import java.util.Random;

public class OrderFactory {
    private static final Random rand = new Random();

    private static final String[] BASE_NAMES = new String[]{"White Rice Bowl", "Brown Rice Bowl", "Salad", "Burrito", "Tacos"};
    private static final String[] PROTEIN_NAMES = new String[]{"Chicken", "Beef", "Tofu"};
    private static final String[] SAUCE_NAMES = new String[]{"Sour Cream", "Chipotle Mayo", "BBQ", "Ranch"};


    public static FoodOrder generateOrder() {
        return new FoodOrder.OrderBuilder()
                .setBase(randBase())
                .setProtein(randProtein())
                .setSauce(randSauce())
                .build();
    }

    private static String randBase() {
        return BASE_NAMES[rand.nextInt(BASE_NAMES.length)];
    }

    private static String randProtein() {
        return PROTEIN_NAMES[rand.nextInt(PROTEIN_NAMES.length)];
    }

    private static String randSauce() {
        return SAUCE_NAMES[rand.nextInt(SAUCE_NAMES.length)];
    }
}
