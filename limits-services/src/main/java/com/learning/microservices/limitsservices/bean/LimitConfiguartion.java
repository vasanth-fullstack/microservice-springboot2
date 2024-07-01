package com.learning.microservices.limitsservices.bean;

public class LimitConfiguartion {
	private int maximum;
	private int minimum;
	
	protected LimitConfiguartion() {
		
	}
	
	public LimitConfiguartion(int maximum, int minimum) {
		this.maximum = maximum;
		this.minimum = minimum;
	}
	public int getMaximum() {
		return maximum;
	}
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}
	public int getMinimum() {
		return minimum;
	}
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}
	
	
}
