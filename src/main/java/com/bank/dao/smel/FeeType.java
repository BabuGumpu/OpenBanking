package com.bank.dao.smel;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.util.List;

@Generated("com.robohorse.robopojogenerator")
public class FeeType{

	@JsonProperty("minItems")
	private int minItems;

	@JsonProperty("description")
	private String description;

	@JsonProperty("title")
	private String title;

	@JsonProperty("type")
	private String type;

	@JsonProperty("items")
	private Items items;

	@JsonProperty("enum")
	private List<String> jsonMemberEnum;

	public void setMinItems(int minItems){
		this.minItems = minItems;
	}

	public int getMinItems(){
		return minItems;
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

	public void setItems(Items items){
		this.items = items;
	}

	public Items getItems(){
		return items;
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
			"FeeType{" + 
			"minItems = '" + minItems + '\'' + 
			",description = '" + description + '\'' + 
			",title = '" + title + '\'' + 
			",type = '" + type + '\'' + 
			",items = '" + items + '\'' + 
			",enum = '" + jsonMemberEnum + '\'' + 
			"}";
		}
}