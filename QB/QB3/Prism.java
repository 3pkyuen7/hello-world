
public class Prism extends Triangle{//a
	protected double dHeight;

	public Prism(double dLength,double dWidth,double dHeight){//b
		super(dLength,dWidth);
		this.dHeight = dHeight;
	}
	public void setHeight(double dHeight){	//c
		this.dHeight = dHeight;
	}
	public double getHeight(){	//d
		return dHeight;
	}
	public double calcVolume() {	//e
	 return super.calcArea() * dLength;
	}
}