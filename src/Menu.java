import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.*;

public class Menu{
    private ArrayList<MenuItem> items;

    public Menu(){
        items = new ArrayList<MenuItem>();
    }

    public void addItem(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter item name");
        String name = sc.nextLine();

        System.out.println("Enter item description");
        String desc = sc.nextLine();

        System.out.println("Enter item cost");
        double cost = sc.nextDouble();

        MenuItem item = new MenuItem(name, desc, cost);
        items.add(item);

        System.out.println("Items have been added");

        
    }
    public void deleteItems(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter item name to delete");
        String name = sc.nextLine();

        for(MenuItem item:items){
            if(item.getName().equals(name)){
                items.remove(item);
                System.out.println("Item has been deleted");
                return;
            }
        }
    }
    public void editItems(){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        for (MenuItem item:items){
            if(item.getName().equals(name)){
                System.out.println("Enter new item name");
                String newName = sc.nextLine();
                item.setName(newName);

                System.out.println("Enter new item description");
                String newDesc = sc.nextLine();
                item.setDescription(newDesc);

                System.out.println("Enter new item name");
                double newCost = sc.nextDouble();
                item.setCost(newCost);

                System.out.println("Item edited in Menu");
                return;
            }
        }
        System.out.print("Item not found in menu");
    }
    public void printMenu(){
        System.out.println("Menu:");

        for(MenuItem items:item){
            System.out.println(item.getName() + "-$"+item.getCost());
            
        }
    }
}