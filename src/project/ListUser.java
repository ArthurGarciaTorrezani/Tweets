package project;

public class ListUser {
    private Node head;

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

    public void insertAtBeginning(User user) {
        Node newNode = new Node(user);
        newNode.next = head;
        head = newNode;
        user.incrementAmount();
    }

    public User search(String id) {
        Node current = head;
        while (current != null) {
            if (current.user.getId().equals(id)) {
                current.user.incrementAmount();
                return current.user;
            }
            current = current.next;
        }
        return null;
    }

    public boolean searchOrInsert(String id) {
        User foundUser = search(id);
        if (foundUser != null) {
            return true;
        } else {
            insertAtBeginning(new User(id));
            return false;
        }
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.printf("ID: %s | Users: %d\n", current.user.getId(), current.user.getAmountUsers());
            current = current.next;
        }
    }
}