package dalongmao.entity;

import java.util.Date;

public class LocalAuth {
    private Integer localAuthId;

    private Integer userId;

    private String username;

    private String password;

    private Date createTime;

    private Date lastEditTime;

    public LocalAuth(Integer localAuthId, Integer userId, String username, String password, Date createTime, Date lastEditTime) {
        this.localAuthId = localAuthId;
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.createTime = createTime;
        this.lastEditTime = lastEditTime;
    }

    public LocalAuth() {
        super();
    }

    public Integer getLocalAuthId() {
        return localAuthId;
    }

    public void setLocalAuthId(Integer localAuthId) {
        this.localAuthId = localAuthId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastEditTime() {
        return lastEditTime;
    }

    public void setLastEditTime(Date lastEditTime) {
        this.lastEditTime = lastEditTime;
    }
}