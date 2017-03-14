package guiceruntimedependecy;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Driver {

    public static void main(String args[]) {
        Injector injector = Guice.createInjector(new GuiceRuntimeDependencyModule());
        ExampleUser user = injector.getInstance(ExampleUser.class);
        user.use();
    }
}
