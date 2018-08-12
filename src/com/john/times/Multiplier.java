package com.john.times;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class Multiplier {
	public Multiplier()
	{
		
	}
	
	public int mult(int n, int m)
	{
		return n * m;
	}
	
	public int div(int n, int m)
	{
		return n / m;
	}
	
	public int sub(int n, int m)
	{
		return  n - m;
	}

	public int add(int n, int m)
	{
		return  n + m;
	}
}
