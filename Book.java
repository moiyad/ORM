package com.example.tr2355.orm;


import com.orm.SugarRecord;

/**
 * Created by tr2355 on 7/23/2017.
 */

public class Book extends SugarRecord {


    String name;

    public Book(){
    }

    public Book(String name, String edition){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
