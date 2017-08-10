package abstractfactory.cars;

public class Bentley extends Car {

    Bentley() {
        setId(++count);
        brandCars = BrandCars.BENTLEY;
    }
    @Override
    int getId() {
        return id;
    }

    @Override
    void setId(int id) {
        this.id = id;
    }
}
