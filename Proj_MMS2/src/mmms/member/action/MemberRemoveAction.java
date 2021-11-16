package mmms.member.action;

import java.util.Scanner;
import mmms.member.svc.MemberRemoveService;
import mmms.member.util.ConsoleUtil;

public class MemberRemoveAction implements Action {

	@Override
	public void execute(Scanner sc) throws Exception {
		ConsoleUtil cu = new ConsoleUtil();
		String name = cu.getName("삭제할", sc);
		MemberRemoveService memberRemoveService = new MemberRemoveService();
		
		boolean isRemoveSuccess = memberRemoveService.removeMember(name);
		if(isRemoveSuccess)
			cu.printRemoveSuccessMessage(name);
		else
			cu.printRemoveFailMessage(name);
	}
}
