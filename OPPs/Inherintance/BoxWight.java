package OPPs.Inherintance;

public class BoxWight extends Box {
    double wight;
    
    BoxWight(){
        this.wight = 2;

    }
    BoxWight(double l,double h,double w,double wight){
        super(l, h, w);
        this.wight = wight;
    }
}
