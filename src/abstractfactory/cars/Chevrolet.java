package abstractfactory.cars;

public class Chevrolet extends Car {

    Chevrolet() {
        setId(++count);
        brandCars = BrandCars.CHEVROLET;
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
