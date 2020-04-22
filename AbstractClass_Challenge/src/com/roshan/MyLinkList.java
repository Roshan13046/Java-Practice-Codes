package com.roshan;

public class MyLinkList implements NodeList{
    private ListItem root = null;

    public MyLinkList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if(this.root == null){
            //The list is empty,so this item becomes the head of list
            this.root = newItem ;
            return true;
        }
        ListItem currentItem = this.root;
        while(currentItem != null){
            int comparison = currentItem.compareTo(newItem);
            if(comparison <0){
                //newItem is greater ,move to right if possible
                if(currentItem.next() != null){   //move currentItem to next
                    currentItem = currentItem.next();
                }else{
                    //there is no next,so insert at end of list
                 /*   currentItem.setNext(newItem);
                    newItem.setPrevious(currentItem);

                    or shortCut
                  */
                    currentItem.setNext(newItem).setPrevious(currentItem);
                    return true;
                }
            }else if(comparison > 0){
                //newItem is less than currItem so add to previous
                if(currentItem.previous() != null){
                /*    currentItem.previous().setNext(newItem);
                    newItem.setPrevious(currentItem.previous());
                    newItem.setNext(currentItem);
                    currentItem.setPrevious(newItem);

                 */
                    currentItem.previous().setNext(newItem).setPrevious(currentItem.previous());
                    newItem.setNext(currentItem).setPrevious(newItem);
                }else{
                    //the node with previous is the root
                    newItem.setNext(this.root);
                    this.root.setPrevious(newItem);
                }
                return true;
            }else{
                System.out.println(newItem.getValue() + " is already present,can't add");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if(item != null){
            System.out.println("Deleting item "+item.getValue());
        }
        ListItem temp = this.root;
        while(temp !=null){
            int comparison = temp.compareTo(item);
            if(comparison==0){
                //found the item to delete
                if(temp == this.root){
                    this.root = temp.next();
                }else{
                    temp.previous().setNext(temp.next());
                    if(temp.next() != null){
                        temp.next().setPrevious(temp.previous());
                    }
                }
                return true;
            }else if(comparison < 0){
                temp = temp.next();
            }else{
                //commaprson >0
                //Item to be deleted is not found return false
                return false;
            }
        }
        //We are at the end of list without fiding the item to be deleted
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if(root == null){
            System.out.println("Empty list");
        }else{
            while(root != null){
                System.out.println(root.getValue());
                root = root.next();
            }
        }
    }
}
