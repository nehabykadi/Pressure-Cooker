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

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

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
        System.out.println("Then, you have to type it as accurately as possible");
        System.out.println("Your customers will tip you if they like what they get...");
        System.out.println("Good luck!");
    }
}
