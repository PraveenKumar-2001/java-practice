package annotation;

/**
 * Reflection and annotation
 *
 */
public class Main 
{
    public static void main( String[] args )
    {
       Car car=new Car();
       Injector.injectDependencies(car);

       car.drive();
    }
}
