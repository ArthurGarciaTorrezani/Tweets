package project;

public class Country {
     private String nameCountry;
     private Country next;

     public Country(String nameCountry){
          this.nameCountry = nameCountry;
     }

     public void setNext(Country next){
          this.next = next;
     }

     public Country getNext(){
          return next;
     }

     public String getNameCountry(){
          return nameCountry;
     }
}
