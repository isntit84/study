package Service;

import java.util.ArrayList;

import VO.MemberVO;

public class MemberDAO {

	private ArrayList<MemberVO> list = new ArrayList<MemberVO>();

	public void addMemberVO(MemberVO memberVO) {
		boolean flag = false;
		for (int i = 0; i < list.size(); i++) {
			MemberVO Mem = (MemberVO) list.get(i);
			if (memberVO.equals(Mem.getId()))
				flag = true;
			break;

		}
		if (flag == false)
			list.add(memberVO);
		else
			System.out.println("이미 등록된 아이디 입니다.");
	}

	public void printAll() {
		System.out.println(list);
	}

	public MemberVO findMemberVO(String id) {
		MemberVO pro = null;
		for (int i = 0; i < list.size(); i++) {
			MemberVO pro1 = (MemberVO) list.get(i);
			if (id.equals(pro1.getId())) {
				pro = pro1;
			}
		}
		return pro;

	}

	public void deleteMemberVO(String id) {
		for (int i = 0; i < list.size(); i++) {
			MemberVO pro1 = (MemberVO) list.get(i);
			if (id.equals(pro1.getId())) {
				list.remove(i);
			}
		}
	}

	public boolean updateMemberVO(MemberVO memberVO) {
		boolean flag = false;
		for (int i = 0; i < list.size(); i++) {
			MemberVO Mem = (MemberVO) list.get(i);
			if (Mem.getId().equals(memberVO.getId())) {
				list.set(i, memberVO);
				flag = true;
				break;
			}
		}
		return flag;
	}

}