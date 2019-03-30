package com.bank.dao.smel;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class FeeChargeDetail{

	@JsonProperty("minItems")
	private int minItems;

	@JsonProperty("description")
	private String description;

	@JsonProperty("additionalProperties")
	private boolean additionalProperties;

	@JsonProperty("type")
	private String type;

	@JsonProperty("title")
	private String title;

	@JsonProperty("items")
	private Items items;

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

	public void setAdditionalProperties(boolean additionalProperties){
		this.additionalProperties = additionalProperties;
	}

	public boolean isAdditionalProperties(){
		return additionalProperties;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setItems(Items items){
		this.items = items;
	}

	public Items getItems(){
		return items;
	}

	@Override
 	public String toString(){
		return 
			"FeeChargeDetail{" + 
			"minItems = '" + minItems + '\'' + 
			",description = '" + description + '\'' + 
			",additionalProperties = '" + additionalProperties + '\'' + 
			",type = '" + type + '\'' + 
			",title = '" + title + '\'' + 
			",items = '" + items + '\'' + 
			"}";
		}
}