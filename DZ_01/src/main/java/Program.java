import java.util.*;

public class Program {
    public static void main(String[] args) {
        HashMap<String, List<String>> phoneBook = new HashMap<>();

        addEntry(phoneBook, "Никита", "1234567890");
        addEntry(phoneBook, "Катя", "9876543210");
        addEntry(phoneBook, "Никита", "9999999999");
        addEntry(phoneBook, "Света", "5555555555");
        addEntry(phoneBook, "Никита", "12345");
        addEntry(phoneBook, "Катя", "9876540");
        addEntry(phoneBook, "Дима", "9999999999");
        addEntry(phoneBook, "Даша", "77777777");

        List<Map.Entry<String, List<String>>> sortedEntries = new ArrayList<>(phoneBook.entrySet());
        Collections.sort(sortedEntries, (e1, e2) -> Integer.compare(e2.getValue().size(), e1.getValue().size()));

        for (Map.Entry<String, List<String>> entry : sortedEntries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void addEntry(HashMap<String, List<String>> phoneBook, String name, String phoneNumber) {
        if (phoneBook.containsKey(name)) {
            List<String> phoneNumbers = phoneBook.get(name);
            phoneNumbers.add(phoneNumber);
        } else {
            List<String> phoneNumbers = new ArrayList<>();
            phoneNumbers.add(phoneNumber);
            phoneBook.put(name, phoneNumbers);
        }
    }
}