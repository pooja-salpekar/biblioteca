package com.twu29.listImplementation;

import junit.framework.Assert;
import org.junit.Test;

public class testMyArrayList {
    @Test
    public void testIfSizeOfListIsReturned(){
        MyArrayList<Integer> list = new MyArrayList<Integer>();
        int expectedSize=0;
        Assert.assertEquals(expectedSize,list.showSize());
    }
    @Test
    public void testIfElementGetsAddedToTheList(){
        MyArrayList<String> list = new MyArrayList<String>();
        list.add("element1");
        int expectedSize=1;
        Assert.assertEquals(expectedSize,list.showSize());
    }

    @Test
    public void testIfElementIsReturnedFromGivenIndex(){
      MyArrayList<String> list = new MyArrayList<String>();
        list.add("element1");
        list.add("element2");
        String expectedString="element2";
        Assert.assertEquals(expectedString,list.getElementFrom(1));
    }

    @Test
    public void testIfElementGetsAddedToSpecifiedIndex(){
        MyArrayList<String> list = new MyArrayList<String>();
        list.add("element1");
        list.add("element2");
        list.add(0,"element0");
        String expectedString ="element0";
        Assert.assertEquals(expectedString,list.getElementFrom(0));
    }

    @Test
    public void testIfElementGetsAddedBeyondDefaultSize(){
        MyArrayList<String> list = new MyArrayList<String>();
        list.add("element0");
        list.add("element1");
        list.add("element2");
        list.add("element3");
        list.add("element4");
        list.add("element5");
        String expectedString ="element5";
        Assert.assertEquals(expectedString,list.getElementFrom(5));
    }
    @Test
    public void testIfElementsGetsAddedEvenIfProvidedIndexIsBeyondDefaultSize(){
        MyArrayList<String> list =new MyArrayList<String>();
        list.add("element0");
        list.add("element1");
        list.add(6,"element6");
        String expectedString ="element6";
        Assert.assertEquals(expectedString,list.getElementFrom(6));
    }
    @Test
    public void testIfElementIsDeletedFromGivenIndex(){
        MyArrayList<String> list = new MyArrayList<String>();
        list.add("element0");
        list.add("element1");
        list.add("element2");
        list.add("element3");
        String expectedString = "element2";
        Assert.assertEquals(expectedString,list.remove(2));

    }

    @Test
    public void testIfSizeIsReducedOnDeletion(){
        MyArrayList<String> list = new MyArrayList<String>();
        list.add("element0");
        list.add("element1");
        list.add("element2");
        list.add("element3");
        list.remove(2);
        int expectedSize = 3;
        Assert.assertEquals(expectedSize,list.showSize());

    }

    @Test
    public void testIfListContainsGivenElement(){
        MyArrayList<String>list = new MyArrayList<String>();
        list.add("element0");
        list.add("element1");
        list.add("element2");
        Assert.assertTrue(list.contains("element2"));
    }

    @Test
    public void testIfIndexOfSpecifiedElementIsReturned(){
        MyArrayList<String>list = new MyArrayList<String>();
        list.add("element0");
        list.add("element1");
        list.add("element2");
        int expectedIndex=2;
        Assert.assertEquals(expectedIndex,list.indexOf("element2"));
    }
}

