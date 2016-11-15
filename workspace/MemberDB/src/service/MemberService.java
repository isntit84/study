package service;

import vo.MemberVO;

public class MemberService {
	private Dao dao;

	public MemberService() {
		dao = new MemberDAO();
	}

	public void addMemberVO(MemberVO memberVO) {
		dao.insert(memberVO);
	}

	public void printAll() {
		System.out.println(dao.selectAll());
	}

	public MemberVO findMemberVO(String id) {
		return dao.selectMember(id);

	}

	public void deleteMemberVO(String id) {
		dao.delete(id);
	}

	public void updateMemberVO(MemberVO memberVO) {
		dao.update(memberVO);
	}
}
