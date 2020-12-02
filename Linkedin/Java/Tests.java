import java.util.*;
import java.lang.*;
// import java.lang.ArithmeticException;
// import java.util.stream;

class Tests {
    public static void main(String[] args) {

        // LinkedList<Integer> cars = new LinkedList<Integer>();
        // cars.add(1);
        // cars.add(2);
        // cars.add(3);
        // System.out.println(cars);

        // System.out.println("apple".compareTo("banana"));

        // "How can you achieve runtime polymoirphism in Java"
        // Method overriding

        // 1. What dose thie code print?
        // System.out.println("apple".compareTo("banana"));
        // a negative number

        // 2. How can you achieve runtime polyporphisim in Java?
        // method overriding

        // 3. Given the string "strawberries" saved in a variable called fruit, what
        // would fruit.substring(2,5) return?
        // System.out.println("strawberries".substring(2, 5));
        // raw

        // 4.

        // List list1 = new ArrayList();
        // list1.add("hello");
        // list1.add(2);
        // System.out.print(list1.get(1) instanceof Object);
        // System.out.print(list1.get(1) instanceof Integer);
        // truetrue

        // 5. "What can you use to create new intances in Java?"
        // constructor

        // What can you use to create new instance in Java

        // 6. "You have an ArrayList of names that you want to sort alphabetically.
        // Which
        // approach would NOT work?"
        // List<String> names = new ArrayList<String>();
        // names.add("John");
        // names.add("James");
        // names.add("Brian");
        // "You have an ArrayList of names that you want to sort alphabetically. Which
        // approach would NOT work?"
        //
        // (O) Collections.sort(names);
        // (O) names.stream().sorted((s1, s2) ->
        // s1.compareTo(s2)).collect(Collectors.toList());
        // (X) names.sort(List.DESCENDING);
        // (O) names.sort(Comparator.comparing(String::toSTring));

        // 7.
        // int a = 123451234512345; // int a = 123;
        // System.out.println(a);
        // Nothing-this will not compile.

        // 8. Which statement is NOT true?
        // (O) an anonymous class may specify an abstract base class as its base type an
        // (O) anonymous class may specify both an abstract class and interface as base
        // (O) types an anonymous class may specify an interface as its base type an
        // (X) anonymous class does not require a zero argument constructor

        // 9. What is the output of this code?
        // int array[] = { 1, 2, 3, 4 };
        // for (int i = 0; i < array.size(); i++) {
        // System.out.print(array[i]);
        // }
        // It will not compile because of line 4.

        // 10. What is the result of this code?
        // try {
        // System.out.print("Hello World");
        // } catch (Exception e) {
        // System.out.print(e);
        // } catch (ArithmeticException e) {
        // System.out.print(e);
        // } finally {
        // System.out.print("!");
        // }
        // it will not compile.

        // 11. What cocde would you use to tell if "schwifty" is of type of String.
        // "schwifty" instanceof String
        // System.out.println("schwifty" instanceof String);

        // 12. the runtime system starts your program by calling which function first
        // main

        // 13 Which letters will print when this code is run?
        // try {
        // System.out.println("A");
        // badMethod();
        // System.out.println("B");
        // } catch (Exception ex) {
        // System.out.println("C");
        // } finally {
        // System.out.println("D");
        // }
        // A and D

        // 14. What result of this code?
        // System.out.println(print(1));
        // java.lang.Exception.

        // 15. Object-oriented programming is a style of programming where ypu organize
        // your program around ( objects ) rather than ( actiions ) and data rather than
        // logic

        // 16.
        // List<Boolean> list = new ArrayList<>();
        // list.add(true);
        // list.add(Boolean.parseBoolean("FasSe"));
        // list.add(Boolean.TRUE);
        // System.out.println(list.size()); // 3
        // System.out.println(list.get(1) instanceof Boolean); // True
        // System.out.println(list);

        // 17. What is the result of this code?
        // int a = 1;
        // int b = 0;
        // int c = a / b;
        // System.out.println(c);
        // It will throw an ArithmeticException.
        // Exception in thread "main" java.lang.ArithmeticException: / by zero

        // 18. Add a Duck call "Waddles" to the ArryaList ducks.
        // class Duck {
        // private String name;

        // Duck(String name) {
        // this.name = name;
        // }
        // }

        // ArrayList<Duck> ducks = new ArrayList<Duck>();
        // ducks.add(new Duck("Waddles"));

        // for (Duck duck : ducks) {
        // System.out.println(duck.name);
        // }

        // 19. What language contruct serves as a blueprint containing an object's
        // properties and functionality?
        // Class

        // 20. How do you write a foreach loop that will iterate over ArrayList<pencil>
        // pencilCAse

        // class Pencil {
        // int kind;
        // }

        // ArrayList<Pencil> pencilCase = new ArrayList<Pencil>();

        // for (Pencil pencil : pencilCase) {}


    }

    public static void badMethod() {
        throw new Error();
    }

    static Exception print(int i) {
        if (i > 0) {
            return new Exception();
        } else {
            throw new RuntimeException();
        }
    }
}