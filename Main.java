import java.security.NoSuchAlgorithmException;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        {
            String message = "This string is hashed";
            HashingTest hashingTest = new HashingTest();
            hashingTest.testMessageDigest(message);
            System.out.println();
            hashingTest.testSecureRandom(message);
            System.out.println();
        }
        {
            System.out.println("Correct person map test:");
            HashMap<CorrectPerson, String> correctMap = new HashMap<>();
            CorrectPerson correctPerson1 = new CorrectPerson("Vlad", "Hibskyi", 18);
            CorrectPerson correctPerson2 = new CorrectPerson("Volodymyr", "Zelenskyi", 46);
            correctMap.put(correctPerson1, "hibskyi");
            System.out.print("{ ");
            for (CorrectPerson person : correctMap.keySet())
                System.out.print(person + " -> " + correctMap.get(person) + "; ");
            System.out.println("}");
            System.out.println("Contains Zelenskyi: " + correctMap.containsKey(correctPerson2));
            System.out.println("Add Zelenskyi: ");
            correctMap.put(correctPerson2, "zelenskyi");
            System.out.print("{ ");
            for (CorrectPerson person : correctMap.keySet())
                System.out.print(person + " -> " + correctMap.get(person) + "; ");
            System.out.println("}");
            System.out.println();
        }
        {
            System.out.println("Incorrect person map test:");
            HashMap<IncorrectPerson, String> incorrectMap = new HashMap<>();
            IncorrectPerson incorrectPerson1 = new IncorrectPerson("Vlad", "Hibskyi", 18);
            IncorrectPerson incorrectPerson2 = new IncorrectPerson("Volodymyr", "Zelenskyi", 46);
            incorrectMap.put(incorrectPerson1, "hibskyi");
            System.out.print("{ ");
            for (IncorrectPerson person : incorrectMap.keySet())
                System.out.print(person + " -> " + incorrectMap.get(person) + "; ");
            System.out.println("}");
            System.out.println("Contains Zelenskyi: " + incorrectMap.containsKey(incorrectPerson2));
            System.out.println("Add Zelenskyi: ");
            incorrectMap.put(incorrectPerson2, "zelenskyi");
            System.out.print("{ ");
            for (IncorrectPerson person : incorrectMap.keySet())
                System.out.print(person + " -> " + incorrectMap.get(person) + "; ");
            System.out.println("}");
        }
    }
}
