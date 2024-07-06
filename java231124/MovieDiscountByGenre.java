package java231124;

public class MovieDiscountByGenre {

    public static void main(String[] args) {

        int sum = 0;

        ActionMovie am = new ActionMovie("범죄도시");
        HorrorMovie hm = new HorrorMovie("여고괴담");
        ComedyMovie cm = new ComedyMovie("극한직업");

        sum += am.discountedPrice();
        sum += hm.discountedPrice();
        sum += cm.discountedPrice();

        System.out.printf("총 예매 금액 : %d 원 ", sum);
    }
}

abstract class Movie { // 추상부모클래스
    String name; // 이름
    int MoviePrice = 10000; // 영화표 가격
    double DiscountPrice = 0.9; // 10퍼센트 할인

    Movie(String Name) { // 영화 이름 생성자
        this.name = name;
    }

    double discountedPrice() { // 가격할인 메서드
        double sum = (MoviePrice * DiscountPrice); // 10퍼센트 할인한 영화표 가격
        return sum; // 할인한 영화표 가격 반환
    }
}

class ActionMovie extends Movie { // 상속받은 클래스
    int PlusDiscount = 1000; // 영화별 추가 할인 가격

    public ActionMovie(String name) { // 영화 이름 생성자
        super(name); // 부모 클래스에서 받아온 생성자 이름
        double price = super.discountedPrice(); // 부모 메서드 호출
    }

    double discountedPrice() { // 자식 메서드 생성(오버라이딩)
        double sum = super.discountedPrice() - PlusDiscount;
        return sum;
    }
}

class HorrorMovie extends Movie {
    int PlusDiscount = 800;

    public HorrorMovie(String name) { // 영화 이름 생성자
        super(name); // 부모 클래스에서 받아온 생성자 이름
        double price = super.discountedPrice(); // 부모 메서드 호출
    }

    double discountedPrice() { // 자식 메서드 생성(오버라이딩)
        double sum = super.discountedPrice() - PlusDiscount;
        return sum;
    }

}

class ComedyMovie extends Movie {
    int PlusDiscount = 1500;

    public ComedyMovie(String name) { // 영화 이름 생성자
        super(name); // 부모 클래스에서 받아온 생성자 이름
        double price = super.discountedPrice(); // 부모 메서드 호출
    }

    double discountedPrice() { // 자식 메서드 생성(오버라이딩)
        double sum = super.discountedPrice() - PlusDiscount;
        return sum;
    }
}

