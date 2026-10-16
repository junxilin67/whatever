public class BicycleInfoObjects{
	private int sPEEd;
	private int sIZe;
	private String cOLOr;
  public CreateBicycle(int speed, int size, String color){
    sPEEd = speed;
	sIZe = size;
	cOLOr = color;
  }
  public String getFeatures(){
	return "speed: " + sPEEd +
	", size: " + sIZe + 
	", color: " + cOLOr;
  }
  public void repaint(String color){
	  cOLOr = color;
  }
  public static void main(String[] args){
	CreateBicycle a = new CreateBicycle(5,2,"red");
	CreateBicycle b = new CreateBicycle(7,2,"blue");
	CreateBicycle c = new CreateBicycle(4,4,"green");
	System.out.println(a.getFeatures());
	System.out.println(b.getFeatures());
	System.out.println(c.getFeatures());
	b.repaint("cyan");
	System.out.println(b.getFeatures());
  }
}
