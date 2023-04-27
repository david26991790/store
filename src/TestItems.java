import java.util.ArrayList;
public class TestItems {

    public static void main(String[] args) {
        ArrayList<items>list;
        list = new ArrayList<>();
        list.add(new items("蘋果西打","無香料蘋果味",23,35));
        list.add(new items("胡椒博士","櫻桃味",18,42));

        items data;
        data = new items("果汁","不是汽水",30,25);

        int 價格 = data.getItems_price();
        int 數量 = data.getItems_quantity();
        CharSequence 名字 = data.getItems_name();
        CharSequence 商品描述 = data.getDescription();

    }
}
