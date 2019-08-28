package com.test.logical;
import java.util.*;
public class Hash {
public static void main(String args[]){
	HashMap map=new HashMap();
	System.out.println(map.size());
	map.put("20", new Key("vishal"));
	map.get(new Key("vishal"));
	System.out.println(map.get(new Key("vishal")));
}
}

class Key{
	String key;
	Key(String key){
		this.key=key;
		}
	public int hashcod(){
		return (int)key.charAt(0);
	}
	public boolean equlas(Object obj){
		
		if(obj instanceof Key){
			Key obj1=(Key)obj;
			return this.key.equals(obj1);
		}
		return false;
		
		
	}
}