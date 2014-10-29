package com.zinteract.common.dom;

import javax.persistence.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.Date;

/**
 * Created by swati on 20/10/14.
 */
@Entity
public class ZDataSource {


    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long datasourceid;

    private long tenantid;

    private String name;

    private String description;

    private String type;

    private String channel;

    private enum status{CREATED,RAWDONE,ACCURATEDONE,RECONCILING,ARCHIVED};

    private String url;

    private String login_name;

    private String pwdhash;

    private String drivername;

    private String api_access_token;

    private String secretkey;

    private long created_by_id;

    private Date creation_time;
    private Date last_modified_time;
    private boolean is_hashed;
    private String  extra_info;
    private String connection_status;
    private String auth_type;
    private boolean is_onpremise;

    public ZDataSource(long tenantid, String name, String description, String type, String channel, String url, String login_name, String pwdhash, String drivername, String api_access_token, String secretkey, long created_by_id, Date creation_time, Date last_modified_time, boolean is_hashed, String extra_info, String connection_status, String auth_type, boolean is_onpremise) {
        this.tenantid = tenantid;
        this.name = name;
        this.description = description;
        this.type = type;
        this.channel = channel;
        this.url = url;
        this.login_name = login_name;
        this.pwdhash = pwdhash;
        this.drivername = drivername;
        this.api_access_token = api_access_token;
        this.secretkey = secretkey;
        this.created_by_id = created_by_id;
        this.creation_time = creation_time;
        this.last_modified_time = last_modified_time;
        this.is_hashed = is_hashed;
        this.extra_info = extra_info;
        this.connection_status = connection_status;
        this.auth_type = auth_type;
        this.is_onpremise = is_onpremise;
    }

    public ZDataSource() {
    }

    public String getExtra_info() {
        return extra_info;
    }

    public void setExtra_info(String extra_info) {
        this.extra_info = extra_info;
    }

    public long getDatasourceid() {
        return datasourceid;
    }

    public void setDatasourceid(long datasourceid) {
        this.datasourceid = datasourceid;
    }

    public long getTenantid() {
        return tenantid;
    }

    public void setTenantid(long tenantid) {
        this.tenantid = tenantid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getLogin_name() {
        return login_name;
    }

    public void setLogin_name(String login_name) {
        this.login_name = login_name;
    }

    public String getPwdhash() {
        return pwdhash;
    }

    public void setPwdhash(String pwdhash) {
        this.pwdhash = pwdhash;
    }

    public String getDrivername() {
        return drivername;
    }

    public void setDrivername(String drivername) {
        this.drivername = drivername;
    }

    public String getApi_access_token() {
        return api_access_token;
    }

    public void setApi_access_token(String api_access_token) {
        this.api_access_token = api_access_token;
    }

    public String getSecretkey() {
        return secretkey;
    }

    public void setSecretkey(String secretkey) {
        this.secretkey = secretkey;
    }

    public long getCreated_by_id() {
        return created_by_id;
    }

    public void setCreated_by_id(long created_by_id) {
        this.created_by_id = created_by_id;
    }

    public Date getCreation_time() {
        return creation_time;
    }

    public void setCreation_time(Date creation_time) {
        this.creation_time = creation_time;
    }

    public Date getLast_modified_time() {
        return last_modified_time;
    }

    public void setLast_modified_time(Date last_modified_time) {
        this.last_modified_time = last_modified_time;
    }

    public boolean isIs_hashed() {
        return is_hashed;
    }

    public void setIs_hashed(boolean is_hashed) {
        this.is_hashed = is_hashed;
    }

    public String getConnection_status() {
        return connection_status;
    }

    public void setConnection_status(String connection_status) {
        this.connection_status = connection_status;
    }

    public String getAuth_type() {
        return auth_type;
    }

    public void setAuth_type(String auth_type) {
        this.auth_type = auth_type;
    }

    public boolean isIs_onpremise() {
        return is_onpremise;
    }

    public void setIs_onpremise(boolean is_onpremise) {
        this.is_onpremise = is_onpremise;
    }
}