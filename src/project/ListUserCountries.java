package project;

public class ListUserCountries {
     private Country first;
     private int amount;

     public ListUserCountries() {
          amount = 0;
          first = null;
     }

     public void insertAtBeginning(Country country) {
          country.setNext(first);
          first = country;
          amount++;
     }

     public boolean search(String country) {
          Country aux = first;
          if (aux.getNext() == null) {
               if (aux.getNameCountry().equals(country)) {
                    return true;
               }
          }

          while (aux.getNext() != null) {
               if (aux.getNameCountry().equals(country)) {
                    return true;
               }
               aux = aux.getNext();
          }
          return false;
     }

     public int getAmount() {
          return amount;
     }
}
