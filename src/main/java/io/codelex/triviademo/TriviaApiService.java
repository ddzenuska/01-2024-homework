package io.codelex.triviademo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URL;

public class TriviaApiService {

    private static final String TRIVIA_QUESTION_API = "http://numbersapi.com/random/trivia";

    public TriviaQuestionAndAnswerFormatter callAPI() {
        try {
            URL url = new URL(TRIVIA_QUESTION_API);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            try (BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()))) {
                String inputLine;
                StringBuilder content = new StringBuilder();

                while ((inputLine = in.readLine()) != null) {
                    content.append(inputLine);
                }

                in.close();

                String[] splitTriviaQuestion = content.toString().split(" ", 2);
                BigInteger questionAnswer = (splitTriviaQuestion[0].equals("Infinity") ? BigInteger.valueOf(Integer.MAX_VALUE) : new BigInteger(splitTriviaQuestion[0]));
                String questionText = splitTriviaQuestion[1];

                return new TriviaQuestionAndAnswerFormatter(questionText, questionAnswer);
            }
        } catch (Exception e) {
            throw new ApiException("Failed to call API.", e);
        }
    }
}