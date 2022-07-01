package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

    private static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private Date moment;
    private String title;
    private String content;
    private Integer likes;
    private final List<Comment> commentList = new ArrayList<>();

    public Post() {
    }

    public Post(Date moment, String title, String content, Integer likes) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<Comment> getCommentList() {
        return commentList;
    }

    public void addComment(Comment comment) {
        commentList.add(comment);
    }

    public void removeComment(Comment comment) {
        commentList.remove(comment);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Post: ");
        stringBuilder.append(title).append("\n");
        stringBuilder.append(likes);
        stringBuilder.append(" Likes - ");
        stringBuilder.append(simpleDateFormat.format(moment)).append("\n");
        stringBuilder.append("New Comments:\n");
        for (Comment obj : commentList) {
            stringBuilder.append(obj.getText()).append("\n");
        }
        return stringBuilder.toString();
    }
}
