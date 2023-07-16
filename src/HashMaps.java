import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {
        HashMap<String, Integer> examsScores = new HashMap<String, Integer>();
        examsScores.put("Math", 95);
        examsScores.put("Sociology", 85);
        examsScores.put("English", 100);

        System.out.println(examsScores.toString());  // {English=100, Sociology=85, Math=95}
        System.out.println("Your Math score is: "+examsScores.get("Math"));  // Your Math score is: 95

        examsScores.putIfAbsent("Math", 100);
        System.out.println("Your ifAbsent Math score is: "+examsScores.get("Math"));  // Your ifAbsent Math score is: 95

        examsScores.replace("Math",100);
        System.out.println("Your final Math score is: " + examsScores.get("Math"));  // Your final Math score is: 100

        System.out.println(examsScores.get("Turkish"));  // null
        System.out.println(examsScores.getOrDefault("Turkish", -1));  // -1

        System.out.println(examsScores.size());  // 3

        examsScores.remove("Math");
        System.out.println(examsScores.toString());  // {English=100, Sociology=85}

        System.out.println(examsScores.containsKey("English"));  // true

        System.out.println(examsScores.containsValue(100));  // true

        examsScores.forEach((key, value) -> {
            System.out.println(key + "-" + value);
        } );

        // Output:
        // English-100
        // Sociology-85

        examScores.forEach((subject, score) -> {
            examScores.replace(subject, score + 10);
        } );
        System.out.println(examsScores.toString());

        examsScores.clear();
        System.out.println(examsScores.toString());  // {}


    }
}