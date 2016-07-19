package springfx.model;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.ObservableList;

public interface Model {
    
    /** 
     * 
     * @return The list of all {@code Contact}s in the model.
     */
    ObservableList<Contact> getContactList();

    void addContact(Contact contact) ;
    void removeContact(Contact contact);
    
    ObjectProperty<Contact> currentContactProperty();
    Contact getCurrentContact() ;
    void setCurrentContact(Contact contact) ;
    
    StringProperty searchFilterProperty() ;
    String getSearchFilter() ;
    void setSearchFilter(String filter) ;
    
    boolean passesFilter(Contact contact);
}
