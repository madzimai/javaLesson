package Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.TreeMap;
import java.util.List;
import java.util.Set;
import java.util.Map;


public class App {
    public static void main(String[] args) {
        /*Concider
        *1. what you need collections to do
        * 2. are you using fastest collection for your purposes
        * (Think about insertion/deletion retrival andtransvesal
        */

        //////////////////// LIST ///////////////////////
        //Store lists of objects
        //Duplication are allowed
        //Objects remain in order
        //Elemements are indexed via an integer
        // cf.shopping list
        // Checking for particular item in list is low
        // Looking for item particular item up by index is fast
        //Iterarating through lists is relatively fast
        // Note : you can sort lists if you want to.

        // If you only add or remove items at end of list use Array
        List<String> list1 = new ArrayList<>();
        //Removing or adding items elsewhere in the list?
        List<String> list2 = new ArrayList<>();

        //////////////// SETS ////////////////

        //Only store unique values
        // Great for removing duplicates
        //Not indexed unlike lists
        //Very fast check if particular object exists
        //If you want to use your own objects, you must implement h
        //Oder is unimportant and OK IF  it changes?
        //HashSet is nnot ordered
        Set<String> set1 = new HashSet<>();

        //Sorted in natural order? Use TreeSet -must implement Com
        //(1,2,3 ......, a,b,c ....... etc)
        Set<String> set2 = new TreeSet<>();
        //Element remain in order they were added
        Set<String> set3 = new LinkedHashSet<>();

        ///////////////////MAPS//////////////////

        //Key value pairs.
        //Like lookup tables
        // Retrieving a value by key is fast
        //Iteraring over map values is very slow
        // Maps not really optimised for iteration
        //If you want to use objects as keys , you must imp

        //Keys not in any particular order, and order liable to cha
        Map<String, String> map1 = new HashMap<>();
        //Keys sorted in natural order - must implement comparable
        Map<String, String> map2 = new TreeMap<>();

        //Keys remain in order added
        Map<String, String> map3 = new LinkedHashMap<>();
        //There are also th Sorted snd SortedMap interface
    }
}
