package com.bank.dao.smel;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Code{

	@JsonProperty("minLength")
	private int minLength;

	@JsonProperty("pattern")
	private String pattern;

	@JsonProperty("description")
	private String description;

	@JsonProperty("title")
	private String title;

	@JsonProperty("type")
	private String type;

	@JsonProperty("maxLength")
	private int maxLength;

	public void setMinLength(int minLength){
		this.minLength = minLength;
	}

	public int getMinLength(){
		return minLength;
	}

	public void setPattern(String pattern){
		this.pattern = pattern;
	}

	public String getPattern(){
		return pattern;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setMaxLength(int maxLength){
		this.maxLength = maxLength;
	}

	public int getMaxLength(){
		return maxLength;
	}

	@Override
 	public String toString(){
		return 
			"Code{" + 
			"minLength = '" + minLength + '\'' + 
			",pattern = '" + pattern + '\'' + 
			",description = '" + description + '\'' + 
			",title = '" + title + '\'' + 
			",type = '" + type + '\'' + 
			",maxLength = '" + maxLength + '\'' + 
			"}";
		}
}