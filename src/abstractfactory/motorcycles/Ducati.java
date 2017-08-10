package abstractfactory.motorcycles;

public class Ducati extends Motorcycle{

    Ducati() {
        setId(++count);
        brandMotorcycle = BrandMotorcycle.DUCATI;
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
