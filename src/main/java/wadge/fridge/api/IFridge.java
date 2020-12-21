package wadge.fridge.api;

import java.io.IOException;
import java.util.List;

import wadge.fridge.impl.FridgeFood;

public interface IFridge {
    void writeFridge(String fileName) throws IOException;
    void readFridge(String fileName);
    void addToFridge(List<FridgeFood> newFoods);
    List<FridgeFood> stringToFridgeFood(String content);
}
