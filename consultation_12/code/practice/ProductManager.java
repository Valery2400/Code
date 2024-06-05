package consultation_12.code.practice;



import java.util.*;

public class ProductManager {

    private Set<Product> products;

    public ProductManager() {
        this.products = new HashSet<>();
    }

    public boolean addProduct(Product product){
        if (!products.contains(product)) {
            products.add(product);
            return true;
        } else {
            return false;
        }
    }

    public boolean removeContact(Product product){
        if (products.contains(product)) {
            products.remove(product);
            return true;
        } else {
            return false;
        }
    }

//    public void getAllContacts(){
//        TreeSet<Product> contactsSorted = new TreeSet<>(new ContactComparator());
//        contactsSorted.addAll(contacts);
//        System.out.println(contactsSorted);
//    }
//
//    public List<Contact> getContactByName(String name){
//        List<Contact> foundedContactsByName = new ArrayList<>();
//        for (Contact contact : contacts){
//            if (contact.getName().equals(name)){
//                foundedContactsByName.add(contact);
//            }
//        }
//
//        return foundedContactsByName;
//    }
//
//    public List<Contact> getContactByPhoneNumber(String phoneNumber){
//        List<Contact> foundedContactsByPhoneNumber = new ArrayList<>();
//        for (Contact contact : contacts){
//            if (contact.getPhoneNumber().equals(phoneNumber)){
//                foundedContactsByPhoneNumber.add(contact);
//            }
//        }
//
//        return foundedContactsByPhoneNumber;
//    }
//}
}





