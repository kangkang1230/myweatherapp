package db;

import org.litepal.LitePal;

public class Time extends LitePal {
    private String title;
    private String time;

    public Time(String title, String time) {
        this.title = title;
        this.time = time;
    }
    //定义默认的构造方法，否则更新数据时会报错
    public Time(){

    }
    public String getTitle() {
        return title;
    }
    public String getTime() {
        return time;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setTime(String time) {
        this.time = time;
    }
}