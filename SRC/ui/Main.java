package ui;

import model.*;
import service.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Question> questions = new ArrayList<>();
        questions.add(new Question(
            "What is Java?",
            Arrays.asList("Programming Language", "OS", "Database", "Protocol"),
            0
        ));

        questions.add(new Question(
            "Which keyword creates an object?",
            Arrays.asList("create", "new", "make", "init"),
            1
        ));

        Quiz quiz = new Quiz("Java Basics Quiz", questions);
        QuizService service = new QuizService(quiz);

        Scanner sc = new Scanner(System.in);
        int score = service.startQuiz(sc);

        System.out.println("\nYour Score: " + score + "/" + questions.size());
    }
}
