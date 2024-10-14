package _23_Extends_playMap;

import java.util.ArrayList;

import _23_Extends_unit.Seok;
import _23_Extends_unit.Starunit;

public class GamePlay {

	public static void main(String[] args) {
		//모든 케릭터 Seok을 담을 list.
		ArrayList<Starunit> seokList = new ArrayList<>();
		//케릭터 Seok 1개 생성.
		Starunit s1 = new Seok(); //s1는 Seok객체의 주소값을 저장하고 있다.
		s1.unitName = "석1";
		s1.hp = 6000;//s1 케릭터의 피는 6000 포인트이다.
		s1.attack = 100;//s1의 공격력은 100이다.
		seokList.add(s1);//s1을 Starunit제국에 seokList군단에 추가한다.
		
		
		
	}

}
