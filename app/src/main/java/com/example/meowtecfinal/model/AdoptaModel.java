package com.example.meowtecfinal.model;

public class AdoptaModel {


    private int adoptaImage1;
    private int adoptaImage2;
    private String catName1;
    private String catName2;
    private String catAge1;
    private String catAge2;

    public AdoptaModel(int adoptaImage1, int adoptaImage2, String catName1, String catName2, String catAge1, String catAge2) {
        this.adoptaImage1 = adoptaImage1;
        this.adoptaImage2 = adoptaImage2;
        this.catName1 = catName1;
        this.catName2 = catName2;
        this.catAge1 = catAge1;
        this.catAge2 = catAge2;
    }

    public int getAdoptaImage1() {
        return adoptaImage1;
    }

    public void setAdoptaImage1(int adoptaImage1) {
        this.adoptaImage1 = adoptaImage1;
    }

    public int getAdoptaImage2() {
        return adoptaImage2;
    }

    public void setAdoptaImage2(int adoptaImage2) {
        this.adoptaImage2 = adoptaImage2;
    }

    public String getCatName1() {
        return catName1;
    }

    public void setCatName1(String catName1) {
        this.catName1 = catName1;
    }

    public String getCatName2() {
        return catName2;
    }

    public void setCatName2(String catName2) {
        this.catName2 = catName2;
    }

    public String getCatAge1() {
        return catAge1;
    }

    public void setCatAge1(String catAge1) {
        this.catAge1 = catAge1;
    }

    public String getCatAge2() {
        return catAge2;
    }

    public void setCatAge2(String catAge2) {
        this.catAge2 = catAge2;
    }
}
