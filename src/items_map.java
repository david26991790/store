import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

public class items_map {
    public static void main(String[] args) {
        String key;
        Object value;

       HashMap<String, Object>map;
        map = new HashMap();

        key = "cola";
        value = new items("可樂","碳酸蛀牙",8,25);
        map.put(key, value);

        key = "dew";
        value = new items("激浪","綠色蛀牙",15,35);
        map.put(key, value);

        key = "Sprite";
        value = new items("雪碧","透明蛀牙",13,29);
        map.put(key, value);

        key = "list";
        value = new ArrayList();
        map.put(key,value);

        key = "map2";
        value = new HashMap();
        map.put(key,value);

        items tm;
        tm = (items) map.get("cola");

        String area;
        area = (String) map.get("Sprite");

        ArrayList<Object>list;
        list = (ArrayList<Object>)map.get("list");

        HashMap<Object,Object> map2;
        map2 = (HashMap<Object, Object>) map.get("map2");

    }


}



