public class OOPSBannerAppRevamped {
    public static void main(String[] args) {
        // UC5: Declaring and initializing the array in a single statement
        String[] bannerLines = {
            String.join("  ", "  *** ", "   *** ", "  **** ", "  ***** "),
            String.join("  ", " ** ** ", " ** ** ", "**  ** ", "** "),
            String.join("  ", "**   **", "**   **", "**  ** ", "** "),
            String.join("  ", "**   **", "**   **", "***** ", "  **** "),
            String.join("  ", "**   **", "**   **", "** ", "         ** "),
            String.join("  ", " ** ** ", " ** ** ", "** ", "         ** "),
            String.join("  ", "  *** ", "   *** ",  " ** ", "     ***** ")
        };

        // Render the banner using an Enhanced For-Loop (for-each)
        System.out.println("--- OOPS Banner (UC5: Inline Array Initialization) ---");
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}
