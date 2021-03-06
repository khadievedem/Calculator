public class Brain {

    public static boolean isInteger(String number) {
        try {
            Integer.parseInt(number);
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }

    public static Integer RomanConverter(String number, Integer length) {
        Integer a,b, finalNumber = null;
        for (int i = 0; i < length; i++) {
            if (Dictionary.RomeToArabian(number.substring(0, length - i)) != null) {
                 a = Dictionary.RomeToArabian(number.substring(0, length - i));
                 if (i != 0) {
                     b = RomanConverter(number.substring(length - i), i);
                     finalNumber =  a + b;
                     break;
                 }
                 finalNumber =  a;
                 break;
            }
        } return finalNumber;
    }

    public static String Solution(int index, char sign, String mathProblem) {
        String firstPart = mathProblem.substring(0, index);
        String secondPart = mathProblem.substring(index + 1);

        double firstTerm = 0, secondTerm = 0;
        double solution = 0;

        if (isInteger(firstPart) & isInteger(secondPart)) {
            firstTerm = Double.parseDouble(mathProblem.substring(0, index));
            secondTerm = Double.parseDouble(mathProblem.substring(index + 1));
        } else {
            if (firstPart.length() > 15 | secondPart.length() > 15) {
                System.out.println("!!! Too big Roman number");
            } else {
                try {
                    firstTerm = RomanConverter(firstPart, firstPart.length());
                    secondTerm = RomanConverter(secondPart, secondPart.length());
                } catch (Exception e) {
                    return "Please, try another numbers";
                }
            }
        }

        if (sign == '-') {
            solution = firstTerm - secondTerm;
        } else if (sign == '+') {
            solution = firstTerm + secondTerm;
        } else if (sign == '*') {
            solution = firstTerm * secondTerm;
        } else if (sign == ':' | sign == '/') {
            solution = firstTerm / secondTerm;
        }

        if (!Double.isInfinite(solution)) {
            return mathProblem + "=" + solution;
        } else {
            return "You should not divide by zero";
            }
    }
}
