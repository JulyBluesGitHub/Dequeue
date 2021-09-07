package com.company;

public class Main {

    public static void main(String[] args) {

    }
    class Dequeue {
        int front = -1;
        int rear = -1;
        int rearVal;
        int frontVal;
        int[] myarr;
        public Dequeue(int size){
            myarr = new int[size];
        }
        public void insertLeft(int rearVal) {
            rearVal = this.rearVal;
            myarr[myarr.length-1] = rear;

        }
        public void insertRight(int front) {
            front = this.front;
            myarr[0] = front;
        }

    }
}
