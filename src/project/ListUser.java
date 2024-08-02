package project;

public class ListUser {
    private Node head;
    public int amount = 0;
    private static class Node {
        private User user;
        private Node next;

        public Node(User user) {
            this.user = user;
            this.next = null;
        }
    }

    public ListUser() {
        head = null;
    }

    public void insertAtBeginning(User user, String language) {
        Node newNode = new Node(user);
        newNode.next = head;
        head = newNode;
        user.incrementAmount();
        user.setCountry(language);
        amount++;
    }

    public User search(String id,String language) {
        Node current = head;
        while (current != null) {
            if (current.user.getId().equals(id)) {
                if(!current.user.searchCountry(language)){  
                    current.user.setCountry(language);
                    current.user.incrementAmount();
                }
                return current.user;
            }
            current = current.next;
        }
        return null;
    }

    public boolean searchOrInsert(String id, String language) {
        User foundUser = search(id,language);
        if (foundUser != null) {
            return true;
        } else {
            insertAtBeginning(new User(id), language);
            return false;
        }
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.printf("ID: %s | Quantidade: %d\n", current.user.getId(), current.user.getAmountUsers());
            current = current.next;
        }
    }
}