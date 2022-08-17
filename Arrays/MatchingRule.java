//Count Items Matching a Rule
/*
 * You are given an array items, where each items[i] = [typei, colori, namei] describes the type, color, and name of the ith item. You are also given a rule represented by two strings, ruleKey and ruleValue.

	The ith item is said to match the rule if one of the following is true:
	
	ruleKey == "type" and ruleValue == typei.
	ruleKey == "color" and ruleValue == colori.
	ruleKey == "name" and ruleValue == namei.
	Return the number of items that match the given rule.
 */



package com.prachi.practice2;
import java.util.ArrayList;
import java.util.List;

public class MatchingRule {

	
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
    	 int index = 0, count = 0; 
         if(ruleKey == "type") index = 0;
         else if(ruleKey == "color") index = 1;
         else if(ruleKey == "name") index = 2;
         System.out.println(index);
         for(int i = 0; i < items.size(); i++){
             if((items.get(i).get(index)).equalsIgnoreCase(ruleValue))
                 count++;
         }
         return count;
    }   
	
	public static void main(String args[]) {
		List<List<String>> items = new ArrayList<>();
		List<String> al1 = new ArrayList<>();
		al1.add("phone");
		al1.add("blue");
		al1.add("pixel");
		items.add(al1);
		
		List<String> al2 = new ArrayList<>();
		al2.add("computer");
		al2.add("silver");
		al2.add("lenovo");
		items.add(al2);
		
		List<String> al3 = new ArrayList<>();
		al3.add("phone");
		al3.add("gold");
		al3.add("iphone");
		items.add(al3);
		String ruleKey = "color", ruleValue = "silver";
		System.out.println(countMatches(items, ruleKey, ruleValue));
	}
}
