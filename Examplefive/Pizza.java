package Examplefive;
import java.util.*;  
class Pizza
{
static ArrayList<String>A=new ArrayList<String>();
static HashMap<String,List<String>>list=new HashMap<String,List<String>>();
static  void value() {
	list.put("Chandigarh", Arrays.asList("24seven", "PizzaLover", "dark bite" ));
	list.put("Dehradun", Arrays.asList( "Pizza Hub", "dominos", "Chicago pizza" ));
	list.put("Rohtak",Arrays.asList("Italiano", "Pizza Hut", "Dominik"));
	list.put("Delhi", Arrays.asList( "US pizza", "crunchy bite", "pizza place" ));
	list.put("Banglore", Arrays.asList( "sams pizza", "La Pinoz", "Bon pizza" ));
}
static List<String> getPizzaShop(String str)
{
    
  if(list.containsKey(str)) {
	  return list.get(str);
  }  
  ArrayList<String>A1=new ArrayList<String>();
  A1.add("Not Present");
  return A1 ;
}

public static String location(String str){

for(Map.Entry<String,List<String>>e: list.entrySet()) {
	List<String>A1=e.getValue();
	if(A1.contains(str)) {
		return e.getKey();
	}
	
	
}
return "Not Present";
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/////////Enter the details///////////
		value();
		System.out.print("Pizza Restaurants in the city are: ");
		List<String>shops=  getPizzaShop("Dehradun");
		System.out.println(shops);
		System.out.print("Address of restaurant is: ");
		String location=location("US pizza");
		System.out.println(location);
		
	}

}