/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listvsset;

/**
 *
 * @author Maryam Kamal
 */
public class ListvsSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<String> obj=new ArrayList<>();//WE dont have to make size fixed\
        obj.add("First element of List");
        obj.add("Second element of List");
        obj.add("Third element of List");
        //**********Set***********\
        Set<String> obj2=new HashSet<>();//WE have to make size fixed unlike List\
        obj2.add("First element of Set");
        obj2.add("Second element of Set");
        obj2.add("Third element of Set");
        
        for (int i = 0; i < obj.size(); i++) 
        {
            System.out.println(obj.get(i));
        }
    	System.out.println();
        //to iterate through Set, we have to make iterator\
        Iterator<String> i=obj2.iterator();
       
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}
