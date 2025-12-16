/*
Problem Description:
Write a program to create a LinkedList of tasks and iterate using both for-each loop and Iterator.

Input Format:

First line: integer n – number of tasks

Next n lines: task names

Output Format:
Display tasks in both iteration methods.

Constraints:

n > 0

Method Signature:

public static void iterateTasks();


Example:

Input:

3
Task1
Task2
Task3


Output:

Using for-each:
Task1
Task2
Task3

remember the code output should be ececuted once user enter the value ag runtime
*/

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

class SimpleTaskIteration{
    public static void iterateTasks(){
        LinkedList<String> tasks = new LinkedList<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            tasks.add(sc.next());
        }
        System.out.println("Using for-each:");
        for(String task : tasks){
            System.out.println(task);
        }
        System.out.println("Using Iterator:");
        Iterator<String> itr = tasks.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
    public static void main(String[] args){
        iterateTasks();
    }
}

