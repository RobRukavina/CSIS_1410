public class Triangle {
    private double side1;
    private double side2;
    private double side3;
    
    /* constructor */
    public Triangle (double side1, double side2, double side3){
        boolean triangle = isTriangle(side1, side2, side3);
        if(triangle){
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;    
        } else {
            this.side1 = 1d;
            this.side2 = 1d;
            this.side3 = 1d;
        }
    }

    /* getters */
    public double getSide1(){
        return this.side1;
    }

    public double getSide2(){
        return this.side2;
    }

    public double getSide3(){
        return this.side3;
    }

    /* methods */
    public boolean isEquilateral(){
        boolean res = false;

        if(this.side1 == this.side2 && this.side2 == this.side3){
            res = true;
        }

        return res;
    }

    public boolean isRight(){
        boolean res = false;
        double s1 = this.side1 * this.side1;
        double s2 = this.side2 * this.side2;
        double s3 = this.side3 * this.side3;
        
        if((s1 + s2 == s3) 
            || (s1 + s3 == s2) 
            || (s2 + s3 == s1)
        ){
            res = true;
        }
        
        return res;
    }

    /* private methods */
    private boolean isTriangle(double side1, double side2, double side3){
        boolean res = false;
        
        if(!Double.isNaN(side1) && !Double.isNaN(side2) && !Double.isNaN(side3) 
            && (side1 > 0.00 && side2 > 0.00 && side3 > 0.00) 
            && (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1)
        ){
            res = true;
        }

        return res;
    }
}
