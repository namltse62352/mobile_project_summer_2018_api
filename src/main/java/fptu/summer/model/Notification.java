package fptu.summer.model;
// Generated Jun 3, 2018 2:37:40 PM by Hibernate Tools 4.3.1

import java.util.Date;

/**
 * Notification generated by hbm2java
 */
public class Notification implements java.io.Serializable {

    private Long id;
    private String title;
    private String content;
    private boolean isSystemNotification;
    private Date insertDate;
    private Date lastUpdate;
    private int status;

    public Notification() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isIsSystemNotification() {
        return this.isSystemNotification;
    }

    public void setIsSystemNotification(boolean isSystemNotification) {
        this.isSystemNotification = isSystemNotification;
    }

    public Date getInsertDate() {
        return this.insertDate;
    }

    public void setInsertDate(Date insertDate) {
        this.insertDate = insertDate;
    }

    public Date getLastUpdate() {
        return this.lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public int getStatus() {
        return this.status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

}
