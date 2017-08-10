package abstractfactory.motorcycles;

public abstract class Motorcycle {
    int id;
    static int count = 0;
    BrandMotorcycle brandMotorcycle;


    abstract int getId();
    abstract void setId(int id);
}
