package unal.todosalau.ecotrash;

public class RecyclableItem extends WasteItem{
    private String recyclingCode;

    public RecyclableItem(String name, String category, String recyclingCode) {
        super(name, category);
        this.recyclingCode = recyclingCode;
    }

    public String getRecyclingCode() {
        return recyclingCode;
    }
}
