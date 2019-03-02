/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistvsvector;

/**
 *
 * @author Maryam Kamal
 */
public class ArrayListvsVector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        ArrayList<String> obj=new ArrayList<>();
	obj.add("This is the First element of ArrayList");
        obj.add("This is the Second element of ArrayList");
        obj.add("This is the Third element of ArrayList");
        
//**********Vector***********\
        Vector<String> obj2= new Vector<String>();
        obj2.add("This is the First element of Vector");
        obj2.add("This is the Second element of Vector");
        obj2.add("This is the Third element of Vector");
        
        for (int i = 0; i < obj.size(); i++)
        {
            System.out.println(obj.get(i));
        }
    	System.out.println();
        for (int i = 0; i < obj2.size(); i++) 
        {
            System.out.println(obj2.get(i));
        }
    }
}