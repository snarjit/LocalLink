package local.link;

import java.util.TreeMap;
import java.util.TreeSet;

/**
 * Created by ivesingh on 1/6/16.
 */
public class Worker extends User {


    @Override
    void incrementFollowers() {

    }

    @Override
    int getFollowers() {
        return 0;
    }

    @Override
    void addReview(String review) {

    }

    @Override
    TreeSet<String> getReviews() {
        return null;
    }

    @Override
    void addUpcomingJob() {

    }

    @Override
    void addRecentJob() {

    }

    @Override
    TreeMap<Integer, Job> getRecentJobs() {
        return null;
    }

    @Override
    TreeMap<Integer, Job> getUpcomingJobs() {
        return null;
    }

    @Override
    double getRating() {
        return 0;
    }

    @Override
    double setRating() {
        return 0;
    }

    @Override
    TreeMap<Integer, Job> getQuestionsAsked() {
        return null;
    }

    @Override
    void addQuestionAsked() {

    }

    @Override
    void addClosedQuestion() {

    }

    @Override
    TreeMap<Integer, Job> getClosedQuestions() {
        return null;
    }
}
