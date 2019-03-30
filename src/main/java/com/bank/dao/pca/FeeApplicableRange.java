package com.bank.dao.pca;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class FeeApplicableRange{

	@JsonProperty("description")
	private String description;

	@JsonProperty("additionalProperties")
	private boolean additionalProperties;

	@JsonProperty("type")
	private String type;

	@JsonProperty("title")
	private String title;

	@JsonProperty("properties")
	private Properties properties;

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

	public void setProperties(Properties properties){
		this.properties = properties;
	}

	public Properties getProperties(){
		return properties;
	}

	@Override
 	public String toString(){
		return 
			"FeeApplicableRange{" + 
			"description = '" + description + '\'' + 
			",additionalProperties = '" + additionalProperties + '\'' + 
			",type = '" + type + '\'' + 
			",title = '" + title + '\'' + 
			",properties = '" + properties + '\'' + 
			"}";
		}
}