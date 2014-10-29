package com.zinteract.common.dom;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.util.Date;
import java.util.Properties;

/**
 * Created by swati on 20/10/14.
 */
@Entity
public class PatternMatch {


    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long queryid;
    private long tenantid;
    private long observation_time;
//    @Column(unique=true)
    private long observation_id;
    private String key_value_pairs;
    private Date creation_time;
    private String synch_status;

    public PatternMatch(long tenantid, long observation_time, long observation_id, String key_value_pairs, Date creation_time, String synch_status) {
        this.tenantid = tenantid;
        this.observation_time = observation_time;
        this.observation_id = observation_id;
        this.key_value_pairs = key_value_pairs;
        this.creation_time = creation_time;
        this.synch_status = synch_status;
    }

    public PatternMatch(int i, int i1, int i2, int i3, Properties prop, Date date, String hello) {
    }

//    public void setKeyValue(String key,String value){
//        key_value_pairs.put(key,value);
//    }
//
//    public String getKeyValue(String key){
//        return key_value_pairs.getProperty(key);
//    }

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

    public long getObservation_time() {
        return observation_time;
    }

    public void setObservation_time(long observation_time) {
        this.observation_time = observation_time;
    }

    public long getObservation_id() {
        return observation_id;
    }

    public void setObservation_id(long observation_id) {
        this.observation_id = observation_id;
    }





    public Date getCreation_time() {
        return creation_time;
    }

    public void setCreation_time(Date creation_time) {
        this.creation_time = creation_time;
    }

    public String getSynch_status() {
        return synch_status;
    }

    public void setSynch_status(String synch_status) {
        this.synch_status = synch_status;
    }
}
