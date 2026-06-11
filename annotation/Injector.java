package annotation;

import java.lang.reflect.Field;

public class Injector {
    public static void injectDependencies(Object object){

        Class<?> cls = object.getClass();

        Field[] fields = cls.getDeclaredFields();

        for (Field field : fields) {

            if (field.isAnnotationPresent(Inject.class)) {

                try{
                    Object dependency = field.getType().getDeclaredConstructor().newInstance();

                    field.setAccessible(true);
                    field.set(object,dependency);
                    System.out.println("Injected: "+dependency.getClass().getSimpleName()+" into "+cls.getSimpleName());
                }catch(Exception e){
                    e.printStackTrace();
                }
                
            }
            
        }
    }
}
