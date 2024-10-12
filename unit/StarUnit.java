// super class
package unit;

public abstract class StarUnit { //추상 클래스, 추상클래스는 객체를 만들수 없습니다.
	public int hp = 100;
	public int attack = 10;
	public String unitName = null; //초기값을 넣는 습관이 좋다.
	
	public void attack() {
		System.out.println("공격점수 100점");
	}

	public abstract void prt(); //추상 메소드, 상속받으면 받드시 override해야한다.
	@Override
	public String toString() {
		return "StarUnit [hp=" + hp + ", attack=" + attack + ", unitName=" + unitName + "]";
	}

	
}
