package com.zinteract.common.dom;

/**
 * Created by swati on 21/10/14.
 */
public class Source {

    public String message;
    public String version;
    public String timestamp;
    public String type;
    public String host;

    public Source(String message, String version, String timestamp, String type, String host) {
        this.message = message;
        this.version = version;
        this.timestamp = timestamp;
        this.type = type;
        this.host = host;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }
}
