package com.converter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.converter.feet.Feet;
import com.converter.inch.Inch;
import com.converter.meter.Meter;

class LengthConverterTestCase {
	
	Meter mt=new Meter();
	Feet ft=new Feet();
	Inch in=new Inch();
	
	@BeforeEach
	void init()
	{
		mt.setData(2);
		ft.setData(2);
		in.setData(2);
	}

	
	@Test
	void testMeterConversions()
	{
		assertEquals(0.6096, mt.Feet2Meter(ft.getData()));
		assertEquals(0.0508, mt.Inch2Meter(in.getData()));
	}
	
	@Test
	void testFeetConversions()
	{
		assertEquals(6.5616798, ft.Meter2Feet(mt.getData()));
		assertEquals(0.16666666, ft.Inch2Feet(in.getData()));
	}
	
	@Test
	void testInchConversions()
	{
		assertEquals(78.7401574, in.Meter2Inch(mt.getData()));
		assertEquals(24.0, in.Feet2Inch(ft.getData()));
	}

}
