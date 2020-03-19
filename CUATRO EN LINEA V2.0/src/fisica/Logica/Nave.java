package fisica.Logica;

public class Nave {
	int y=80;
	private int x;
	
	private int dx=0;
	private int dy;
	
	private int vlancha;
	private int vrio;
	
	private int teta=2;//???
/*	
	public static void main(String[] args) {
		Nave pruf = new Nave();
	}
*/	
	public Nave() {
		x=(int) (Math.random()*950+1);//donde inicia 
	}
	public void mover(int vlancha,int vrio) { //cuanto avanza
		dy=(int) (Math.abs(vlancha*Math.cos(teta)));
		if((vrio>0 && vlancha*Math.sin(teta)<0) || (vrio<0 && vlancha*Math.sin(teta)>0) ) {
			dx=(int) (Math.abs(vlancha*Math.sin(teta))-Math.abs(vrio));
		}
		else
			dx=(int) (Math.abs(vlancha*Math.sin(teta))+Math.abs(vrio));
		x+=dx;
		y+= dy;
	}
	public int tenerx() {
		return x;
	}
	public int tenery() {
		return y;
	}
}
