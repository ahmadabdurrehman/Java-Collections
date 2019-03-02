/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayvslist;

/**
 *
 * @author Maryam Kamal
 */
public class ArrayvsList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<String> obj=new ArrayList<>();//WE dont have to make size fixed\
        obj.add("First element of List");
        obj.add("Second element of List");
        obj.add("Third element of List");
        //**********Array***********\
        String[] obj2=new String[3];//WE have to make size fixed unlike List\
        obj2[0]="First element of Array";
        obj2[1]="Second element of Array";
        obj2[2]="Third element of Array";//we cant add/access next element\
        //app2[3]="This is the Fourth element of Array"; //we cant do that\
        for (int i = 0; i < obj.size(); i++) 
        {
            System.out.println(obj.get(i));
        }
        
    	System.out.println();
        for (int i = 0; i < 3; i++)
        {
            System.out.println(obj2[i]);
        }
    }
}
