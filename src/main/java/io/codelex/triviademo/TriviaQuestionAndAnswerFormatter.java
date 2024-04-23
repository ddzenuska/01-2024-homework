package io.codelex.triviademo;

import java.math.BigInteger;
import java.util.*;

public class TriviaQuestionAndAnswerFormatter {

    private static final int NUMBER_OF_POSSIBLE_ANSWERS = 2;
    private final String question;
    private final BigInteger answer;
    private static final Set<String> askedQuestions = new HashSet<>();
    private static final TriviaApiService triviaApiService = new TriviaApiService();
    private static final Random rand = new Random();

    public TriviaQuestionAndAnswerFormatter(String question, BigInteger answer) {
        this.question = question;
        this.answer = answer;
    }

    public static void getPossibleAnswers(BigInteger questionAnswer) {
        List<BigInteger> possibleAnswers = new ArrayList<>();

        possibleAnswers.add(questionAnswer);

        BigInteger upperLimit = questionAnswer.add(BigInteger.ONE);
        BigInteger randomNumber;

        for (int i = 0; i < (rand.nextInt(NUMBER_OF_POSSIBLE_ANSWERS) + NUMBER_OF_POSSIBLE_ANSWERS); i++) {
            do {
                randomNumber = new BigInteger(upperLimit.bitLength(), rand);
            } while (randomNumber.compareTo(upperLimit) >= 0);

            possibleAnswers.add(randomNumber);
        }

        Collections.shuffle(possibleAnswers);
        System.out.println("\nPossible answers: ");
        possibleAnswers.forEach(answer -> System.out.println("\t" + answer));
    }

    public static TriviaQuestionAndAnswerFormatter getUniqueQuestion() throws QuestionException {
        TriviaQuestionAndAnswerFormatter question;
        try {
            do {
                question = triviaApiService.callAPI();
            } while (askedQuestions.contains(question.getQuestion()));
            askedQuestions.add(question.getQuestion());
            return question;
        } catch (QuestionException e) {
            throw new QuestionException("Failed to receive and format unique question from API.", e);
        }
    }

    public String getQuestion() {
        return "What " + this.question.substring(0, this.question.length() - 1) + "?";
    }

    public BigInteger getAnswer() {
        return this.answer;
    }
}