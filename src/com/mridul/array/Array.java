package com.mridul.array;

public class Array {
    
    public static void main(String[] args) {
        Student intArray[] = {new Student(10),new Student(20)}; 
        Student cloneArray[] = intArray.clone();
        cloneArray[0].setId(30); 
        for(int i = 0 ; i < 2 ; i++) {
                //System.out.println(cloneArray[i]);
                System.out.println(intArray[i].getId());
        }
    }

}

 class Student {
    int id;
    Student(int id){
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    
}