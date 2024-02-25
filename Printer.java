public class Printer {
    public static void main(String[] args) {

        PhoneBook myPhoneBook = new PhoneBook();
        myPhoneBook.add("Ivanov", 123);
        myPhoneBook.add("Petrov", 456);
        myPhoneBook.add("Sidorov", 789);
        myPhoneBook.add("Ivanov", 11);
        myPhoneBook.add("Ivanov", 12);
        myPhoneBook.add("Ivanov", 13);
        myPhoneBook.add("Ivanov", 14);
        myPhoneBook.add("Artem", 4);
        myPhoneBook.add("Artem", 1);
        

        System.out.println(myPhoneBook.getPhoneBook());
        System.out.println(myPhoneBook.getSortedMap());
    }
}