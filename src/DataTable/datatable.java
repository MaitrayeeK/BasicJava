/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataTable;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author maitr
 */

class tableException extends Exception {

    public tableException(String str) {
        super(str);
    }
}

public class datatable implements Featurable {
    
    @Override
    public void foreground() {
        
    }
    @Override
    public void background() {
        
    }
    @Override
    public void font() {
        
    }
    
    public static void main(String[] args) throws tableException {
        // TODO code application logic here
        
         int row, cell;
        int column;
        int font;
        int cells[] = null;
        String color;
        String c;
        int ch;
        do {
            System.out.println("1. Add A Table ");
            System.out.println("2. Get Table Details ");
            System.out.println("3. Exit");
            Scanner sc = new Scanner(System.in);
            ch = sc.nextInt();
            Hashtable<Integer, Integer> ht1 = new Hashtable<>();
            Hashtable<Integer, String> ht2 = new Hashtable<>();
            switch (ch) {
                case 1:

                    System.out.println("Enter The Number of rows :- ");
                    row = sc.nextInt();

                    System.out.println("Enter the Number of coumns :- ");
                    column = sc.nextInt();
                    ht1.put(row, column);

                    if (row > 200 && column > 200) {
                        throw new tableException("Row and column cannot be more than 200...");
                    }
                    System.out.println("Enter Values in Cells : ");
                    cell = row * column;

                    cells = new int[cell];

                    for (int i = 0; i < cell; i++) {
                        System.out.println("Enter value of  " + i);
                        cells[i] = sc.nextInt();
                    }

                    System.out.println("Set Color of Table");
                    color = sc.next();

                    System.out.println("Enter Font Size :");
                    int size;
                    size = sc.nextInt();
                    ht2.put(size, color);
                    break;
                case 2:
                    for (int i = 0; i < cells.length; i++) {
                        System.out.println("Values in Cells  " + i + " : " + cells[i]);
                    }
                     System.out.println("number of rows and column");

                    for (Map.Entry<Integer, Integer> e : ht1.entrySet()) {
                        System.out.println(e.getKey() + " "
                                + e.getValue());
                    }
                    for (Map.Entry<Integer, String> e : ht2.entrySet()) {
                        System.out.println(e.getKey() + " "
                                + e.getValue());
                    }
                    
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Invalid case!");
                    break;
            }
        } while (ch != 3);

    }
}
