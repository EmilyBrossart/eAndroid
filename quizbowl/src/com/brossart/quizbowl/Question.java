package com.brossart.quizbowl;

public class Question {
	
	String question;
	String answer;
	
	public Question()
	{
		this("", "");
	}
	
	public Question(String q, String a)
	{
		question = q;
		answer = a;
	}
	
	public String getQuestion()
	{
		return question;
	}
	
	public String getAnswer()
	{
		return answer;
	}

}
