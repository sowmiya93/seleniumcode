package day10;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;


public class Programproperties {
	/* in this property we are use the values and store those in a file foramt after those file saved we going to use those value into the java
	 * like get the value from the file itself*/ 
	
	


		public static void main(String[] args) throws Exception {
			System.out.println(getValue("url"));
			System.out.println(getValue("firstName"));

			System.out.println(getValue("lastName"));
			setValue("lastName","sowmi");
			System.out.println(getValue("url"));
			System.out.println(getValue("firstName"));

			System.out.println(getValue("lastName"));

		}


		public static String getValue(String property) throws Exception//in this method we are get the value from the file using file reader
		{
			File src = new File("./app.properties");
			FileReader x= new FileReader(src);

			Properties prop = new Properties();
			prop.load(x);

			return prop.getProperty(property);


		}

		public static void setValue(String property,String value) throws Exception//in this method we set the values using these filewriter 
		{
			File src = new File("./app.properties");
			FileReader x= new FileReader(src);

			Properties prop = new Properties();
			prop.load(x);
			prop.setProperty(property, value);
			
			
			prop.store(new FileWriter(src),"File Written..!");


		}


	
}
