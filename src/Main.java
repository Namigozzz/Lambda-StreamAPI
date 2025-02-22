public class Main {
    public static void main(String[] args) {
//        // Задача 1: Калькулятор
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);

        /*
         * Для корректной работы необходимо обернуть код в try-catch и обработать исключение
         * так как деление на 0 вызовет ArithmeticException
         */

        try {
            int c = calc.divide.apply(a, b);
            calc.println.accept(c);
        } catch (ArithmeticException e) {
            System.out.println("Деление на 0 запрещено!");
        }

        // Задача 2: Работяга
        Worker.OnTaskDoneListener listener = System.out::println;
        Worker worker = new Worker(listener);
        worker.start();
    }
}