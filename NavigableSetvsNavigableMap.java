/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package navigablesetvsnavigablemap;

/**
 *
 * @author Maryam Kamal
 */
public class NavigableSetvsNavigableMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NavigableSet<String> obj=new TreeSet<>();//when sorted order is required\
        obj.add("First element of NavigableSet");
        obj.add("Second element of NavigableSet");
        obj.add("Third element of NavigableSet");
        
        obj=obj.descendingSet();//will print in reverse order now\
        //**********NavigableMap***********\
        NavigableMap<String,String> obj2= new TreeMap<String,String>();
        
        String key1="FirstKey";
        String key2="SecondKey";
        String key3="ThirdKey";
        
        obj2.put(key1,"First element of NavigableMap");
        obj2.put(key2,"Second element of NavigableMap");
        obj2.put(key3,"First element of NavigableMap");
       
        System.out.println(obj);
        System.out.println();
        System.out.println(obj2.get(key1));
        System.out.println(obj2.get(key2));
        System.out.println(obj2.get(key3));
    }
}
