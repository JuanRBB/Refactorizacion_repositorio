package Modelos;

public class Shape {
    public static final int SQUARE = 1;
    public static final int CIRCLE = 2;
    public static final int RIGHT_TRIANGULE = 3;

    private int shapeType;
    private double size;
    public Shape(int shapeType, double size){
        this.shapeType = shapeType;
        this.size = size;

    }

    public double Area (){
        switch (shapeType){
            case SQUARE: return size*size;
            case CIRCLE: return Math.PI*size*size;
            case RIGHT_TRIANGULE: return size*size;
        }
        return 0;
    }
}
