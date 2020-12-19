package ex01;

public class Constructor {
	private int ip;
	private String name;
	private float LT;
	private float TH;
	public Constructor(int ip, String name, float LT, float TH) {
		this.ip=ip;
		this.name=name;
		this.LT=LT;
		this.TH=TH;
	}


	public Constructor() {
		
	}


	public int getIp() {
		return ip;
	}

	public void setIp(int ip) {
		this.ip = ip;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getLT() {
		return LT;
	}

	public void setLT(float LT) {
		LT = LT;
	}

	public float getTH() {
		return TH;
	}

	public void setTH(float TH) {
		TH = TH;
	}

	@Override
	public String toString() {
		
		return ip + " - " + name + " - " + LT + " - " + TH ;
	}

}
