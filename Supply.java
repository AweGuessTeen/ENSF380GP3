//Supply

package edu.ucalgary.oop;

public class Supply{
	private String type;
	private int quantity;
	
	//constructor
	public Supply(String type, int quantity){
		this.type = type;
		this.quantity = quantity;
	}
	
	//getters
	public String getType(){
		return type;
	}
	
	public int getQuantity(){
		return quantity;
	}
	
	//setters
	public void setType(String type){
		this.type = type;
	}
	
	public void setQuantity(int quantity){
		this.quantity = quantity;
	}

}