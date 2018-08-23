package day28.udp;

public class TestDemo {

	public static void main(String[] args) {
		int n=1,m=1;
		int i=0;
		while (true) {
			m=n;
			for (i = 0; i < 5; i++) {
				if ((m-1)%5==0) {
					m=(m-1)/5*4;
				}else {
					break;
				}
			}		
			if (i==5&&m>0) {
				break;
			}
			n++;
		}
		System.out.println(n);
	}
}
