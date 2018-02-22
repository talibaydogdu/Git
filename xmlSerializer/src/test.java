import java.util.List;

import com.thoughtworks.xstream.XStream;


public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*Person joe = new Person();
		PhoneNumber pn=new PhoneNumber();
		joe.setFirstname("asd");
		joe.setLastname("dfds");
		pn.setNumber("2343");
		pn.setCode(12);
		joe.setPhone(pn);
		*/
String xml="<People><Person><phone><code>12</code> <number>2343</number>  </phone>  <firstname>asd</firstname></Person> <Person><phone> <code>12</code><number>2343</number></phone><firstname>asd</firstname><lastname>dsfds12</lastname></Person></People>";
		
		System.out.println(xml);

		
		XStream xstream = new XStream();
		xstream.alias("people", People.class);
		xstream.alias("person", Person.class);
		xstream.addImplicitCollection(People.class, "people");
		People people = (People)xstream.fromXML(xml);
		System.out.println(people.people.get(0).getFirstname());

		//String xml = xstream.toXML(joe);
				
	
		//List<Person> newJoe = (List<Person> )xstream.fromXML(xml);
		//System.out.println(newJoe.toArray()[1].toString());
	}

}
