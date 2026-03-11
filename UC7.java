public class OOPSBannerAppUC7  {

    public static class CharacterPatternMap {
        private final char character;
        private final String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() { 
            return character; 
        }

        public String[] getPattern() { 
            return pattern; 
        }
    }

    public static String buildBannerRow(CharacterPatternMap[] chars, int rowIndex) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            sb.append(String.format("%-8s", chars[i].getPattern()[rowIndex]));
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        String[] oPattern = {
                "  ****  ",
                " **  ** ",
                "**    **",
                "**    **",
                "**    **",
                " **  ** ",
                "  ****  "
        };

        String[] pPattern = {
                "******  ",
                "**   ** ",
                "**   ** ",
                "******  ",
                "**      ",
                "**      ",
                "**      "
        };

        String[] sPattern = {
                " *****  ",
                "**      ",
                "**      ",
                " *****  ",
                "      **",
                "      **",
                " *****  "
        };

        CharacterPatternMap charO = new CharacterPatternMap('O', oPattern);
        CharacterPatternMap charP = new CharacterPatternMap('P', pPattern);
        CharacterPatternMap charS = new CharacterPatternMap('S', sPattern);

        CharacterPatternMap[] oops = { charO, charO, charP, charS };

        System.out.println("--- OOPS Banner (UC7: Object-Oriented Approach) ---");
        for (int i = 0; i < 7; i++) {
            System.out.println(buildBannerRow(oops, i));
        }
    }
}
