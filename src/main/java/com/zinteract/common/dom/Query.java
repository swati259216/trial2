package com.zinteract.common.dom;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by swati on 20/10/14.
 */
@Entity
public class Query {

    @Id

    private long queryid;

    private long tenantid;
    private String query_type;
    private long milestoneid;
    private String definition;
    private long mainqueryid;
    private long correlationqueryid;
    private String channel;
    private boolean include_exclude_filters;
    private String input_params;
    private String result_object;
    private String result_mapping;
    private String extra_info;
    private long sequence_num;
    private long created_by_id;
    private Date creation_time;
    private String editing_status;
    private String running_status;
    private String synch_status;
    private String correlation_params;
    private Date last_modified_time;
    private String syntaxversion;
    private long log_pattern_id;

    public Query() {
    }

    public Query(long tenantid, String query_type, long milestoneid, String definition, long mainqueryid, long correlationqueryid, String channel, boolean include_exclude_filters, String input_params, String result_object, String result_mapping, String extra_info, long sequence_num, long created_by_id, Date creation_time, String editing_status, String running_status, String synch_status, String correlation_params, Date last_modified_time, String syntaxversion, long log_pattern_id) {
        this.tenantid = tenantid;
        this.query_type = query_type;
        this.milestoneid = milestoneid;
        this.definition = definition;
        this.mainqueryid = mainqueryid;
        this.correlationqueryid = correlationqueryid;
        this.channel = channel;
        this.include_exclude_filters = include_exclude_filters;
        this.input_params = input_params;
        this.result_object = result_object;
        this.result_mapping = result_mapping;
        this.extra_info = extra_info;
        this.sequence_num = sequence_num;
        this.created_by_id = created_by_id;
        this.creation_time = creation_time;
        this.editing_status = editing_status;
        this.running_status = running_status;
        this.synch_status = synch_status;
        this.correlation_params = correlation_params;
        this.last_modified_time = last_modified_time;
        this.syntaxversion = syntaxversion;
        this.log_pattern_id = log_pattern_id;
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

    public String getQuery_type() {
        return query_type;
    }

    public void setQuery_type(String query_type) {
        this.query_type = query_type;
    }

    public long getMilestoneid() {
        return milestoneid;
    }

    public void setMilestoneid(long milestoneid) {
        this.milestoneid = milestoneid;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public long getMainqueryid() {
        return mainqueryid;
    }

    public void setMainqueryid(long mainqueryid) {
        this.mainqueryid = mainqueryid;
    }

    public long getCorrelationqueryid() {
        return correlationqueryid;
    }

    public void setCorrelationqueryid(long correlationqueryid) {
        this.correlationqueryid = correlationqueryid;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public boolean isInclude_exclude_filters() {
        return include_exclude_filters;
    }

    public void setInclude_exclude_filters(boolean include_exclude_filters) {
        this.include_exclude_filters = include_exclude_filters;
    }

    public String getInput_params() {
        return input_params;
    }

    public void setInput_params(String input_params) {
        this.input_params = input_params;
    }

    public Object getResult_object() {
        return result_object;
    }

    public void setResult_object(String result_object) {
        this.result_object = result_object;
    }

    public Object getResult_mapping() {
        return result_mapping;
    }

    public void setResult_mapping(String result_mapping) {
        this.result_mapping = result_mapping;
    }

    public String getExtra_info() {
        return extra_info;
    }

    public void setExtra_info(String extra_info) {
        this.extra_info = extra_info;
    }

    public long getSequence_num() {
        return sequence_num;
    }

    public void setSequence_num(long sequence_num) {
        this.sequence_num = sequence_num;
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

    public String getEditing_status() {
        return editing_status;
    }

    public void setEditing_status(String editing_status) {
        this.editing_status = editing_status;
    }

    public String getRunning_status() {
        return running_status;
    }

    public void setRunning_status(String running_status) {
        this.running_status = running_status;
    }

    public String getSynch_status() {
        return synch_status;
    }

    public void setSynch_status(String synch_status) {
        this.synch_status = synch_status;
    }

    public String getCorrelation_params() {
        return correlation_params;
    }

    public void setCorrelation_params(String correlation_params) {
        this.correlation_params = correlation_params;
    }

    public Date getLast_modified_time() {
        return last_modified_time;
    }

    public void setLast_modified_time(Date last_modified_time) {
        this.last_modified_time = last_modified_time;
    }

    public String getSyntaxversion() {
        return syntaxversion;
    }

    public void setSyntaxversion(String syntaxversion) {
        this.syntaxversion = syntaxversion;
    }

    public long getLog_pattern_id() {
        return log_pattern_id;
    }

    public void setLog_pattern_id(long log_pattern_id) {
        this.log_pattern_id = log_pattern_id;
    }
}
