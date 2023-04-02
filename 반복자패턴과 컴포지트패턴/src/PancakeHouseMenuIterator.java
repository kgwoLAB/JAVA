import java.util.List;

public class PancakeHouseMenuIterator implements Iterator {
    List<MenuItem> menuItems;
    int position = 0;

    public PancakeHouseMenuIterator(List<MenuItem> menuItems){
        this.menuItems = menuItems;
    }
    
    public MenuItem next(){
        MenuItem menuItem = menuItems.get(position);
        position = position + 1;
        return menuItem;
    }

    public boolean hasNext(){
        if (position >=menuItems.size() || menuItems.get(position) == null){
            return false;
        } else{
            return true;
        }

    }
}
