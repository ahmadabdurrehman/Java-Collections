/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashsetvssortedset;

/**
 *
 * @author Maryam Kamal
 */
public class HashSetvsSortedSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SortedSet<String> obj=new TreeSet<>();//when sorted order is required\
        obj.add("This is the First element of SortedSet");
        obj.add("This is the Second element of SortedSet");
        obj.add("This is the Third element of SortedSet");
        
        //**********HashSet***********\
        HashSet<String> obj2= new HashSet<>();
        
        obj2.add("This is the First element of HashSet");
        obj2.add("This is the Second element of HashSet");
        obj2.add("This is the First element of HashSet");
        
        System.out.println(obj.first());
        System.out.println(obj.last());
        
    	System.out.println();
        
        Iterator<String> i=obj2.iterator();
        
        while(i.hasNext())
        {
            System.out.println(i.next());//it wont print duplicate\
        }
    }
    
}
