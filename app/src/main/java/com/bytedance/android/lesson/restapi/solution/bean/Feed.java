package com.bytedance.android.lesson.restapi.solution.bean;

import com.google.gson.annotations.SerializedName;
/**
 * @author Xavier.S
 * @date 2019.01.20 14:18
 */
public class Feed {
    @SerializedName("student_id") private String student_id;
    @SerializedName("user_name")private String user_Name;
    @SerializedName("image_url")private String image_url;
    @SerializedName("video_url")private String video_url;
    @SerializedName("createAt")private String createAt;
    @SerializedName("updateAt")private String updateAt;

    // TODO-C2 (1) Implement your Feed Bean here according to the response json
    public String getStudent_id(){
        return student_id;
    }
    public String getUser_Name(){
        return user_Name;
    }

    public String getImage_url() {
        return image_url;
    }

    public String getVideo_url(){
        return video_url;
    }
    public String getCreateAt(){
        return createAt;
    }
    public String getUpdateAt(){
        return updateAt;
    }
    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public void setUpdateAt(String updateAt) {
        this.updateAt = updateAt;
    }

    public void setUser_Name(String user_Name) {
        this.user_Name = user_Name;
    }

    public void setVideo_url(String video_url) {
        this.video_url = video_url;
    }
}
