package cooker;

public class PressureCooker {
    private PlayerProfile playerProfile;
    private OrderFactory orderFactory;


    public PressureCooker(PlayerProfile playerProfile) {
        this.playerProfile = playerProfile;
        this.orderFactory = new OrderFactory();
    }

    public PressureCooker(PlayerProfile playerProfile,  OrderFactory orderFactory) {
        this.playerProfile = playerProfile;
        this.orderFactory = orderFactory;
    }

    public void displayWelcomeMessage() {
        System.out.println(" _       ____  _     __    ___   _      ____     _____  ___  \n" +
                "\\ \\    /| |_  | |   / /`  / / \\ | |\\/| | |_       | |  / / \\ \n" +
                " \\_\\/\\/ |_|__ |_|__ \\_\\_, \\_\\_/ |_|  | |_|__      |_|  \\_\\_/ ");

        pauseDisplay(2000);

        System.out.println(" (   (       (   (         (                 )     )     )     (     \n" +
                " )\\ ))\\ )    )\\ ))\\ )      )\\ )        (  ( /(  ( /(  ( /(     )\\ )  \n" +
                "(()/(()/((  (()/(()/(   ( (()/((       )\\ )\\()) )\\()) )\\())(  (()/(  \n" +
                " /(_))(_))\\  /(_))(_))  )\\ /(_))\\    (((_|(_)\\ ((_)\\|((_)\\ )\\  /(_)) \n" +
                "(_))(_))((_)(_))(_)) _ ((_|_))((_)   )\\___ ((_)  ((_)_ ((_|(_)(_))   \n" +
                "| _ \\ _ \\ __/ __/ __| | | | _ \\ __| ((/ __/ _ \\ / _ \\ |/ /| __| _ \\  \n" +
                "|  _/   / _|\\__ \\__ \\ |_| |   / _|   | (_| (_) | (_) |' < | _||   /  \n" +
                "|_| |_|_\\___|___/___/\\___/|_|_\\___|   \\___\\___/ \\___/_|\\_\\|___|_|_\\  \n" +
                "                                                                     ");
    }

    public void displayGameRules(){
        System.out.println("In each round, you will see an order flash on screen");
        pauseDisplay(1500);
        System.out.println("Then, you have to type it as accurately as possible");
        pauseDisplay(1500);
        System.out.println("Your customers will tip you if they like what they get...");
        pauseDisplay(2500);
        System.out.println("Good luck!");
        pauseDisplay(4000);
        System.out.println("------------------------------------------------------------------");
    }

    public void displayOrder(FoodOrder order, int delayMilliseconds) {
        clearScreen();
        System.out.println("----- NEW ORDER -----");
        System.out.println(order.toString());

        pauseDisplay(delayMilliseconds);

        clearScreen();
    }

    private void pauseDisplay(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
