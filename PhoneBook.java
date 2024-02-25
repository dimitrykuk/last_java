// Реализуйте структуру телефонной книги с помощью HashMap.
// Программа также должна учитывать, что в во входной структуре будут 
// повторяющиеся имена с разными телефонами, их необходимо считать, 
// как одного человека с разными телефонами. Вывод должен быть отсортирован 
// по убыванию числа телефонов.

import java.util.ArrayList;
import java.util.HashMap;

class PhoneBook {
    private static HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();

    public void add(String name, Integer phoneNum) {
        if (phoneBook.containsKey(name)) {
            ArrayList<Integer> arrayList = phoneBook.get(name);
            arrayList.add(phoneNum);
            phoneBook.put(name, arrayList);
        } else {
            ArrayList<Integer> arrayList = new ArrayList<>();
            arrayList.add(phoneNum);
            phoneBook.put(name, arrayList);
        }
    }
    public HashMap<String, ArrayList<Integer>> getSortedMap() {

        Object[] a = phoneBook.keySet().toArray();
        Object bufname;
        HashMap<String, ArrayList<Integer>> result = new HashMap<>();
        for (int i = 0; i < a.length-1 ; i++) {
            for (int j = 0; j < a.length-i-1; j++) {
                if (phoneBook.get(a[j]).size() < phoneBook.get(a[j + 1]).size()) {
                    bufname = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = bufname;
                }
            }
        }
        for (int index = 0; index < a.length; index++) {
            System.out.printf( "Телефонные номера %s %s \n",a[index], phoneBook.get(a[index]).toString());   
        }
        return result;
    }

    public HashMap<String, ArrayList<Integer>> getPhoneBook() {
        return phoneBook;
    }
}
