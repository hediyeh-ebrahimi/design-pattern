package com.tutorial.prototype.Query;

public class Statement implements Cloneable{
    private String projection;
    private String from;
    private String where;
    private String groupBy;
    private String orderBy;
    private Record record;

    public Statement() {
    }

    public Statement(String projection, String from, String where, String groupBy, String orderBy, Record record) {
        this.projection = projection;
        this.from = from;
        this.where = where;
        this.groupBy = groupBy;
        this.orderBy = orderBy;
        this.record = record;
    }

    public String getProjection() {
        return projection;
    }

    public Statement setProjection(String projection) {
        this.projection = projection;
        return this;
    }

    public String getFrom() {
        return from;
    }

    public Statement setFrom(String from) {
        this.from = from;
        return this;
    }

    public String getWhere() {
        return where;
    }

    public Statement setWhere(String where) {
        this.where = where;
        return this;
    }

    public String getGroupBy() {
        return groupBy;
    }

    public Statement setGroupBy(String groupBy) {
        this.groupBy = groupBy;
        return this;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public Statement setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public Record getRecord() {
        return record;
    }

    public Statement setRecord(Record record) {
        this.record = record;
        return this;
    }

    @Override
    public Statement clone()  {
        try {
            return (Statement) super.clone();
        } catch (CloneNotSupportedException e) {
            return  null;
        }
    }
}
