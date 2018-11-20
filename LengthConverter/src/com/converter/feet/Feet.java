package com.converter.feet;

public class Feet implements FeetConvertion {

	double data;
	public double getData() {
		return data;
	}

	public void setData(double data) {
		this.data = data;
	}

	@Override
	public double Meter2Feet(double mt) {
		
		return mt * 3.2808399;
	}
	
	@Override
	public double Inch2Feet(double in) {
		
		return in * 0.08333333;
	}

}
