package com.ttl.Demo2;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
/*
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
*/

@FunctionalInterface
interface Square 
{ 
    int calculate(int x); 
} 
  
class App 
{
final int speedlimit;//final variable  
final ArrayList<String> list =  new ArrayList<String>();




 public App(int limit)
{
	 speedlimit=limit; 
	 System.out.print("speedlimit="+speedlimit);
	 
	 list.add("test");
	 list.add("test2");

	 list.set(1, "jvb");
	// final ArrayList<String> list2 =  new ArrayList<String>();
	// list = list2;
}
    public static void main(String args[]) 
    { 
        int a = 5; 
       App a1 = new App(100);
       App a2 = new App(200);
        // lambda expression to define the calculate method 
        Square s = (int x)->x*x; 
  
        // parameter passed and return type must be 
        // same as defined in the prototype 
        int ans = s.calculate(a); 
        System.out.println(ans); 
        //System.out.print(App::test); 
        
        float f = 1.2f;
        double d  = 1.3;
        long l = 10000000000l;
        System.out.println("long="+l);
        System.out.println("float="+f); 
        System.out.println("double="+d);
        
        final ArrayList<String> list =  new ArrayList<String>();
        list.add("test");
        list.add("test2");
        
        list.set(1, "jvb");
        
         
        
     } 
    
    public int test(int i)
    {
    	System.out.println("i=="+i);
    	return i+1;
    }
} 