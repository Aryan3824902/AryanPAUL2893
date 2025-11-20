package service;

import java.util.*;
import model.*;

public class QuizService {
    private Quiz quiz;

    public QuizService(Quiz quiz) {
        this.quiz = quiz;
    }

    public int startQuiz(Scanner scanner) {
        int score = 0;

        for (Question q : quiz.getQuestions()) {
            System.out.println("\n" + q.getQuestionText());
            List<String> opts = q.getOptions();

            for (int i = 0; i < opts.size(); i++) {
                System.out.println((i + 1) + ") " + opts.get(i));
            }

            System.out.print("Your answer: ");
            int userAns = scanner.nextInt() - 1;

            if (userAns == q.getCorrectIndex())
                score++;
        }

        return score;
    }
}
