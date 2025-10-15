
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author darhlilove
 */
public class TodoList {
    private ArrayList<String> toDoList;
    
    public TodoList(){
        this.toDoList = new ArrayList<>();
    }
    
    public void add(String task){
        this.toDoList.add(task);
    }
    
    public void print(){
        for (int i = 0; i < toDoList.size(); i++) {
            System.out.println((i + 1) + ": " + toDoList.get(i));
        }
    }
    
    public void remove(int number){
        toDoList.remove(number - 1);
    }
}
