package com.twu29.listImplementation;

public class MyArrayList<T> {
    private static final int INITIAL_SIZE=5;
    private int size=0;
    private T data[];

    public MyArrayList(){
        data= (T[]) new Object[INITIAL_SIZE];
    }

    public int showSize() {
        return size;
    }

    public void add(T element) {
        if(size==INITIAL_SIZE)
            expandTheArray(size);
        data[size]=element;
        size++;
    }

    private void expandTheArray(int sizeForExpansion) {
        T temp[] = data;
        data = (T[]) new Object[ 2*sizeForExpansion ] ;
        for ( int i = 0; i < size; i++ )
            data[i] = temp[i] ;
    }

    public T getElementFrom(int index) {
        return data[index];
    }

    public void add(int index, T element) {
        if (index>=INITIAL_SIZE)
            expandTheArray(INITIAL_SIZE);
        for(int counter = index;counter<size;counter++){
            data[counter+1]=data[counter];
        }
        data[index]=element;
    }
}
