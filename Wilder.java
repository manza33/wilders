package com.company;

public class Wilder {
    private String firstname;
    private  boolean aware;

    public Wilder(String firstname, boolean aware) {
        this.firstname = firstname;
        this.aware = aware;
    }

    // Return Firstname and ware or not for a wilder
    public String whoAmI(){
        String response = "";
        response = "Je m'appelle " + firstname ;
        if(aware)
            response += " et je suis aware";
        else
            response += " et ne suis pas aware";

        return response;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public boolean isAware() {
        return aware;
    }

    public void setAware(boolean aware) {
        this.aware = aware;
    }
}