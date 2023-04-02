public class DinerMenuIterator implements Iterator {
    
    MenuItem[] items;
    int position = 0; // 반복 작업이 처리되고 있는 위치를 저장합니다.

    public DinerMenuIterator(MenuItem[] items){
        this.items = items;
    }

    public MenuItem next(){
        MenuItem menuItem = items[position];
        position = position + 1;
        return menuItem;
    }

    public boolean hasNext(){
        if (position >=items.length || items[position] == null){
            return false;
        } else{
            return true;
        }

    }


}
