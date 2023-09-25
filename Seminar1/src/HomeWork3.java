public class HomeWork3 {
    public static void main(String[] args) {
        double a = 4.0;
        double b = 8.0;
        char op = '-';
        double result = calculate(op, a, b);
        switch (op){
            case '+':
            case '-':
            case '*':
            case '/':
                System.out.printf("%f %c %f = %f", a, op, b, result);
                break;
            default: System.out.println("Неверный оператор: " + op);
        }

    }

    static public Double calculate(char op, double num1, double num2){
        double res = 0;
        switch (op){
            case '+':
                res = num1 + num2;
                break;
            case '-':
                res = num1 - num2;
                break;
            case '*':
                res = num1 * num2;
                break;
            case '/':
                res = num1 / num2;
                break;
            default:
                throw new IllegalStateException("Неверный оператор: " + op);
        }
        return res;
    }
}
