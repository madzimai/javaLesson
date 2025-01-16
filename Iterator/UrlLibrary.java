package Iterator;


import java.util.Iterator;
import java.util.LinkedList;

public class UrlLibrary implements Iterable<String>{
    private LinkedList<String> urls = new LinkedList<>();
    public UrlLibrary() {
        urls.add("https://www.google.com/");
        urls.add("https://www.caveofprogramming.com/");
        urls.add("https://www.facebook/caveofprogramming.com/");
    }

    public Iterator<String> iterator() {
        return urls.iterator();
    }
}
