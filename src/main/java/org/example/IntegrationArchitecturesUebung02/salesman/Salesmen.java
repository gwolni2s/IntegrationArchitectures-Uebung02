package org.example.IntegrationArchitecturesUebung02.salesman;

import org.bson.Document;
import org.springframework.data.annotation.Id;

public class Salesmen {

    @Id
    private String id;
    private long sid;
    private String firstname;
    private String lastname;

    public Salesmen() {
    }

    public Salesmen(Long sid, String firstname, String lastname) {
        this.sid = sid;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public Salesmen(String id, long sid, String firstname, String lastname) {
        this.id = id;
        this.sid = sid;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getSid() {
        return sid;
    }
    public void setSid(Long sid) {
        this.sid = sid;
    }
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    /**
     * Implementation of the Object-to-Document Mapping by Prof. Dr. Alda from lectures
     */
    public Document toDocument() {
        return new Document()
                .append("sid", this.sid)
                .append("firstname", this.firstname)
                .append("lastname", this.lastname);
    }
    public String toString() {
        return "id: " + this.id + "\nsid: " + this.sid + "\nfirstname: " + this.firstname + "\nlastname: " + this.lastname;
    }
}
