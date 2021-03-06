public class numberInspector {

    public String Inspect(String numbers) {
        int index = 0;
        char sign = 'z';

        String mathProblem = numbers.replaceAll("\\s", "");

        if (mathProblem.indexOf('*') > -1) {
            index = mathProblem.indexOf('*');
            sign = '*';
        } else if (mathProblem.indexOf('+') > -1) {
            index = mathProblem.indexOf('+');
            sign = '+';
        } else if (mathProblem.indexOf('-') > -1) {
            index = mathProblem.indexOf('-');
            sign = '-';
        } else if (mathProblem.indexOf(':') > -1) {
            index = mathProblem.indexOf(':');
            sign = '/';
        } else if (mathProblem.indexOf('/') > -1) {
            index = mathProblem.indexOf('/');
            sign = '/';
        }

        return Brain.Solution(index,sign, mathProblem);
    }
}
