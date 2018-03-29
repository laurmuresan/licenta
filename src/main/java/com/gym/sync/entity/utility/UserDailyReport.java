package com.gym.sync.entity.utility;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Objects;

/**
 * @author laurmuresan
 */
@Entity
@Table(name = "user_daily_report")
public class UserDailyReport implements Serializable {

    private static final long serialVersionUID = 1667692568791458773L;

    private long userId;
    private long dailyReportId;

    public UserDailyReport() {
    }

    public UserDailyReport(long userId, long dailyReportId) {
        this.userId = userId;
        this.dailyReportId = dailyReportId;
    }

    @Column(name = "user_id", nullable = false)
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Column(name = "daily_report_id", nullable = false)
    public long getDailyReportId() {
        return dailyReportId;
    }

    public void setDailyReportId(long dailyReportId) {
        this.dailyReportId = dailyReportId;
    }

    @Override
    public String toString() {
        return "UserDailyReport{" +
                "userId=" + userId +
                ", dailyReportId=" + dailyReportId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserDailyReport that = (UserDailyReport) o;
        return userId == that.userId &&
                dailyReportId == that.dailyReportId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, dailyReportId);
    }
}
