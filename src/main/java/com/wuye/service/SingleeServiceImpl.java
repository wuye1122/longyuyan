package com.wuye.service;

import java.util.List;

import com.wuye.dao.SingleeDAO;
import com.wuye.po.Single;

public class SingleeServiceImpl implements SingleeService {

	private SingleeDAO sdao;
	
	
	public SingleeDAO getSdao() {
		return sdao;
	}

	public void setSdao(SingleeDAO sdao) {
		this.sdao = sdao;
	}

	@Override
	public void add(Single ss) {
		// TODO Auto-generated method stub
		sdao.add(ss);
		
	}

	@Override
	public void del(Single ss) {
		// TODO Auto-generated method stub
		sdao.del(ss);
	}

	@Override
	public void update(Single ss) {
		// TODO Auto-generated method stub
		sdao.update(ss);
	}

	@Override
	public List<Single> query() {
		// TODO Auto-generated method stub
		return sdao.query();
	}

	@Override
	public void del(int a) {
		// TODO Auto-generated method stub
		sdao.del(a);
	}

}
