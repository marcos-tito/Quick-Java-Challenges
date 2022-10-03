package challenges;

public class CapitalizeWord {


    public static String capitalize(String word) {

        System.out.println(word);

        if(word.length()==0) {
            return word;
        }

        char[] wordCharArray = word.toCharArray();
        boolean shouldCapitalize = true;

        for(int i=0; i< wordCharArray.length ; i++) {
            char item =wordCharArray[i];

            if(Character.isWhitespace(item)){
                shouldCapitalize = true;
                continue;
            }
            if(!Character.isAlphabetic(item)) {
                shouldCapitalize = false;
            }
            if(shouldCapitalize) {
                wordCharArray[i] = Character.toUpperCase(item);
                shouldCapitalize = false;
            }
        }

        return String.valueOf(wordCharArray);
    }

}
