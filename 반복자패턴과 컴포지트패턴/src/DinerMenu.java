public class DinerMenu {
    static final int MAX_ITEM = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems; 
    //멜은 다른 방식으로 메뉴를 구현했습니다. 
    //배열을 사용하고 있기에 메뉴의 크기를 정해놓았고, 객체를 캐스팅할 필요없이 바로 꺼내서 쓸 수 있도록 했습니다. 

    public DinerMenu(){
        menuItems = new MenuItem[MAX_ITEM];

        addItem("채식주의자용 BLT", "통밀 위에 콩고기 베이컨", true, 2.99);
        addItem("BLT", "통밀 위에 베이컨", false, 2.99);
        addItem("오늘의 스프y","감자샐러드를 곁들인 오늘의 스프",false,3.29);
        addItem("핫도그", "사워크라우트, 갖은 양념, 양파, 치즈가 곁들여진 핫도그", false, 3.05);

    }

    public void addItem(String name, String description, boolean vegetarian, double price){
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEM){
            System.out.println("죄송합니다, 메뉴가 꽉찼습니다. 더 이상 추가할 수 없습니다.");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1;
        }
    }
    
    /* getmenuitems() 메소드는 더 이상 필요가 없습니다. 내부 구조를 다 드러내는 단점이 있어서 없애는게 낫죠. 
    public MenuItem[] getMenuItems(){
        return menuItems;
    }
    */

    public Iterator createIterator(){
        return new DinerMenuIterator(menuItems);
    }
}
