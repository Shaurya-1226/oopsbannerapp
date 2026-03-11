public class OOPSBannerAppRevamped {

    public static void main(String[] args) {
        System.out.println("--- OOPS Banner ---");
        printBanner();
    }

    public static void printBanner() {
        String[] bannerLines = {
            String.join("  ", "  *** ", "   *** ", "  **** ", "  ***** "),
            String.join("  ", " ** ** ", " ** ** ", "**  ** ", "** "),
            String.join("  ", "**   **", "**   **", "**  ** ", "** "),
            String.join("  ", "**   **", "**   **", "***** ", "  **** "),
            String.join("  ", "**   **", "**   **", "** ", "         ** "),
            String.join("  ", " ** ** ", " ** ** ", "** ", "         ** "),
            String.join("  ", "  *** ", "   *** ", " ** ", "     ***** ")
        };

        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}
