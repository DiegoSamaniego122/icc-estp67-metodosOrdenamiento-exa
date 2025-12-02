import models.CarModel;
import models.CarYear;

public class Brand {

    private String name;
    private CarModel[] models;

    public Brand(String name, CarModel[] models) {
        this.name = name;
        this.models = models;
    }

    public String getName() {
        return name;
    }

    public CarModel[] getModels() {
        return models;
    }


    public int getTotalValidYears() {
        int total = 0;

        if (models == null) return 0;

        for (CarModel model : models) {
            if (model.getYears() == null) continue;

            for (CarYear year : model.getYears()) {
                if (year.isValid()) {
                    total++;
                }
            }
        }

        return total;
    }
}