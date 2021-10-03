package me.akshay.stories.common.model;

public class UserModel {

    public UserModel() {}
    private String userName;
    private String email;
    private String status;
    private String profile_picture;
    private String date;

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public String getStatus() {
        return status;
    }

    public String getProfile_picture() {
        return profile_picture;
    }

    public String getDate() {
        return date;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setProfile_picture(String profile_picture) {
        this.profile_picture = profile_picture;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public UserModel(String userName, String email
            , String status, String profile_picture, String date) {
        this.userName = userName;
        this.email = email;
        this.status = status;
        this.profile_picture = profile_picture;
        this.date = date;
    }
}
