public class Person {

    private String title;
    private String body;
    private String author;
    private int likes;
    private boolean isPublished;

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "title='" + title + '\'' +
                ", body='" + body + '\'' +
                ", author='" + author + '\'' +
                ", likes=" + likes +
                ", isPublished=" + isPublished +
                '}';
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public void setPublished(boolean isPublished) {
        this.isPublished = isPublished;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public String getAuthor() {
        return author;
    }

    public int getLikes() {
        return likes;
    }

    public boolean isPublished() {
        return isPublished;
    }
}