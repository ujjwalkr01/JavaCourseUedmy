package com.assignment11.ObjectClassMethods;

public class ElectricityBill {

	private int meterNo;
	private String name;
	private String address;

	public int getMeterNo() {
		return meterNo;
	}

	public void setMeterNo(int meterNo) {
		this.meterNo = meterNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() { // used to give the complete detail of the object...
		return "Detailed information of ElectricityBill of a Customer is: " + "\nMeter No.:- " + this.meterNo
				+ "\nCustomer Name:- " + this.name + "\nAddress:- " + this.address;
	}

	@Override
	public int hashCode() { // return the hash code value of the object
		return meterNo;
	}

	@Override
	public boolean equals(Object obj) {
		ElectricityBill eb = (ElectricityBill) obj; //to check whether two objects have the same value or not... wee override the equals().. 

		if (eb.getMeterNo() == this.meterNo && eb.getName().equals(this.name) && eb.getAddress().equals(this.address)) {
			return true;
		}
		return false;

	}
}
