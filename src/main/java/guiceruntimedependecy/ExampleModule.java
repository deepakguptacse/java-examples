package guiceruntimedependecy;

import com.google.inject.AbstractModule;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.Scopes;
import com.google.inject.name.Named;
import com.google.inject.name.Names;

import java.util.Scanner;

public class ExampleModule extends AbstractModule {

    protected void configure() {
        bind(ExampleDao.class).annotatedWith(Names.named("sql")).to(SqlDao.class).in(Scopes.SINGLETON);
        bind(ExampleDao.class).annotatedWith(Names.named("nosql")).to(NosqlDao.class).in(Scopes.SINGLETON);
    }
}