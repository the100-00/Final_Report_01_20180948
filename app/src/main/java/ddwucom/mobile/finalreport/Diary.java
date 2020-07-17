package ddwucom.mobile.finalreport;

import java.io.Serializable;

public class Diary implements Serializable {
    long _id;
    String name;
    String today;
    String date;
    String weather;

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public long get_id() {
        return _id;
    }

    public void set_id(long _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getToday() {
        return today;
    }

    public void setToday(String today) {
        this.today = today;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Diary(String name, String today,String date,String weather) {
        this.name = name;
        this.today = today;
        this.date = date;
        this.weather = weather;
    }

    public Diary(long _id, String name, String today, String date,String weather) {
        this._id = _id;
        this.name = name;
        this.today = today;
        this.date = date;
        this.weather = weather;
    }

}
