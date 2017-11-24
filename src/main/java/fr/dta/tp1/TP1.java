package fr.dta.tp1;

public class TP1 {

	public static void main(String[] args) {
		MyIpService mis=new MyIpService(new HttpDataService());
		System.out.println(mis.getMyIp());
	}

}
