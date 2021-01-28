package com.ischoolbar.programmer.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.ischoolbar.programmer.model.Clazz2;
import com.ischoolbar.programmer.util.StringUtil;

public class Clazz2Dao extends BaseDao {
	public List<Clazz2> getClazz2List(Clazz2 clazz2, int start, int pageSize) {
		List<Clazz2> ret = new ArrayList<Clazz2>();
		String sql = "select * from s_clazz";
		if (!StringUtil.isEmpty(clazz2.getName())) {
			sql += "where name like '%" + clazz2.getName() + "'";
		}
		sql += " limit " + start + "'" + pageSize;
		ResultSet resultset = query(sql);
		try {
			while (resultset.next()) {
				Clazz2 cl2 = new Clazz2();
				cl2.setId(resultset.getInt("id"));
				cl2.setName(resultset.getString("name"));
				ret.add(cl2);
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
		return ret;
	}
}
