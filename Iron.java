/*
File: Iron.java
Author: BHollingsworth
Date: 19FEB17
Purpose: Build a Java Class
*/


public class Iron {
//Private fields
    private boolean isOn;
    private boolean isPluggedIn;
    private int tempSetting;
    private boolean isHot;

//constructor 
    public void Iron(){
        isOn = false;
      isPluggedIn = false;
       tempSetting = 0;
    isHot = false;
    }
//method to change temp
	public void changeTemp(int setting){
tempSetting = setting;
	if(tempSetting>=5){
	isHot = true;
    }
	}

    

    public static void main(String[] args) {
		//build instance of class
Iron myIron = new Iron();
//check status of internal field in new instance.
System.out.println("is the Iron Hot? : " + myIron.isHot);

//call method to check the ablity to change fields
int setting = 6;
myIron.changeTemp(setting);
System.out.println("is the Iron Hot? : " + myIron.isHot);







    }
}
