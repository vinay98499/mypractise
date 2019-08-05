package viewresolvers;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "fruit")
public class Fruit {

	public Fruit() {
		// TODO Auto-generated constructor stub
	}
	int count;
	String name;
	public int getCount() {
		return count;
	}
	
	
	@Override
	public String toString() {
		return "Fruit [count=" + count + ", name=" + name + "]";
	}


	public Fruit(int count, String name) {
		super();
		this.count = count;
		this.name = name;
	}


	@XmlElement(name = "count")
	public void setCount(int count) {
		this.count = count;
	}
	public String getName() {
		return name;
	}
	@XmlElement(name = "name")
	public void setName(String name) {
		this.name = name;
	}
	
}
