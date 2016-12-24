public class Triangle {
	 protected double dLength;
	 protected double dWidth;
	 public Triangle(double dL, double dW) {
	 dLength = dL;
	 dWidth = dW;
	 }
	 public void setLength(double dL) {
	 dLength = dL;
	 }
	 public double getLength() {
	 return dLength;
	 }
	 public double getWidth() {
	 return dWidth;
	 }
	 public double calcArea() {
	 return dLength * dWidth / 2;
	 }
}