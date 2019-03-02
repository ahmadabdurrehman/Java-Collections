/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treesetvshashset;

/**
 *
 * @author Maryam Kamal
 */
public class TreeSetvsHashSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TreeSet<String> obj=new TreeSet<>();//it's a child class of SortSet and Navigable set\
        //works in the same manner\
        obj.add("First element of TreeSet");
        obj.add("Second element of TreeSet");
        obj.add("Third element of TreeSet");
        //**********HashSet***********\
        HashSet<String> app2= new HashSet<>();
        
        obj2.add("First element of HashSet");
        obj2.add("Second element of HashSet");
        obj2.add("Third element of HashSet");
        
        System.out.println(obj.first());
        System.out.println(obj.last());
        System.out.println();
        
        Iterator<String> i=obj2.iterator();
        
        while (i.hasNext()) 
        {
            System.out.println(i.next());//it wont print duplicate\
        }
    }
}
