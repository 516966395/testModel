package pojo;

import java.util.Date;

public class Content {

    private Integer id;

    private String username;

    private String sex;

    private String content;

    private Date createTime;

    public Content() {
    }

    public Content(Integer id, String username, String sex, String content, Date createTime) {
        this.id = id;
        this.username = username;
        this.sex = sex;
        this.content = content;
        this.createTime = createTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
