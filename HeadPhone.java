/*
File: HeadPhone.java
Author: BHollingsworth
Date: 18FEB17
Purpose: This program will construct a HeadPhone Class to represent a headphone set
It will have the ablity to construct at a min 3 differnt headphone objects.
*/
public class HeadPhone{
	//fields
	private final int LOW = 1;
	private final int MEDIUM = 2;
	private final int HIGH = 3;
	
	private int hpVolume = MEDIUM;
	private boolean pluggedIn = false;
	private String manufacturer;
	private String headPhoneColor;
	private String headPhoneModel;
	
	//getters and setters
	public void setHpVolume(int hpVolume){
		this.hpVolume = hpVolume;
	}
	public int getHpVolume(){
		return hpVolume;
	}
	
	
	public void setPluggedIn(boolean pluggedIn){
		this.pluggedIn = pluggedIn;
	}
	public boolean getPluggedIn(){
		return pluggedIn;
	}
	
	
	public void setManufacturer(String manufacturer){
		this.manufacturer = manufacturer;
	}
	public String getManufacturer(){
		return manufacturer;
	}
	
	
	public void setHeadPhoneColor(String headPhoneColor){
		this.headPhoneColor = headPhoneColor;
	}
	public String getHeadPhoneColor(){
		return headPhoneColor;
	}
	
	public void setHeadPhoneModel(String headPhoneModel){
		this.headPhoneModel = headPhoneModel;
	}
	public String getHeadPhoneModel(){
		return headPhoneModel;
	}
	
	//defualt constructor
	public HeadPhone(){
		hpVolume = MEDIUM;
		pluggedIn = false;
		manufacturer = "bose";
		headPhoneColor = "red";
		headPhoneModel = "wireless";
	}
	
	//overlaoded constructor
	public  HeadPhone (int hpVolume){
		this.hpVolume = hpVolume;
		//pluggedIn = false;
		//manufacturer = bose;
		//headPhoneColor = red;
		//headPhoneModel = wireless;
	}
	//overlaoded constructor
	public HeadPhone (int hpVolume, String manufacturer){
		this.hpVolume = hpVolume;
		//pluggedIn = false;
		this.manufacturer = manufacturer;
		//headPhoneColor = red;
		//headPhoneModel = wireless;
	}
	//overlaoded constructor
	public HeadPhone (int hpVolume, String manufacturer, String headPhoneColor){
		this.hpVolume = hpVolume;
		//pluggedIn;
		this.manufacturer = manufacturer;
		this.headPhoneColor = headPhoneColor;
		//headPhoneModel = wireless;
	}
	
	
	public String toString() {
	String str = "Your current headphone set has the following information; \nVolume is set to: " + hpVolume + "\nis it plugged in? " + pluggedIn + "\nThe manufacturer is: " + manufacturer + "\nThe color is: " + headPhoneColor + "\nIs it wired or wireless? " + headPhoneModel;
	return str;
	}
	}
	

	
	