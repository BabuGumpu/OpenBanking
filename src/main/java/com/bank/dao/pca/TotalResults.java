package com.bank.dao.pca;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class TotalResults{

	@JsonProperty("type")
	private String type;

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	@Override
 	public String toString(){
		return 
			"TotalResults{" + 
			"type = '" + type + '\'' + 
			"}";
		}
}