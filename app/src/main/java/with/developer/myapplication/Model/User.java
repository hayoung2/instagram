package with.developer.myapplication.Model;

public class User {
    private String id;
    private String username;
    private String fullname;
    private String imageurl;
    private String bio;

    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getFullname() {
        return fullname;
    }

    public String getImageurl() {
        return imageurl;
    }

    public String getBio() {
        return bio;
    }

    public User() {}
    public User(String id,String username,String fullname,String imageurl,String bio) {
        this.id=id;
        this.username=username;
        this.fullname=fullname;
        this.imageurl=imageurl;
        this.bio=bio;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
