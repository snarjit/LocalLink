package local.link;

import java.util.Date;
import java.util.TreeSet;

/**
 * Created by ivesingh on 1/6/16.
 */
public class Job {

    private String project_title, description, zip_code, flexibility, category,
            sub_category;
    private TreeSet<String> schedule, job_recommendation_list, tags;
    private Worker worker;
    private Advertiser advertiser;
    private Date date_published, date_completed;
    private int job_id, view_count;

    public Job(String title, TreeSet<String> schedule, String description, String zip_code,
               String flexibility, String category, String sub_category, TreeSet<String> tags,
               Date published_date, Advertiser advertiser,
               int job_id){

        this.project_title = title;
        this.schedule = schedule;
        this.description = description;
        this.zip_code = zip_code;
        this.flexibility = flexibility;
        this.category = category;
        this.sub_category = sub_category;
        this.advertiser = advertiser;
        this.tags = tags;
        this.date_published = published_date;
        this.job_id = job_id;
        this.view_count = 0;
    }

    public void setProjectTitle(String project_title) {
        this.project_title = project_title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setZipCode(String zip_code) {
        this.zip_code = zip_code;
    }

    public void setFlexibility(String flexibility) {
        this.flexibility = flexibility;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setSubCategory(String sub_category) {
        this.sub_category = sub_category;
    }

    public void setTags(TreeSet<String> tags) {
        this.tags = tags;
    }

    public void setSchedule(TreeSet<String> schedule) {
        this.schedule = schedule;
    }

    public void setJobRecommendationList(TreeSet<String> recommendationList) {
        this.job_recommendation_list = recommendationList;
    }

    public void setDateCompleted(Date completed){
        this.date_completed = completed;
    }

    public void setViewCount(){
        this.view_count++;
    }

    public void setWorker(Worker worker){
        this.worker = worker;
    }

    public String getProjectTitle() {
        return project_title;
    }

    public String getDescription() {
        return description;
    }

    public String getZipCode() {
        return zip_code;
    }

    public String getFlexibility() {
        return flexibility;
    }

    public String getCategory() {
        return category;
    }

    public String getSubCategory() {
        return sub_category;
    }

    public TreeSet<String> getTags() {
        return tags;
    }

    public TreeSet<String> getSchedule() {
        return schedule;
    }

    public TreeSet<String> getJobRecommendationList() {
        return job_recommendation_list;
    }

    public Date getPublishedDate(){
        return date_published;
    }

    public Date getDateCompleted(){
        return date_completed;
    }

    public Worker getWorker() {
        return worker;
    }

    public Advertiser getAdvertiser() {
        return advertiser;
    }

    public int getJobId() {
        return job_id;
    }

    public int getViewCount() {
        return view_count;
    }

}
