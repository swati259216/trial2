package com.zinteract.common.dom;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Entity;
import java.util.Date;

/**
 * Created by swati on 20/10/14.
 */
@Entity
public class QueryRun {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long queryid;
    private long datasourceid;
    private long installid;
    private Date run_date;
    private Date start_hour;
    private Date end_hour;
    private String resultsandstatus;
    private Date last_modified_time;
    private String alarm_status;

    public QueryRun(long queryid, long datasourceid, long installid, Date run_date, Date start_hour, Date end_hour, String resultsandstatus, Date last_modified_time, String alarm_status) {

        this.queryid = queryid;
        this.datasourceid = datasourceid;
        this.installid = installid;
        this.run_date = run_date;
        this.start_hour = start_hour;
        this.end_hour = end_hour;
        this.resultsandstatus = resultsandstatus;
        this.last_modified_time = last_modified_time;
        this.alarm_status = alarm_status;
    }


    public QueryRun() {
    }

    public long getQueryid() {
        return queryid;
    }

    public void setQueryid(long queryid) {
        this.queryid = queryid;
    }

    public long getDatasourceid() {
        return datasourceid;
    }

    public void setDatasourceid(long datasourceid) {
        this.datasourceid = datasourceid;
    }

    public long getInstallid() {
        return installid;
    }

    public void setInstallid(long installid) {
        this.installid = installid;
    }

    public Date getRun_date() {
        return run_date;
    }

    public void setRun_date(Date run_date) {
        this.run_date = run_date;
    }

    public Date getStart_hour() {
        return start_hour;
    }

    public void setStart_hour(Date start_hour) {
        this.start_hour = start_hour;
    }

    public Date getEnd_hour() {
        return end_hour;
    }

    public void setEnd_hour(Date end_hour) {
        this.end_hour = end_hour;
    }

    public String getResultsandstatus() {
        return resultsandstatus;
    }

    public void setResultsandstatus(String resultsandstatus) {
        this.resultsandstatus = resultsandstatus;
    }

    public Date getLast_modified_time() {
        return last_modified_time;
    }

    public void setLast_modified_time(Date last_modified_time) {
        this.last_modified_time = last_modified_time;
    }

    public String getAlarm_status() {
        return alarm_status;
    }

    public void setAlarm_status(String alarm_status) {
        this.alarm_status = alarm_status;
    }
}
