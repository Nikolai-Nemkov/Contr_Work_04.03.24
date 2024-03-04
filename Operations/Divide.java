package Operations;




public class Divide extends Model {

    @Override
    public Double result() /*throws DivisionByZero*/ {
        return x / y;
    }

    @Override
    public void setX(Double value) {
        super.x = value;
    }

    @Override
    public void setY(Double value) {
        super.y = value;
    }

}