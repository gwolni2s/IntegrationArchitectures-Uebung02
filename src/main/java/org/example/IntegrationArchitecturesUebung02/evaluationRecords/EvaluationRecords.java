package org.example.IntegrationArchitecturesUebung02.evaluationRecords;

import org.bson.Document;
import org.springframework.data.annotation.Id;

public class EvaluationRecords {

    @Id
    private String id;
    private long sid; //Identification per sid
    private long year; //Year of performance

    //Orders Evaluation
    private String nameProduct;
    private String client;
    private String clientRanking;
    private long soldItems;

    private long targetValue; //target value for competences

    //social performance evaluation
    private long leadershipCompetence;
    private long opennessToEmployee;
    private long socialBehaviour;
    private long attitudeTowardsClient;

    private long communicationSkills;
    private long integrityToCompany;

    //Bonuses
    private long bonusA;
    private long bonusB;

    //private String comment
    private String remark;

    /**
     * constructor
     */
    public EvaluationRecords() {
    }

    public EvaluationRecords(long sid, long year, String nameProduct, String client, String clientRanking, long soldItems, long targetValue, long leadershipCompetence, long opennessToEmployee, long socialBehaviour, long attitudeTowardsClient, long communicationSkills, long integrityToCompany, long bonusA, long bonusB, String remark) {
        this.sid = sid;
        this.year = year;
        this.nameProduct = nameProduct;
        this.client = client;
        this.clientRanking = clientRanking;
        this.soldItems = soldItems;
        this.targetValue = targetValue;
        this.leadershipCompetence = leadershipCompetence;
        this.opennessToEmployee = opennessToEmployee;
        this.socialBehaviour = socialBehaviour;
        this.attitudeTowardsClient = attitudeTowardsClient;
        this.communicationSkills = communicationSkills;
        this.integrityToCompany = integrityToCompany;
        this.bonusA = bonusA;
        this.bonusB = bonusB;
        this.remark = remark;
    }

    public EvaluationRecords(String id, long sid, long year, String nameProduct, String client, String clientRanking, long soldItems, long targetValue, long leadershipCompetence, long opennessToEmployee, long socialBehaviour, long attitudeTowardsClient, long communicationSkills, long integrityToCompany, long bonusA, long bonusB, String remark) {
        this.id = id;
        this.sid = sid;
        this.year = year;
        this.nameProduct = nameProduct;
        this.client = client;
        this.clientRanking = clientRanking;
        this.soldItems = soldItems;
        this.targetValue = targetValue;
        this.leadershipCompetence = leadershipCompetence;
        this.opennessToEmployee = opennessToEmployee;
        this.socialBehaviour = socialBehaviour;
        this.attitudeTowardsClient = attitudeTowardsClient;
        this.communicationSkills = communicationSkills;
        this.integrityToCompany = integrityToCompany;
        this.bonusA = bonusA;
        this.bonusB = bonusB;
        this.remark = remark;
    }

    /**
     * getter and setter methods
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getSid() {
        return sid;
    }

    public void setSid(long sid) {
        this.sid = sid;
    }

    public long getYear() {
        return year;
    }

    public void setYear(long year) {
        this.year = year;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getClientRanking() {
        return clientRanking;
    }

    public void setClientRanking(String clientRanking) {
        this.clientRanking = clientRanking;
    }

    public long getSoldItems() {
        return soldItems;
    }

    public void setSoldItems(long soldItems) {
        this.soldItems = soldItems;
    }

    public long getTargetValue() {
        return targetValue;
    }

    public void setTargetValue(long Value) {
        targetValue = Value;
    }

    public long getLeadershipCompetence() {
        return leadershipCompetence;
    }

    public void setLeadershipCompetence(long leadershipCompetence) {
        this.leadershipCompetence = leadershipCompetence;
    }

    public long getOpennessToEmployee() {
        return opennessToEmployee;
    }

    public void setOpennessToEmployee(long opennessToEmployee) {
        this.opennessToEmployee = opennessToEmployee;
    }

    public long getSocialBehaviour() {
        return socialBehaviour;
    }

    public void setSocialBehaviour(long socialBehaviour) {
        this.socialBehaviour = socialBehaviour;
    }

    public long getAttitudeTowardsClient() {
        return attitudeTowardsClient;
    }

    public void setAttitudeTowardsClient(long attitudeTowardsClient) {
        this.attitudeTowardsClient = attitudeTowardsClient;
    }

    public long getCommunicationSkills() {
        return communicationSkills;
    }

    public void setCommunicationSkills(long communicationSkills) {
        this.communicationSkills = communicationSkills;
    }

    public long getIntegrityToCompany() {
        return integrityToCompany;
    }

    public void setIntegrityToCompany(long integrityToCompany) {
        this.integrityToCompany = integrityToCompany;
    }

    public long getBonusA() {
        return bonusA;
    }

    public void setBonusA(long bonusA) {
        this.bonusA = bonusA;
    }

    public long getBonusB() {
        return bonusB;
    }

    public void setBonusB(long bonusB) {
        this.bonusB = bonusB;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
    /**
     * Implementation of the Object-to-Document Mapping by Prof. Dr. Alda from lectures
     */
    public Document toDocument() {
        return new Document()
                .append("sid", this.sid)
                .append("year", this.year)
                .append("nameProduct", this.nameProduct)
                .append("client", this.client)
                .append("clientRanking", this.clientRanking)
                .append("soldItems", this.soldItems)
                .append("targetValue", targetValue)
                .append("leadershipCompetence", this.leadershipCompetence)
                .append("opennessToEmployee", this.opennessToEmployee)
                .append("socialBehaviour", this.socialBehaviour)
                .append("attitudeTowardsClient", this.attitudeTowardsClient)
                .append("communicationSkills", this.communicationSkills)
                .append("integrityToCompany", this.integrityToCompany)
                .append("bonusA", this.bonusA)
                .append("bonusB", this.bonusB)
                .append("remark", this.remark);
    }

    public String toString() {
        return "id: " + this.id + "\nsid: " + this.sid + "\nyear: " + this.year + "\nnameProduct: " + this.nameProduct +
                "\nclient: " + this.client + "\nClientRanking: " + this.clientRanking + "\nsoldItems: " +
                this.soldItems + "\ntargetValue: " + this.targetValue + "\nleadershipCompetence: " + this.leadershipCompetence +
                "\nOpenness to Employee: " + this.opennessToEmployee + "\nsocialBehaviour: " + this.socialBehaviour +
                "\nattitudeTowardsClient: " + this.attitudeTowardsClient + "\ncommunicationSkills: " + this.communicationSkills +
                "\nintegrityToCompany: " + this.integrityToCompany + "\nbonusA: " + this.bonusA + "\nbonusB: " + this.bonusB +
                "\nremark: " + this.remark;
    }

}