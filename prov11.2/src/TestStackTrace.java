public class TestStackTrace {
    TestStackTrace(){
        divideByZero();
    }
    int divideByZero() {
            return 25/0;//деление на 0 в следующих деймтвиях приведет к ошибке, т.к. деление на невозможно
    }
    public static void main(String[] args) {
        try {
            new TestStackTrace();
        } catch (ArithmeticException h){
            System.out.println("Извините, на 0 делить нельзя!!!");
        }
    }
}