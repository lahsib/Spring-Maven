/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bishal.academyproject.entity;

import java.util.Date;

/**
 *
 * @author Bishal
 */
public class Course {
    private int id;
    private String name,description;
    private int duration;
    private String durationType;
    private double fees;
    private Date addedDate,modifiedDate,deletedDate;
    private boolean deleteFlag,status;

    public Course() {
    }

    public Course(int id, String name, String description,int duration, String durationType, double fees, boolean status) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.duration=duration;
        this.durationType = durationType;
        this.fees = fees;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getDurationType() {
        return durationType;
    }

    public void setDurationType(String durationType) {
        this.durationType = durationType;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    public Date getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public Date getDeletedDate() {
        return deletedDate;
    }

    public void setDeletedDate(Date deletedDate) {
        this.deletedDate = deletedDate;
    }

    public boolean isDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(boolean deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Course{" + "id=" + id + ", name=" + name + ", description=" + description + ", duration=" + duration + ", durationType=" + durationType + ", fees=" + fees + ", addedDate=" + addedDate + ", modifiedDate=" + modifiedDate + ", deletedDate=" + deletedDate + ", deleteFlag=" + deleteFlag + ", status=" + status + '}';
    }
    
}
