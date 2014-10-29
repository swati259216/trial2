package com.zinteract.common.dom;


/**
 * Created by swati on 21/10/14.
 */
public class ElasticsearchResult implements QueryResult {

    private long queryid;
    private long datasourceid;
    private String index;
    private String type;
    private long id;
    private int score;
    private Source source;

    public ElasticsearchResult(long queryid, long datasourceid, String index, String type, long id, int score, Source source) {
        this.queryid = queryid;
        this.datasourceid = datasourceid;
        this.index = index;
        this.type = type;
        this.id = id;
        this.score = score;
        this.source = source;
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

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }
}
