package io.codelex.triviademo;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

import static io.codelex.triviademo.TriviaQuestion.getPossibleAnswers;
import static io.codelex.triviademo.TriviaQuestion.getUniqueQuestion;

public class TriviaGameEngine {
    private int score = 0;
    private TriviaQuestion lastCorrectQuestion;

    public void playGame() throws IOException {
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 20; i++) {
            TriviaQuestion question = getUniqueQuestion();
            System.out.println("\n" + question.getQuestion());
            getPossibleAnswers(question.getAnswer());

            System.out.print("\nYour answer: ");
            BigInteger playerAnswer = BigInteger.valueOf(in.nextInt());

            if (!checkAnswer(playerAnswer, question)) {
                break;
            }
        }

        printScore(lastCorrectQuestion);
    }

    public boolean checkAnswer(BigInteger playerAnswer, TriviaQuestion question) {
        if (playerAnswer.equals(question.getAnswer())) {
            System.out.println("Correct!");
            score++;
            lastCorrectQuestion = question;
            return true;
        } else {
            return false;
        }
    }

    public void printScore(TriviaQuestion lastCorrectQuestion) {
        System.out.println("Game is over! You answered " + (score % 2 == 0 ? score + " questions correctly." : score + " question correctly."));
        if (lastCorrectQuestion != null) {
            System.out.println("Your last correctly answered question: " + "\"" + lastCorrectQuestion.getQuestion() + "\"");
        }
    }
}

