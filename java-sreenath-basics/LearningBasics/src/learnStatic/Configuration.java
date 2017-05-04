package learnStatic;

public class Configuration {
	
	private static Configuration onlyObj;
	
	private Configuration(){}
		
	public static Configuration getObject(){
		if (onlyObj == null){
			onlyObj = new Configuration();}
		return onlyObj;
	}
}
