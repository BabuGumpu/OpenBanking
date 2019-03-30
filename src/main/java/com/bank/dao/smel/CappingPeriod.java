package com.bank.dao.smel;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class CappingPeriod{

	@JsonProperty("description")
	private String description;

	@JsonProperty("title")
	private String title;

	@JsonProperty("type")
	private String type;

	@JsonProperty("enum")
	private List<String> jsonMemberEnum;

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

	public void setJsonMemberEnum(List<String> jsonMemberEnum){
		this.jsonMemberEnum = jsonMemberEnum;
	}

	public List<String> getJsonMemberEnum(){
		return jsonMemberEnum;
	}

	@Override
 	public String toString(){
		return 
			"CappingPeriod{" + 
			"description = '" + description + '\'' + 
			",title = '" + title + '\'' + 
			",type = '" + type + '\'' + 
			",enum = '" + jsonMemberEnum + '\'' + 
			"}";
		}
}