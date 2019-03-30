package com.bank.dao.pca;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Items{

	@JsonProperty("description")
	private String description;

	@JsonProperty("type")
	private String type;

	@JsonProperty("properties")
	private Properties properties;

	@JsonProperty("required")
	private List<String> required;

	@JsonProperty("minLength")
	private int minLength;

	@JsonProperty("maxLength")
	private int maxLength;

	@JsonProperty("enum")
	private List<String> jsonMemberEnum;

	@JsonProperty("pattern")
	private String pattern;

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

	public void setProperties(Properties properties){
		this.properties = properties;
	}

	public Properties getProperties(){
		return properties;
	}

	public void setRequired(List<String> required){
		this.required = required;
	}

	public List<String> getRequired(){
		return required;
	}

	public void setMinLength(int minLength){
		this.minLength = minLength;
	}

	public int getMinLength(){
		return minLength;
	}

	public void setMaxLength(int maxLength){
		this.maxLength = maxLength;
	}

	public int getMaxLength(){
		return maxLength;
	}

	public void setJsonMemberEnum(List<String> jsonMemberEnum){
		this.jsonMemberEnum = jsonMemberEnum;
	}

	public List<String> getJsonMemberEnum(){
		return jsonMemberEnum;
	}

	public void setPattern(String pattern){
		this.pattern = pattern;
	}

	public String getPattern(){
		return pattern;
	}

	@Override
 	public String toString(){
		return 
			"Items{" + 
			"description = '" + description + '\'' + 
			",type = '" + type + '\'' + 
			",properties = '" + properties + '\'' + 
			",required = '" + required + '\'' + 
			",minLength = '" + minLength + '\'' + 
			",maxLength = '" + maxLength + '\'' + 
			",enum = '" + jsonMemberEnum + '\'' + 
			",pattern = '" + pattern + '\'' + 
			"}";
		}
}