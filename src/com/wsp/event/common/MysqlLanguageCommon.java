package com.wsp.event.common;
/**
 * mysql”Ôæ‰
 * @author WSP
 */
public class MysqlLanguageCommon {
	//–¬”√ªß’À∫≈
	private final String selectMax = "select max(id) from load_user ;";
	private final String insert = "insert into load_user (name,ciper,last_try_time, question, answer) values (?,?,?,?,?);";
	private final String insertMatch = "insert into matches (match_tream_one,match_tream_two,where_match,money"
			+ ",match_time,match_all_trick,match_has_trick)"
			+ "values (?,?,?,?,?,?,?) ;";
	public String getUpdate(String tableName, String willChange) {
		return "update "+tableName+" set"+willChange+" =? where id = ? ;";
	}
	
	public String isDelect(String tableName,String idName) {
		return "delect from "+tableName+" where "+idName+" =(?) ;";
	}
	
	public String getSelect(String tableName, String idName) {
		return "select * from "+tableName+" where "+idName+" = (?) ;";
	}
	
	public String getSelect(String tableName, String nameOne, String nameTwo) {
		return "select * from "+tableName+" where "+nameOne+" like (?) or "+nameTwo+" like (?) ;";
	}
	
	public String getInsert() {
		return insert;
	}
	
	public String getSelectMax() {
		return selectMax;
	}

	public String getInsertMatch() {
		return insertMatch;
	}
}

