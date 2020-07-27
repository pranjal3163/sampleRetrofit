package com.threebm.sampleapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class SunShineDetailData implements Serializable
{
    @SerializedName("sign")
    @Expose
    private String sunShineName;

    @SerializedName("Born on")
    @Expose
    private String sunShineDateRange;

    @SerializedName("Daily Horoscope")
    @Expose
    private String currentDate;

    @SerializedName("Prediction")
    @Expose
    private String sunShineDescription;

    @SerializedName("compatibility")
    @Expose
    private String sunShineCompatibility;

    @SerializedName("mood")
    @Expose
    private String sunShineMood;


    @SerializedName("color")
    @Expose
    private String sunShineColor;

    @SerializedName("lucky_number")
    @Expose
    private String sunShineLuckyNumber;

    @SerializedName("lucky_time")
    @Expose
    private String sunShineLuckyTime;


    public String getSunShineName() {
        return sunShineName;
    }

    public void setSunShineName(String sunShineName) {
        this.sunShineName = sunShineName;
    }

    public String getSunShineDateRange() {
        return sunShineDateRange;
    }

    public void setSunShineDateRange(String sunShineDateRange) {
        this.sunShineDateRange = sunShineDateRange;
    }

    public String getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(String currentDate) {
        this.currentDate = currentDate;
    }

    public String getSunShineDescription() {
        return sunShineDescription;
    }

    public void setSunShineDescription(String sunShineDescription) {
        this.sunShineDescription = sunShineDescription;
    }

    public String getSunShineCompatibility() {
        return sunShineCompatibility;
    }

    public void setSunShineCompatibility(String sunShineCompatibility) {
        this.sunShineCompatibility = sunShineCompatibility;
    }

    public String getSunShineMood() {
        return sunShineMood;
    }

    public void setSunShineMood(String sunShineMood) {
        this.sunShineMood = sunShineMood;
    }

    public String getSunShineColor() {
        return sunShineColor;
    }

    public void setSunShineColor(String sunShineColor) {
        this.sunShineColor = sunShineColor;
    }

    public String getSunShineLuckyNumber() {
        return sunShineLuckyNumber;
    }

    public void setSunShineLuckyNumber(String sunShineLuckyNumber) {
        this.sunShineLuckyNumber = sunShineLuckyNumber;
    }

    public String getSunShineLuckyTime() {
        return sunShineLuckyTime;
    }

    public void setSunShineLuckyTime(String sunShineLuckyTime) {
        this.sunShineLuckyTime = sunShineLuckyTime;
    }

}
