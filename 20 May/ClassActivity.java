package com.acc.lkm.JavaDay1;

public class ClassActivity {
	String personalSim;
	String sim1;
	public void company(String personalS) {
		System.out.println("Before being a permanent employee "+personalS);
	}
	public void company(String personalS, String sim1) {
		System.out.println("After being a permanent employee "+personalS+" & "+sim1);
	}
	public ClassActivity() {
		// TODO Auto-generated constructor stub
	}
	public ClassActivity(String pSim, String sim1) {
		this.personalSim = pSim;
		this.sim1 = sim1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassActivity b = new ClassActivity();
		b.personalSim="Airtel";
		ClassActivity a = new ClassActivity();
		a.sim1 = "Jio 5G";
		b.company(b.personalSim);
		a.company(b.personalSim, a.sim1);
	}

}
