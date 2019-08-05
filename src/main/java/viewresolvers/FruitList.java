package viewresolvers;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "fruitList")
public class FruitList {

	private List<Fruit> fruitList;

	public FruitList() {
		// TODO Auto-generated constructor stub
	}

	public FruitList(List<Fruit> fruitList) {
		super();
		this.fruitList = fruitList;
	}

	public List<Fruit> getFruitList() {
		return fruitList;
	}

	@XmlElement(name = "lists")
	public void setFruitList(List<Fruit> fruitList) {
		this.fruitList = fruitList;
	}

}
