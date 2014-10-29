package com.zinteract.common.dom;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created by swati on 21/10/14.
 */
@Entity
public class QueryProps {

    @Id
    private long queryid;
    private String propname;
    private String propvalue;
    private Timestamp last_modified_time;

    public QueryProps(long queryid, String propname, String propvalue, Timestamp last_modified_time) {
        this.queryid = queryid;
        this.propname = propname;
        this.propvalue = propvalue;
        this.last_modified_time = last_modified_time;
    }

    public long getQueryid() {
        return queryid;
    }

    public void setQueryid(long queryid) {
        this.queryid = queryid;
    }

    public String getPropname() {
        return propname;
    }

    public void setPropname(String propname) {
        this.propname = propname;
    }

    public String getPropvalue() {
        return propvalue;
    }

    public void setPropvalue(String propvalue) {
        this.propvalue = propvalue;
    }

    public Timestamp getLast_modified_time() {
        return last_modified_time;
    }

    public void setLast_modified_time(Timestamp last_modified_time) {
        this.last_modified_time = last_modified_time;
    }
}
