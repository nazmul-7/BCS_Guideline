package com.example.user.bcs_guideline.HelperClass;

import java.io.Serializable;

@SuppressWarnings("serial")
public class UserDetails implements Serializable {
     private String username,password;
     private int L1;
    private int L2;
    private int L3;
    private int L4;
    private int L5;
    private int ID;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }




    public int getL1() {
        return L1;
    }

    public void setL1(int l1) {
        this.L1 = l1;
    }

    public int getL2() {
        return L2;
    }

    public void setL2(int l2) {
        this.L2 = l2;
    }

    public int getL3() {
        return L3;
    }

    public void setL3(int l3) {
        this.L3 = l3;
    }
    public int getL4() {
        return L4;
    }

    public void setL4(int l4) {
        this.L4 = l4;
    }
public int getL5() {
        return L5;
    }

    public void setL5(int l5) {
        this.L5 = l5;
    }



    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
