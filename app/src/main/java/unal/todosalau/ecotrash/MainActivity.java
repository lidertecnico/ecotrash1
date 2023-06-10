package unal.todosalau.ecotrash;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView titleTextView;
    private TextView wasteItemTextView;
    private TextView recyclableItemTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        titleTextView = findViewById(R.id.title_text_view);
        titleTextView.setText("¡EcoTrash!");

        wasteItemTextView = findViewById(R.id.waste_item_text_view);
        recyclableItemTextView = findViewById(R.id.recyclable_item_text_view);

        // Ejemplo de uso de herencia
        WasteItem wasteItem = new WasteItem("Bolsa de plástico", "Residuos generales");
        RecyclableItem recyclableItem = new RecyclableItem("Botella de agua", "Envases", "PET");

        String wasteItemInfo = "Nombre: " + wasteItem.getName() + "\nCategoría: " + wasteItem.getCategory();
        String recyclableItemInfo = "Nombre: " + recyclableItem.getName() + "\nCategoría: " +
                recyclableItem.getCategory() + "\nCódigo de reciclaje: " + recyclableItem.getRecyclingCode();

        wasteItemTextView.setText(wasteItemInfo);
        recyclableItemTextView.setText(recyclableItemInfo);
    }
}