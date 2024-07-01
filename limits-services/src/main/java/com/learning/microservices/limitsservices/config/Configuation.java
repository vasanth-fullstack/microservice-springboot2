package com.learning.microservices.limitsservices.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limits-service")
public class Configuation {

	private int minimum;
	private int maximum;
	
	@Override
	public String toString() {
		return "Configuation [minimum=" + minimum + ", maximum=" + maximum + "]";
	}
	public int getMinimum() {
		return minimum;
	}
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}
	public int getMaximum() {
		return maximum;
	}
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}
	
	
}
