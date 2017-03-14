package guiceruntimedependecy;

import com.google.inject.AbstractModule;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.name.Named;
import com.google.inject.name.Names;

import java.util.Scanner;

public class GuiceRuntimeDependencyModule extends AbstractModule {

    protected void configure() {
        bind(ExampleDao.class).toProvider(ExampleDaoProvider.class);
        bind(String.class).toInstance((new Scanner(System.in).next()));
    }
}

class ExampleDaoProvider implements Provider<ExampleDao> {

    String aDependency;

    @Inject
    ExampleDaoProvider(String aDependency) {
        this.aDependency = aDependency;
    }

    public ExampleDao get() {
        if ("sql".equals(aDependency)) {
            return new SqlDao();
        }
        else {
            return new NosqlDao();
        }
    }
}
