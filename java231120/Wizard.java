package java231120;

public class Wizard extends Novice {

	int mp;

	Wizard(String name, int hp, int mp) {
		super(name, hp);
		// super.name = name;
		// super.hp = hp;
		this.mp = mp;
	}

	void fireball() {
		System.out.printf("[위자드]의 파이어볼 데미지 20을 주었습니다.");
		System.out.println();
	}

	void fireball(Novice no) {

		System.out.printf("[%s]의 파이어볼로 데미지 20을 주었습니다.", name);
		System.out.println();
		System.out.printf(
				"[%s]의 파이어볼로 [%s]에게 데미지 20을 주어 [%s]의 HP가 [%d] 되었습니다. 마법사의 남은 MP는 [%d]입니다.",
				name, no.name, no.name, no.hp - 20, mp - 10);
		System.out.println();

	}

}
