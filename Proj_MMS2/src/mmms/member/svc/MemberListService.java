package mmms.member.svc;

import java.sql.Connection;
import java.util.ArrayList;

import mmms.member.dao.MemberDAO;
import mmms.member.db.JdbcUtil;
import mmms.member.vo.Member;

public class MemberListService {

	public ArrayList<Member> getMemberList(){
		
		Connection con = JdbcUtil.getConnection();
		MemberDAO memberDAO = new MemberDAO(con);
		ArrayList<Member> memberList = memberDAO.selectMemberList();
		
		JdbcUtil.close(con);
		return memberList;
		
	}
}
