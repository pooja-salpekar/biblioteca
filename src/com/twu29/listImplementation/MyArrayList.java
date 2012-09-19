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
        if(size==data.length)
            expandTheArray(size);
        data[size]=element;
        size++;
    }

    private void expandTheArray(int sizeForExpansion) {
        T temp[] = data;
        data = (T[]) new Object[ 2*sizeForExpansion ] ;
        for ( int counter = 0; counter < size; counter++ )
            data[counter] = temp[counter] ;
    }

    public T getElementFrom(int index) {
        return data[index];
    }

    public void add(int index, T element) {
        if (index>=data.length)
            expandTheArray(data.length);
        for(int counter = index;counter<size;counter++){
            data[counter+1]=data[counter];
        }
        data[index]=element;
    }

    public T remove(int index) {
        T temp = data[index];
        for(int counter=index;counter<size-1;counter++){
            data[counter]=data[counter+1];
        }
        size--;
        return temp;
    }

    public boolean contains(T element) {
        for(int counter=0;counter<size;counter++){
            if(data[counter].equals(element))
                return true;
        }
        return false;
    }

    public int indexOf(T element) {
        for(int counter=0;counter<size;counter++){
            if(data[counter].equals(element))
                return counter;
        }
        return -1;
    }
}
