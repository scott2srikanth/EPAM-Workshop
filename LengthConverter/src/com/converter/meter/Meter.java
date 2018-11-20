package com.converter.meter;

public class Meter implements MeterConvertion {

	double data;

	public double getData() {
		return data;
	}

	public void setData(double data) {
		this.data = data;
	}
	
	@Override
	public double Feet2Meter(double ft) {
		return ft * 0.3048;
	}

	@Override
	public double Inch2Meter(double in) {
		return in * 0.0254;
	}

	
}
