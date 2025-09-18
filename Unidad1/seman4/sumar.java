
class Calculadora {

    int sumar(int a, int b) {
        return a + b;
    }

    int sumar(int a, int b, int c) {
        return a + b + c;
    }

    float sumar(float a, float b) {
        return a + b;
    }
}

public class sumar {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("Suma de 2 enteros: " + calc.sumar(3, 4));
        System.out.println("Suma de 3 enteros: " + calc.sumar(1, 2, 3));
        System.out.println("Suma de 2 floats: " + calc.sumar(2.5f, 3.5f));
    }
}


