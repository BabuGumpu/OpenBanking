package com.bank.dao.smel;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Meta{

	@JsonProperty("additionalProperties")
	private boolean additionalProperties;

	@JsonProperty("title")
	private String title;

	@JsonProperty("type")
	private String type;

	@JsonProperty("properties")
	private Properties properties;

	@JsonProperty("required")
	private List<String> required;

	public void setAdditionalProperties(boolean additionalProperties){
		this.additionalProperties = additionalProperties;
	}

	public boolean isAdditionalProperties(){
		return additionalProperties;
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

	@Override
 	public String toString(){
		return 
			"Meta{" + 
			"additionalProperties = '" + additionalProperties + '\'' + 
			",title = '" + title + '\'' + 
			",type = '" + type + '\'' + 
			",properties = '" + properties + '\'' + 
			",required = '" + required + '\'' + 
			"}";
		}
}