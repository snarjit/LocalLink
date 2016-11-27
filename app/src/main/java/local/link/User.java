package local.link;

import android.graphics.Bitmap;

import java.util.TreeMap;
import java.util.TreeSet;

/**
 * Created by ivesingh on 1/6/16.
 */
public abstract class User {
    private String user_name, first_name, last_name, zip_code, member_since;
    private int age;
    private Bitmap image;
    int followers;
    double rating;
    TreeSet<String> reviews;
    TreeMap<Integer, Job> upcomingJobs, recentJobs, questionsAsked;

    public User(){

    }

    public User(String user_name, String first_name, String last_name, int age, Bitmap image,
                String zip_code, String member_since) {
        this.user_name = user_name;
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
        this.image = image;
        this.zip_code = zip_code;
        this.member_since = member_since;
        this.followers = 0;
        reviews = new TreeSet<String>();
        upcomingJobs = new TreeMap<Integer, Job>();
        recentJobs = new TreeMap<Integer, Job>();
        questionsAsked = new TreeMap<Integer, Job>();
    }

    void setFirstName(String first_name) {
        this.first_name = first_name;
    }

    void setLastName(String last_name) {
        this.last_name = last_name;
    }

    void setAge(int age) {
        this.age = age;
    }

    void setImage(Bitmap image) {
        this.image = image;
    }

    void setZipCode(String zip_code) {
        this.zip_code = zip_code;
    }


    String getFirstName() {
        return first_name;
    }

    String getLastName() {
        return last_name;
    }


    String getUserName() {
        return user_name;
    }

    int getAge() {
        return age;
    }

    Bitmap getImage() {
        return image;
    }

    String getZipCode() {
        return zip_code;
    }

    String getMemberSince() {
        return member_since;
    }

    abstract void incrementFollowers();

    abstract int getFollowers();

    abstract void addReview(String review);

    abstract TreeSet<String> getReviews();

    abstract void addUpcomingJob();

    abstract void addRecentJob();

    abstract TreeMap<Integer, Job> getRecentJobs();

    abstract TreeMap<Integer, Job> getUpcomingJobs();

    abstract double getRating();

    abstract double setRating();

    abstract TreeMap<Integer, Job> getQuestionsAsked();

    abstract void addQuestionAsked();

    abstract void addClosedQuestion();

    abstract TreeMap<Integer, Job> getClosedQuestions();


}
