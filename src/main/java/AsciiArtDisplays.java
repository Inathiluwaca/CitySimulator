public class AsciiArtDisplays {

    private static final String RESET = "\u001B[0m";
    private static final String RED = "\u001B[31m";
    private static final String GREEN = "\u001B[32m";
    private static final String BLUE = "\u001B[34m";
    private static final String YELLOW = "\u001B[33m";
    private static final String CYAN = "\u001B[36m";

    public void welcomeArt() throws InterruptedException {
        String[] cityGraphics = {
                CYAN + "         __||__" + RESET,
                GREEN + "     ____|_  _|____" + RESET,
                BLUE + "     '-|          |-'" + RESET,
                YELLOW + "       |   CITY   |" + RESET,
                RED + "       | SIMULATOR|" + RESET,
                GREEN + "      /_\\________/_\\" + RESET,
                CYAN + "   __|______________|__" + RESET,
                BLUE + "  |____________________|" + RESET
        };

        for (String line : cityGraphics) {
            System.out.println(line);
            Thread.sleep(300);
        }
        Thread.sleep(500);
        System.out.println(YELLOW + "🏙️ Welcome to the Ultimate City Simulator! 🏙️✨");
    }


}
