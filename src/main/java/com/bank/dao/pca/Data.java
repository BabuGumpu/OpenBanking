package com.bank.dao.pca;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Data{

	@JsonProperty("type")
	private String type;

	@JsonProperty("items")
	private Items items;

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

	@Override
 	public String toString(){
		return 
			"Data{" + 
			"type = '" + type + '\'' + 
			",items = '" + items + '\'' + 
			"}";
		}
}