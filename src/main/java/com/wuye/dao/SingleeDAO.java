package com.wuye.dao;

import java.util.List;



import com.wuye.po.Single;

public interface SingleeDAO {
	public void add(Single ss);

	public void del(Single ss);

	public void update(Single ss);

	public List<Single> query();
	
	public void del(int a);
}
