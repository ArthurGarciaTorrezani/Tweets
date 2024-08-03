package project;

public class UserList {
    private Node first;
    public int amount = 0;

    private static class Node {
        private User user;
        private Node next;

        public Node(User user) {
            this.user = user;
            this.next = null;
        }
    }

    public UserList() {
        first = null;
    }

    public void insertAtBeginning(User user, String country) {
        Node newNode = new Node(user);
        newNode.next = first;
        first = newNode;
        user.incrementAmount();
        user.setCountries(country);
        amount++;
    }

    public User search(String id) {
        Node current = first;
        while (current != null) {
            if (current.user.getId().equals(id)) {
                return current.user;
            }
            current = current.next;
        }
        return null;
    }

    public boolean searchOrInsert(String id, String country) {
        User foundUser = search(id);

        if (foundUser != null) {
            String countries = foundUser.getCountries();
            if (!countries.contains(country)) {
                foundUser.setCountries(country);
                foundUser.incrementAmount();
            }
            return true;
        } else {
            insertAtBeginning(new User(id), country);
            return false;
        }
    }

    public void repeatedIdCountry() {
        Node current = first;

        System.out.println("------------------------------------------------------");
        while (current != null) {
            if (current.user.getAmountUsers() > 1) {
                System.out.printf("User: %s | Countries: %s | Amount: %d\n", current.user.getId(),
                        current.user.getCountries(), current.user.getAmountUsers());
            }
            current = current.next;
        }
        System.out.println("------------------------------------------------------");
    }
}