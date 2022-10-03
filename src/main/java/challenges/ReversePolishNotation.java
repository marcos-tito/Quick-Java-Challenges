package challenges;

import java.util.Objects;

public class ReversePolishNotation {

    private int att1;
    private int att2;
    private int att3;
    private int att4;

    /**
     * If the expression is empty or null
     * If don't have any operation, should return the highest element
     * 2 1 + 3 * should result 9
     *
     * @param expression
     * @return
     */
    public static int calculate(String expression) {
        System.out.println("expression = "+ expression);
        if (expression == null || expression.isBlank()) {
            return 0;
        }

        String[] terms = expression.split(" ");
        String operations = "+-*/";

        int[] stack = new int[terms.length];
        int cursor = -1;

        for (int i = 0; i < terms.length; i++) {
            String currentElement = terms[i];

            if (!operations.contains(currentElement)) {
                stack[++cursor] = Integer.parseInt(currentElement);
            } else {
                if ("+".equals(currentElement)) {
                    int first = stack[cursor--];
                    int second = stack[cursor];
                    stack[cursor] = second+first;
                }
                if ("-".equals(currentElement)) {
                    int first = stack[cursor--];
                    int second = stack[cursor];
                    stack[cursor] = second-first;
                }
                if ("*".equals(currentElement)) {
                    int first = stack[cursor--];
                    int second = stack[cursor];
                    stack[cursor] = second*first;
                }
                if("/".equals(currentElement)) {
                    int first = stack[cursor--];
                    int second = stack[cursor];
                    stack[cursor] = second/first;
                }
            }
        }
        System.out.println("Returning=> "+stack[cursor]);
        return stack[cursor];
    }

    private static void printStack (int[] stack) {
        for (int i = 0; i < stack.length; i++) {
            System.out.println("stack["+i+"] = "+stack[i]);
        }
        System.out.println("--------------------------");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReversePolishNotation that = (ReversePolishNotation) o;
        return att1 == that.att1 && att2 == that.att2 && att3 == that.att3 && att4 == that.att4;
    }

    @Override
    public int hashCode() {
        return Objects.hash(att1, att2, att3, att4);
    }
}
