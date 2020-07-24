package com.tdd_junit.tddjunittask;

public class RemoveAchar {

	public Object removeacharmeth(String string) {
		// TODO Auto-generated method stub
		String answer="";
		int stringLength=string.length();
		if(stringLength==1 && !(string.equals("A")))
				answer=string;
		 if(stringLength>=2)
		{
			if(string.charAt(0)!='A')
				answer=answer+string.charAt(0);
			if(string.charAt(1)!='A')
				answer=answer+string.charAt(1);
			if(stringLength>2)
				answer=answer+string.substring(2,stringLength);
		}
		return answer;
	}

}
