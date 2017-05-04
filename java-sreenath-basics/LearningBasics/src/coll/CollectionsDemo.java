package coll;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionsDemo {
	
	static float value;
	
	public static void main(String args[]){
		
	Collection<Float> percentage = new ArrayList<Float>(); 
	
	percentage.add(40.0f);
	percentage.add(60.0f);
	percentage.add(80.0f);
	System.out.println(percentage);
	System.out.println(percentage.size());
	System.out.println(percentage.contains(40.0f));
	System.out.println(percentage.isEmpty());
	percentage.remove(80f);		
	percentage.add(90f);
	//System.out.println(percentage);
	
	for(Iterator<Float> i = percentage.iterator(); i.hasNext();){
		value = i.next();
		System.out.println(value);
		i.remove();						// bad practice -- never alter the collection in a loop 
	}
	
//	System.out.println(percentage);  
	
	Collection<Float> percentile = new ArrayList<Float>();
	
	percentile.add(10f);
	percentile.add(20f);
	percentile.add(30f);
	percentile.add(40f);
	percentile.add(50f);
	
	System.out.println("==========================");
	
	System.out.println(percentile);
	System.out.println(percentage);
	System.out.println("==========================");
	
//	percentile.addAll(percentage);								BULK Operations
	
//	percentile.removeAll(percentage);
	
//	percentile.retainAll(percentage);
	
//	System.out.println( percentile.containsAll(percentage));
	
//	percentile.clear();

	System.out.println(percentile);
	
	
	
	
	}
}
