class Mother{
	int x = 10;
}

class Son extends Mother{
	int x = 20;
}

class Main {
  public static void main(String[] args) {
    	//형 변환과 선언
		Mother A_1 = (Mother) new Mother();  // 부모 참조변수  = 부모 인스턴스 생성, 캐스팅 필요없지만 실행 결과 어느 방향으로 캐스팅이 되든 캐스팅 가능, 인스턴스생성 가능
		//Mother A_2 = (Son) new Mother();  // 부모 참조변수  = 부모 인스턴스 생성, 캐스팅 필요없지만 실행 결과 어느 방향으로 캐스팅이 되든 캐스팅 가능, 실행 불가, 인스턴스생성 불능
		
		Mother B_1 = (Mother) new Son();  // 부모 참조변수 = 자손 인스턴스 생성, 참조변수 타입과 인스턴스 타입 맞춰주는 캐스팅 진행, 방향 상관없이 실행 가능, 인스턴스생성 가능
		Mother B_2 = (Son) new Son();  // 자손 참조변수 = 자손 인스턴스 생성, 캐스팅도 가능,  참조변수 타입과 인스턴스 타입 맞춰주는 캐스팅 진행, 방향 상관없이 실행 가능, 인스턴스생성 가능
		
//		Son C_1 = (Mother) new Mother();  // 자손 참조변수 = 부모 인스턴스 생성, 방향이 맞지 않아 캐스팅 실패, 인스턴스생성 불능
//		Son C_2 = (Son) new Mother();  // 자손 참조변수 = 부모 인스턴스 생성, 방향이 맞아 캐스팅 가능, 인스턴스생성 불능
		
		//Son D_1 = (Mother) new Son();  // 자손 참조변수 = 자본 인스턴스 생성, 캐스팅 필요없지만 실행 결과 부모타입의 참조변수로 캐스팅 실행시 실패, 인스턴스생성 불능
		Son D_2 = (Son) new Son();  // 자손 참조변수 = 자본 인스턴스 생성, 참조 변수 타입과 인스턴스 타입 둘 다 맞는 방향으로 캐스팅 실행시 성공, 인스턴스생성 가능
		
		// 형변환과 선언을 통해 알 수 있는 점
		// 참조변수 타입과 인스턴스 생성타입이 같은 경우 캐스팅은 필요없지만, 캐스팅을 하려면 두 타입과 같은 타입으로만 캐스팅 가능. (1번 선언, 8번 선언)
		// 참조변수 타입과 인스턴스 생성타입이 같은 경우 캐스팅이 필요없지만, 캐스팅을 할 때 두 타입과 다른 타입으로 캐스팅할 경우 컴파일은 가능하나 실행불가 (2번 선언)하거나 컴파일부터 실패한다.(7번 선언)
		// 부모 참조 변수의 경우 부모 인스턴스든 자손 인스턴스든 둘 다 실행이 가능하다. 캐스팅을 할 필요도 없지만, 캐스팅을 할 때 방향성 상관없이 컴파일 실행 모두 가능하다. (3번, 4번 선언)
		// 자손 참조 변수는 무슨 수를 써도 부모 인스턴스 실행이 불가능하다.(5번 선언) 캐스팅으로 타입을 맞춰줘도 컴파일은 가능하나 실행이 불가능하다.(6번 선언)
		// 결론은 참조변수를 선언할 때 정상적으로 인스턴스 생성되는 경우는 캐스팅이 전부 생략 가능하다.
		// 정상적으로 인스턴스 생성이 되지 않는 경우(자손 참조변수+부모 인스턴스 생성)은 캐스팅을 아무리 해봐야 인스턴스 생성이 안된다.
		// 결론은 참조 변수 선언시 캐스팅 같은건 신경 써줄 필요도 없다.
		
		
		// 형 변환 경우의 수 (2*2*2 = 8가지, 참조 변수 타입 2가지, 인스턴스 타입 2가지, 변환 방향 2가지)
		
		// 1번 경우의 수 (부모타입 A1 → 부모타입 B1, 부모인스턴스일때)
		Mother A1 = new Mother();  // 부모타입 참조변수 A1 = 부모 인스턴스 생성
		Mother B1 = null;  // 부모타입 참조변수 B1
		B1 = A1;  // B1 = A1, 컴파일 가능, 실행 가능
		
		// 2번 경우의 수 (부모타입 A2 → 자손타입 B2, 부모인스턴스일때)
		Mother A2 = new Mother();  // 부모타입 참조변수 A2 = 부모 인스턴스 생성
		Son B2 = null;  // 자손타입 참조변수 B2
		//B2 = (Son) A2;  // B2 = A1, 캐스팅 필수(다운캐스팅), 컴파일 가능, 실행 불가
		
		// 3번 경우의 수 (부모타입 C1 → 부모타입 D1, 자손인스턴스일때)
		Mother C1 = new Son();  // 부모타입 참조변수 C1 = 자손 인스턴스 생성
		Mother D1 = null;  // 부모타입 참조변수 D1
		D1 = C1;  // D1 = C1, 컴파일 가능, 실행 가능
		
		// 4번 경우의 수 (부모타입 C2 → 자손타입 D2, 자손인스턴스일때)
		Mother C2 = new Son();  // 부모타입 참조변수 C2 = 자손 인스턴스 생성
		Son D2 = null;  // 자손타입 참조변수 D2
		D2 = (Son) C2;  // D2 = C2, 캐스팅 필수(다운캐스팅), 컴파일 가능, 실행 가능
		
		// 5번 경우의 수 (자손타입 E1 → 부모타입 F1, 부모인스턴스일때)
		//Son E1 = (Son) new Mother();  // 자손타입 참조변수 E1 = 부모 인스턴스 생성
		//Mother F1 = null;  // 부모타입 참조변수 F1
		//F1 = (Mother) E1;  // F1 = E1, 캐스팅 필수, 컴파일 불가, 실행  불가
		
		// 6번 경우의 수 (자손타입 E2 → 자손타입 F2, 부모인스턴스일때)
		//Son E2 = (Son) new Mother();  // 자손타입 참조변수 E2 = 부모 인스턴스 생성
		//Son F2 = null;  // 자손타입 참조변수 F2
		//F2 = E2;  // F2 = E2, 캐스팅 필수, 컴파일 불가, 실행 불가
		
		// 7번 경우의 수 (자손타입 G1 → 부모타입 H1, 자손인스턴스일때)
		Son G1 = new Son();  // 자손타입 참조변수 G1 = 자손 인스턴스 생성
		Mother H1 = null;  // 부모타입 참조변수 H1
		H1 = (Mother) G1;  // H1 = G1, 캐스팅 생략 가능(업캐스팅), 컴파일 가능, 실행 가능
		
		// 8번 경우의 수 (자손타입 G2 → 자손타입 H2, 자손인스턴스일때)
		Son G2 = new Son();  // 자손타입 참조변수 G2 = 자손 인스턴스 생성
		Son H2 = null;  // 자손타입 참조변수 H2
		H2 = G2;  // H2 = G2, 컴파일 가능, 실행 가능
		
		// 형변환 경우의 수를 통해 알수 있는 점
		// '자손타입 참조변수 = 부모인스턴스 생성'은 어느 수를 써도 컴파일까지만 성공하고 실행은 불가능 (캐스팅을 해도 불가능). 2번,5번,6번 모두 같은 케이스
		// 실행 가능 업캐스팅(자손타입 참조변수 → 부모타입 참조변수)의 경우 괄호 '()'안에 son을 쓰나 mother를 쓰나 실행이 가능하다. 업캐스팅의 경우 방향성이 중요하진 않은 것 같다. 어차피 생략이니까. 7번 케이스.
		// 실행 가능 다운 캐스팅은 꼭 바꾸려는 참조 변수 타입을 괄호 '()'안에 잘 써넣어서 캐스팅을 진행해야 성공한다. 4번 케이스
		// 원래 참조변수와 바뀌는 참조 변수 타입이 같은 경우 캐스팅을 해줄 필요가 없다. 어차피 해줘도 5,6같은 케이스만 아니면 실행이 가능하다.(1번, 3번, 8번)
		// 결론은 '자손 타입 참조변수 = 부모인스턴스 생성'은 죽어도 안된다.
		// 업캐스팅은 신경 쓸 것 없고(방향을 뭘로 넣어주든 성공한다...), 다운 캐스팅할 때만 잘 써주자.
		// 형변환 과정은 인스턴스의 메모리나 인스턴스 변화랑은 상관없다...그냥 생성된 인스턴스의 주소값을 참조변수에 전달하려는데 타입이 맞지 않아서 참조 변수의 타입을 바꿔주는 것.
		// 그리고 인스턴스는 주소값만 전달되기 때문에 참조 변수 타입에 따라 해당 인스턴스를 통해 사용할 수 있는 멤버의 개수가 달라질 뿐...기존 해당 인스턴스를 바라보던 다른 참조변수에 문제를 일으키거나 그런건 아니다.
		// 실제로 4번과 7번의 캐스팅 된 후에도 두 참조 변수가 가리키는 메모리상의 주소값은 동일한 것을 알 수 있다.
  }
}