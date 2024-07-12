package com.zhuk.objects;

import java.util.HashMap;

public class Student extends user{
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    private String groupName;


    @Override
    public int hashCode() {
        return 0;
    }
}
