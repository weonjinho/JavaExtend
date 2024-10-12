package playMap;

import java.util.ArrayList;

import unit.Seok;
import unit.StarUnit;
import unit.ZZan;

public class GamePlay {

	public static void main(String[] args) {
		ArrayList<StarUnit> seokList = new ArrayList<>();
//		ArrayList<ZZan> zList = new ArrayList<>();
		//여기서 게임을 진행한다.
		//캐릭터 석을 선택함 > 객체를 만든다.
//		Seok s1 = new Seok(); //s1 : Seok 객체의 주소값을 저장하고 있다.
//		자바에서 최상위 클래스는 Object이다, 모든 class는 Object클래스를 상속 받는다. ****
//		StarUnit : super class 이름
//		상속은 super class의 멤버변수 & 메소드를 확장해서 sub class를 정의하는 것입니다. ***
		
		//-- 부모 클래스 : StarUnit
		//			  부모 클래스의 멤버변수 : hp, attack, unitName
		//			  부모 클래스의 메소드 : attack();
		
		//-- 자식 클래스 : 1. Seok 클래스에 있는 메소드 : 재정의된 attack(); 
		//              2. ZZan 클래스에 있는 메소드 : 재정의된 attack(); 
		//-- 부모 클래스가 가지고 있는 것은 자식클래스는 다 가지고 있다.
		
		//-- 실행 클래스, 부모 클래스, 자식 클래스
		
		//케릭터1
		Seok s1 = new Seok();
		s1.unitName = "석진";//부모가 가지고 있는 참조변수에 접근.
		s1.hp = 6000;
		s1.attack = 100;
		seokList.add(s1);
		
		//케릭터2
		Seok s2 = new Seok(); //자식이 가지고 있는 참조변수에 접근.
		s2.unitName = "홍길";
		s2.hp = 5500;
		s2.attack = 80;
		seokList.add(s2);
		//-- 부모 클래스의 타입으로 ArrayList를 만든다.
		//-- s2의 타입은 부모로부터 상속받은 자식타입이므로 부모 타입의 ArrayList에 add()할 수 있다.
		
		StarUnit z1 = new ZZan(); //-- 부모 클래스명 변수명 = new 자식 클래스명();
		//-- z1는 ZZan의 주소값을 가지고 있다, 타입은 StarUnit이다.
		//-- 변수는 자식 클래스의 주소값을 가지고 있고, 변수의 타입은 부모 클래스명과 같아.
		z1.unitName = "짜장"; //super class변수로 sub class객체 참조.
		z1.hp = 7000;
		z1.attack = 120;
		seokList.add(z1); 
		
		for(StarUnit s : seokList) {
			s.attack(); //공격 명령어
		}
		System.out.println(s1.toString());
		System.out.println(s2.toString());
	
	}

}
