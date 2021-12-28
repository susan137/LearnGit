package testproperties;

import java.io.*;
import java.util.Properties;

public class PropertyFileReader {

	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("//Users//susan//eclipse-workspace//TestMaven//src//main//resources//login.properties");
		Properties pr=new Properties();
		pr.load(fr);
		System.out.println(pr.getProperty("userid"));
		System.out.println(pr.getProperty("password"));
	}

}
//Testing Git 28/12/21