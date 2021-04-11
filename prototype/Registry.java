package prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {
    private Map<String, Item> items = new HashMap<String, Item>();

    public Registry(){
        loadItems();
    }

    public Item createItem(String type){
        Item item = null;
        try{
            item = (Item)(items.get(type).clone());
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        return item;
    }

    private void loadItems(){
        Movie movie = new Movie();
        movie.setTitle("Movie Title");
        movie.setPrice("20.00");
        movie.setTime("120");
        items.put("Movie",movie);

        Book book = new Book();
        book.setTitle("Book title");
        book.setPrice("10.00");
        book.setPages(20);
        items.put("Book",book);
    }
}
