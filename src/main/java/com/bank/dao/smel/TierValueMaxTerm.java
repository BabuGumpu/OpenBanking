package com.bank.dao.smel;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class TierValueMaxTerm{

	@JsonProperty("format")
	private String format;

	@JsonProperty("description")
	private String description;

	@JsonProperty("title")
	private String title;

	@JsonProperty("type")
	private String type;

	public void setFormat(String format){
		this.format = format;
	}

	public String getFormat(){
		return format;
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

	@Override
 	public String toString(){
		return 
			"TierValueMaxTerm{" + 
			"format = '" + format + '\'' + 
			",description = '" + description + '\'' + 
			",title = '" + title + '\'' + 
			",type = '" + type + '\'' + 
			"}";
		}
}