package com.bank.dao.smel;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Agreement{

	@JsonProperty("type")
	private String type;

	@JsonProperty("enum")
	private List<String> jsonMemberEnum;

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
			"Agreement{" + 
			"type = '" + type + '\'' + 
			",enum = '" + jsonMemberEnum + '\'' + 
			"}";
		}
}