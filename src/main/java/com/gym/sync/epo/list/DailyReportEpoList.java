package com.gym.sync.epo.list;

import java.io.Serializable;
import java.util.List;

/**
 * @author laurmuresan
 */
public class DailyReportEpoList implements Serializable {
    private List<DailyReportEpoList> dailyReportEpoLists;

    private DailyReportEpoList(){}

    public DailyReportEpoList(List<DailyReportEpoList> dailyReportEpoLists) {
        this.dailyReportEpoLists = dailyReportEpoLists;
    }

    @Override
    public String toString() {
        return "DailyReportEpoList{" +
                "dailyReportEpoLists=" + dailyReportEpoLists +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DailyReportEpoList that = (DailyReportEpoList) o;

        return dailyReportEpoLists != null ? dailyReportEpoLists.equals(that.dailyReportEpoLists) : that.dailyReportEpoLists == null;
    }

    @Override
    public int hashCode() {
        return dailyReportEpoLists != null ? dailyReportEpoLists.hashCode() : 0;
    }
}
