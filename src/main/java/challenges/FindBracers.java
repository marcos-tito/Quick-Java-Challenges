package challenges;

public class FindBracers {

    public static boolean isValidBracers(String bracers) {

        if (bracers == null || bracers.isBlank()) {
            return false;
        }

        char[] bracersArray = bracers.toCharArray();
        char[] stack = new char[bracersArray.length];
        int cursor = -1;

        for (int i = 0; i < bracersArray.length; i++) {
            char current = bracersArray[i];
// {[()]}
            if (current == '(' ||
                    current == '{' ||
                    current == '[') {
                stack[++cursor] = current;
            } else {
                if(cursor < 0) {
                    return false;
                } else
                    if ((current == ')' && stack[cursor] != '(') ||
                            (current == '}' && stack[cursor] != '{') ||
                            (current == ']' && stack[cursor] != '[')) {
                        return false;
                    }
                cursor--;
            }
        }

        return true;
    }
}
