package java231120;

public class Novice {

	String name;
	int hp;

	Novice() {
	}

	Novice(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}

	void punch() {
		System.out.printf("[%s]의 펀치로 데미지 10을 주었습니다.", name);
		System.out.println();
	}

	void punch(Novice no) {
		System.out.printf("[%s]의 펀치로 데미지 10을 주었습니다.", name);
		System.out.println();
		System.out.printf("[%s]의 펀치로 [%s]가 데미지 10을 받아 HP:[%d] 되었습니다.", name,
				no.name, no.hp - 10);
		System.out.println();
	}
}