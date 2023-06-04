package collection.arraylist;

import collection.Member;

public class MemberArrayListTest {
	public static void main(String[] args) {
		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member memberLee = new Member(1001,"이지원");
		Member memberGee = new Member(1002,"지지원");
		Member memberOh = new Member(1003,"오지원");
		
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberGee);
		memberArrayList.addMember(memberOh);
		
		memberArrayList.showAllMember();
		
		memberArrayList.removeMember(memberLee.getMemberId());
		memberArrayList.showAllMember();
	}
	
}
