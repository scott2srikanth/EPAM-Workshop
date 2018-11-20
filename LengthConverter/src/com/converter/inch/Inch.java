package com.converter.inch;

public class Inch implements InchConvertion {

	double data;

	public double getData() {
		return data;
	}

	public void setData(double data) {
		this.data = data;
	}

	@Override
	public double Feet2Inch(double ft) {
		
		return ft * 12;
	}
	
	@Override
	public double Meter2Inch(double mt) {
		
		return mt * 39.3700787;
	}

}
