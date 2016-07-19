package springfx.data;

import java.util.List;

import springfx.model.Contact;

public interface DataAccessor extends AutoCloseable {
    List<Contact> loadData() ;
    void saveData(List<Contact> data);
}
