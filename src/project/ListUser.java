package project;

public class ListUser {
    private User head;
     public ListUser(){
         head = null;
     }

     public void insertInBeginning(User user){
         user.setProx(head);
         head = user;
         user.setAmount();
     }

     public boolean search(String id){
         User aux = head;
         User user;
         if (aux == null){
             user = new User(id);
             insertInBeginning(user);
             return false;
         }

         while (aux.getProx() != null){
             if(aux.getId().equals(id)){
                 aux.setAmount();
                 return true;
             }
             aux = aux.getProx();
         }
         user = new User(id);
         insertInBeginning(user);
         return false;
     }

    public void print() {
        User aux = head;
        while (aux != null) {
            System.out.printf(aux.getId()+" ");
            System.out.println(aux.getAmount());
            aux = aux.getProx();
        }
    }
}
