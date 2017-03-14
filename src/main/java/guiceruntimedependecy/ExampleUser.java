package guiceruntimedependecy;

import com.google.inject.Inject;

class ExampleUser {

    @Inject ExampleDao exampleDao;

    void use() {
        System.out.println(exampleDao.getData());
    }

}
