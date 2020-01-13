package lambdas;

public interface ICalculadora 
{
    double operacion(double num1, double num2, String movimiento);

    String saludar();

    default void otherOperacion(double num){}
}