package java231120;

public class RPGTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Novice nv = new Novice("초보자", 100);
		Wizard wz = new Wizard("마법사", 80, 100);
		Knight Kt = new Knight("전사", 150, 100);

		nv.punch(wz);
		wz.fireball(nv);
		Kt.smite(nv);

	}

}
