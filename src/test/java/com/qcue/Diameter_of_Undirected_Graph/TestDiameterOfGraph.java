package com.qcue.Diameter_of_Undirected_Graph;

import org.junit.Assert;
import org.junit.Test;

public class TestDiameterOfGraph {
	
	@Test
	public void testDiameter1() {		
		Assert.assertEquals(Diameter_of_UndirectedGraph.calculateDiameter("graphTest1.txt"), 3 );
	}
	
	@Test
	public void testDiameter2() {		
		Assert.assertEquals(Diameter_of_UndirectedGraph.calculateDiameter("graphTest2.txt"), Integer.MAX_VALUE );
	}
	
	@Test
	public void testDiameter3() {		
		Assert.assertEquals(Diameter_of_UndirectedGraph.calculateDiameter("graphTest3.txt"), 0);
	}
	
	@Test
	public void testDiameter4() {		
		Assert.assertEquals(Diameter_of_UndirectedGraph.calculateDiameter("graphTest4.txt"), 1);
	}
}
