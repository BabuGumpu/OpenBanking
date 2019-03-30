package com.bank.dao.smel;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class License{

	@JsonProperty("format")
	private String format;

	@JsonProperty("description")
	private String description;

	@JsonProperty("type")
	private String type;

	@JsonProperty("enum")
	private List<String> jsonMemberEnum;

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
			"License{" + 
			"format = '" + format + '\'' + 
			",description = '" + description + '\'' + 
			",type = '" + type + '\'' + 
			",enum = '" + jsonMemberEnum + '\'' + 
			"}";
		}
}