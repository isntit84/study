package step4;

import step3.MemberVO;

public class TestCommment {

	public static void main(String[] args) {
		MemberVO vo=new MemberVO("jsp","bbb");
		vo.setJob("���α׷���");
		
		System.out.println(vo.getId());
		System.out.println(vo.getPassword());
		System.out.println(vo.getJob());

	}

}
