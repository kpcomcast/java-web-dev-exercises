package org.launchcode.java.studios.restaurantmenu;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastUpdate;
    private ArrayList<MenuItem> appList;
    private ArrayList<MenuItem> mainCourseList;
    private ArrayList<MenuItem> dessertList;

    public Menu(Date lastUpdate, ArrayList<MenuItem> appList, ArrayList<MenuItem> mainCourseList, ArrayList<MenuItem> dessertList) {
        this.lastUpdate = lastUpdate;
        this.appList = appList;
        this.mainCourseList = mainCourseList;
        this.dessertList = dessertList;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }
    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public ArrayList<MenuItem> getAppList() {
        return appList;
    }
    public void setAppList(ArrayList<MenuItem> appList) {
        this.appList = appList;
    }

    public ArrayList<MenuItem> getMainCourseList() {
        return mainCourseList;
    }
    public void setMainCourseList(ArrayList<MenuItem> mainCourseList) {
        this.mainCourseList = mainCourseList;
    }

    public ArrayList<MenuItem> getDessertList() {
        return dessertList;
    }
    public void setDessertList(ArrayList<MenuItem> dessertList) {
        this.dessertList = dessertList;
    }
}
