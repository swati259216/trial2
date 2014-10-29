package com.zinteract.common.dom;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by swati on 20/10/14.
 */
@Entity
public class QuerySchedule {



    @Id
    private long scheduleid;
    private long queryid;
    private long tenantid;
    private long datasourceid;
    private long installid;
    private Date start_time;
    private Date rnd_time;
    private int frequency;
    private String cron_schedule;
    private Date creation_time;
    private long created_by_id;
    private enum status{CREATED,RAWDONE,ACCURATEDONE,RECONCILING,ARCHIVED};
    private String synch_status;
    private Date last_modified_time;
    private String query_type;

    public QuerySchedule() {
    }

    public QuerySchedule( long scheduleid, long queryid, long tenantid, long datasourceid, long installid, Date start_time, Date rnd_time, int frequency, String cron_schedule, Date creation_time, long created_by_id, String synch_status, Date last_modified_time, String query_type) {

        this.scheduleid = scheduleid;
        this.queryid = queryid;
        this.tenantid = tenantid;
        this.datasourceid = datasourceid;
        this.installid = installid;
        this.start_time = start_time;
        this.rnd_time = rnd_time;
        this.frequency = frequency;
        this.cron_schedule = cron_schedule;
        this.creation_time = creation_time;
        this.created_by_id = created_by_id;
        this.synch_status = synch_status;
        this.last_modified_time = last_modified_time;
        this.query_type = query_type;
    }



    public long getScheduleid() {
        return scheduleid;
    }

    public void setScheduleid(long scheduleid) {
        this.scheduleid = scheduleid;
    }

    public long getQueryid() {
        return queryid;
    }

    public void setQueryid(long queryid) {
        this.queryid = queryid;
    }

    public long getTenantid() {
        return tenantid;
    }

    public void setTenantid(long tenantid) {
        this.tenantid = tenantid;
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

    public Date getStart_time() {
        return start_time;
    }

    public void setStart_time(Date start_time) {
        this.start_time = start_time;
    }

    public Date getRnd_time() {
        return rnd_time;
    }

    public void setRnd_time(Date rnd_time) {
        this.rnd_time = rnd_time;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public String getCron_schedule() {
        return cron_schedule;
    }

    public void setCron_schedule(String cron_schedule) {
        this.cron_schedule = cron_schedule;
    }

    public Date getCreation_time() {
        return creation_time;
    }

    public void setCreation_time(Date creation_time) {
        this.creation_time = creation_time;
    }

    public long getCreated_by_id() {
        return created_by_id;
    }

    public void setCreated_by_id(long created_by_id) {
        this.created_by_id = created_by_id;
    }

    public String getSynch_status() {
        return synch_status;
    }

    public void setSynch_status(String synch_status) {
        this.synch_status = synch_status;
    }

    public Date getLast_modified_time() {
        return last_modified_time;
    }

    public void setLast_modified_time(Date last_modified_time) {
        this.last_modified_time = last_modified_time;
    }

    public String getQuery_type() {
        return query_type;
    }

    public void setQuery_type(String query_type) {
        this.query_type = query_type;
    }
}
