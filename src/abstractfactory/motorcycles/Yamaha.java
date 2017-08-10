package abstractfactory.motorcycles;

public class Yamaha extends Motorcycle{

    Yamaha() {
        setId(++count);
        brandMotorcycle = BrandMotorcycle.YAMAHA;
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
