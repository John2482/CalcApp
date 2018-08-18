package com.john.times;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Stateless
@Entity
@Table (name="multiplier")
public class Multiplier {
	@Id
	@GeneratedValue
	private int id;
	private List<String> equation;
	
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
	
	public void addToEquation(String s)
	{
		equation.add(s);
	}
	
	public List<String> getEquation()
	{
		return equation;
	}
}
