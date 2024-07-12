package com.zhuk.objects;

public class user {

    private String name;

    private String lastName;

    private  int age;


    public void setName (String name) {
        this.name =  name;
    }



    public void setAge (int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }



    public String getName () {
        return name;
    }

    public void setLastname(String lastname) {
        this.lastName = lastname;
    }

    public String getLastName () {
        return lastName;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj instanceof user) {

            user thatUser = (user) obj;

            return this.name.equals(thatUser.getName())
            && this.lastName.equals(thatUser.getLastName())
            && this.age == thatUser.getAge();
        }

        return false;
    }

    @Override
    public String toString() {
        return this.name + " " + this.lastName  + " " +this.age;
    }
}
