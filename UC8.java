import java.util.HashMap;
import java.util.Map;

public class OOPSBannerAppU8 {

   
    public static Map<Character, String[]> getCharacterMap() {
        Map<Character, String[]> patterns = new HashMap<>();

        patterns.put('O', new String[]{
            "  *** ", " ** ** ", "** **", "** **", "** **", " ** ** ", "  *** "
        });
        patterns.put('P', new String[]{
            "****** ", "** **", "** **", "****** ", "** ", "** ", "** "
        });
        patterns.put('S', new String[]{
            " ***** ", "** ", "** ", " **** ", "    ** ", "    ** ", "***** "
        });

        return patterns;
    }

   
    public static void displayBanner(String message, Map<Character, String[]> patternMap) {
        for (int row = 0; row < 7; row++) {
            StringBuilder sb = new StringBuilder();
            for (char c : message.toUpperCase().toCharArray()) {
                String[] pattern = patternMap.get(c);
                if (pattern != null) {
                    sb.append(pattern[row]).append("  ");
                }
            }
            System.out.println(sb.toString());
        }
    }

    public static void main(String[] args) {
        
        Map<Character, String[]> characterLibrary = getCharacterMap();

     
        String message = "OOPS";

        
        System.out.println("--- OOPS Banner (UC8: HashMap & Rendering Function) ---");
        displayBanner(message, characterLibrary);
    }
}
