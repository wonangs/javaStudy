package java231120;

public class Knight extends Novice {

	int stamina;

	Knight(String name, int hp, int stamina) {
		super(name, hp);
		this.stamina = stamina;
	}

	void smite() {
		System.out.printf("[%s]의 강타. 데미지 15를 주었습니다.", name);
		System.out.println();
	}

	void smite(Novice no) {

		System.out.printf("[%s]의 강타로 데미지 15를 주었습니다.", name);
		System.out.println();
		System.out.printf(
				"[%s]의 강타로 [%s]에게 데미지 15을 주어 [%s]의 HP가 [%d] 되었습니다. 전사의 남은 Stamina는 [%d]입니다.",
				name, no.name, no.name, no.hp - 15, stamina - 10);
		System.out.println();

	}

}
