package ioc;

import java.util.List;
import java.util.Properties;

import com.sun.javafx.collections.MappingChange.Map;

public class Person {

	private String[] str1;
	private List<String> list;
	private Map<String,String> map;
	private Properties properties;
	public void setStr1(String[] str1) {
		this.str1 = str1;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	
	
}
