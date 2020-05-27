package codes.optiko.oc.model;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "responses")
public class Response {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

//  foreign key to user: many responses(videos) to one user
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

//  foreign key to post: many responses to one post
    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;

    //video url
    @JoinColumn(name = "video_url")
    private String video;

//  foreign key to comment: one response can have many comments
    @ManyToOne
    @JoinColumn(name = "comment_id")
    private Comment comment;

    @Column
    @CreationTimestamp
    private Timestamp createDate;

    @Column
    @UpdateTimestamp
    private Timestamp updateDate;

//************** CONSTRUCTORS ********************

//    empty constructor
    public Response(){
    }

    public Response(long id){
        this.id = id;
    }

    public Response(long id, User user){
        this.id = id;
        this.user = user;
    }

    public Response(long id, User user, Post post){
        this.id = id;
        this.user = user;
        this.post = post;
    }

    public Response(long id, User user, Post post, String video){
        this.id = id;
        this.user = user;
        this.post = post;
        this.video = video;
    }

    public Response(long id, User user, Post post, String video, Comment comment){
        this.id = id;
        this.user = user;
        this.post = post;
        this.video = video;
        this.comment = comment;
    }

    public Response(long id, User user, Post post, String video, Comment comment, Timestamp createDate){
        this.id = id;
        this.user = user;
        this.post = post;
        this.video = video;
        this.comment = comment;
        this.createDate = createDate;
    }

    public Response(long id, User user, Post post, String video, Comment comment, Timestamp createDate, Timestamp updateDate){
        this.id = id;
        this.user = user;
        this.post = post;
        this.video = video;
        this.comment = comment;
        this.createDate = createDate;
        this.updateDate = updateDate;
    }

//************** GETTERS and SETTERS ********************

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp date) {
        this.createDate = createDate;
    }

    public Timestamp getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Timestamp updateDate) {
        this.updateDate = updateDate;
    }
}
