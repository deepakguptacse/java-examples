package guiceruntimedependecy;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.name.Names;

import java.util.Scanner;

public class Driver {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Injector injector = Guice.createInjector(new ExampleModule());
        ExampleDao dao = injector.getInstance(Key.get(ExampleDao.class, Names.named(sc.next())));
        System.out.println(dao.getData());
    }
}
