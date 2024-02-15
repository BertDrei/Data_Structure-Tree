/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package activity_tree;
import javax.swing.*; 
import javax.swing.JTree; 
import javax.swing.tree.DefaultMutableTreeNode; 



public class Activity_Tree extends JFrame{
    JTree tree; 
    public Activity_Tree(){ 
       
    DefaultMutableTreeNode root = new DefaultMutableTreeNode("Henry Allen");    
    DefaultMutableTreeNode son1 = new DefaultMutableTreeNode("Barry Allen"); 
    DefaultMutableTreeNode son2 = new DefaultMutableTreeNode("Jay Allen"); 
    
     DefaultMutableTreeNode grandson = new DefaultMutableTreeNode("Nora Allen"); 
    DefaultMutableTreeNode grandgrandson1 = new DefaultMutableTreeNode("Thea Queen"); 
     DefaultMutableTreeNode grandgrandson2 = new DefaultMutableTreeNode("Ray Allen"); 
     
    DefaultMutableTreeNode grandson2 = new DefaultMutableTreeNode("Cisco Allen"); 

    root.add(son1);
    root.add(son2); 
    son1.add(grandson);
    grandson.add(grandgrandson1);
    grandson.add(grandgrandson2);
    
    tree = new JTree(root); 
    
    this.add(tree); 
    this.setTitle("The Family Tree");
    this.setSize(300, 400);
    this.setResizable(false);
    this.setVisible(true);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Activity_Tree(); 
    }
    
}
