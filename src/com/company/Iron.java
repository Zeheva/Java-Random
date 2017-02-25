package com.company;

public class Iron {

    private boolean isOn;
    private boolean isPluggedIn;
    private int tempSetting;
    private boolean isHot;

//constructor 
    public void Iron(){
        this.isOn = false;
        this.isPluggedIn = false;
        this.tempSetting = 0;
       this.isHot = false;
    }

    

    

    public static void main(String[] args) {
Iron myIron = new Iron();
System.out.println(myIron);







    }
}
