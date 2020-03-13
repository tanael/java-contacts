// Contact list entity
class Contacts {
    Contact[] contacts;

    public static void addContact() {
        System.out.println("Adding a contact");
    }

    public static void removeContact() {
        System.out.println("Removing a contact");
    }

    // Update?

    public static void main(String[] arguments) {

        if (arguments.length <= 0) {
            System.out.println("No contacts...");
            return;
        }

        System.out.println("Contacts!");
        for (int idx = 0; idx < arguments.length; idx++) {
            System.out.println("Contact n°" + idx + ": " + arguments[idx]);
        }
    }
}

// Contact entity
class Contact {
}
