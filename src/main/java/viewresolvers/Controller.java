package viewresolvers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
public class Controller {

	@RequestMapping("1")
	public String doNothing() {
		// TODO Auto-generated method stub
System.out.println("111111111111111");
return "Welcome";
	}
	
	@RequestMapping("pandu")
	public ModelAndView doNothings() {
		// TODO Auto-generated method stub
System.out.println("fruit");
ModelAndView mv=new ModelAndView();
List<Fruit> lst = new ArrayList<>();
Fruit f=new Fruit(0, "mangao");
mv.addObject("fruit", f);
mv.setViewName("fruit");
return mv;
	}
	
	@RequestMapping("pandulist")
	public ModelAndView doNothingssfd() {
		// TODO Auto-generated method stub
System.out.println("fruit");
ModelAndView mv=new ModelAndView();
List<Fruit> lst = new ArrayList<>();
Fruit f=new Fruit(0, "mangao");
lst.add(f);f.setCount(2);
lst.add(f);
FruitList ff= new FruitList(lst);
mv.addObject("fruitlist", ff);
mv.setViewName("fruit");
return mv;
	}
	
	@RequestMapping("2")
	public String doNothing1() {
		// TODO Auto-generated method stub
System.out.println("2222222222222");
return "Welcome2";
	}
	
	
	
	
	@RequestMapping("3")
	public String doNothing2() {
		// TODO Auto-generated method stub
System.out.println("33333333333");
return "Welcome3";
	}
	
}
