package com.example.meowtecfinal.model;

public class AlbergueModel {

    private int albergueImage;
    private String albergueName;
    private String albergueTipo;
    private String alberguePlace;
    private String albergueDate;
    private String albergueSize;
    private String albergueRName;
    private String albergueRNumber;

    public AlbergueModel(int albergueImage, String albergueName, String albergueTipo, String alberguePlace, String albergueDate, String albergueSize, String albergueRName, String albergueRNumber) {
        this.albergueImage = albergueImage;
        this.albergueName = albergueName;
        this.albergueTipo = albergueTipo;
        this.alberguePlace = alberguePlace;
        this.albergueDate = albergueDate;
        this.albergueSize = albergueSize;
        this.albergueRName = albergueRName;
        this.albergueRNumber = albergueRNumber;
    }

    public String getAlberguePlace() {
        return alberguePlace;
    }

    public void setAlberguePlace(String alberguePlace) {
        this.alberguePlace = alberguePlace;
    }

    public String getAlbergueDate() {
        return albergueDate;
    }

    public void setAlbergueDate(String albergueDate) {
        this.albergueDate = albergueDate;
    }

    public String getAlbergueSize() {
        return albergueSize;
    }

    public void setAlbergueSize(String albergueSize) {
        this.albergueSize = albergueSize;
    }

    public String getAlbergueRName() {
        return albergueRName;
    }

    public void setAlbergueRName(String albergueRName) {
        this.albergueRName = albergueRName;
    }

    public String getAlbergueRNumber() {
        return albergueRNumber;
    }

    public void setAlbergueRNumber(String albergueRNumber) {
        this.albergueRNumber = albergueRNumber;
    }


    public int getAlbergueImage() {
        return albergueImage;
    }

    public void setAlbergueImage(int albergueImage) {
        this.albergueImage = albergueImage;
    }

    public String getAlbergueName() {
        return albergueName;
    }

    public void setAlbergueName(String albergueName) {
        this.albergueName = albergueName;
    }

    public String getAlbergueTipo() {
        return albergueTipo;
    }

    public void setAlbergueTipo(String aboutMovie) {
        this.albergueTipo = aboutMovie;
    }
}
