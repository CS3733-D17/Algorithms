/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.slackers.inc.alrorithms;

import java.util.Date;

/**
 *
 * @author John Stegeman <j.stegeman@labyrinth-tech.com>
 */
public class FormEntry {
    
    public enum Type
    {
        WINE,
        BEER,
        DISTILLED;
    }
    
    private String beverage;
    private String submitter;
    private String receiver;
    private Type beverageType;
    private Date submissionDate;

    public FormEntry(String beverage, String submitter, String receiver, Type beverageType, Date submissionDate) {
        this.beverage = beverage;
        this.submitter = submitter;
        this.receiver = receiver;
        this.beverageType = beverageType;
        this.submissionDate = submissionDate;
    }

    public String getBeverage() {
        return beverage;
    }

    public String getSubmitter() {
        return submitter;
    }

    public String getReceiver() {
        return receiver;
    }

    public Type getBeverageType() {
        return beverageType;
    }

    public Date getSubmissionDate() {
        return submissionDate;
    }

    public void setBeverage(String beverage) {
        this.beverage = beverage;
    }

    public void setSubmitter(String submitter) {
        this.submitter = submitter;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public void setBeverageType(Type beverageType) {
        this.beverageType = beverageType;
    }

    public void setSubmissionDate(Date submissionDate) {
        this.submissionDate = submissionDate;
    }
    
    
}
