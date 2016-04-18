package com.wuye.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.wuye.dao.SingleeDAO;
import com.wuye.po.Single;
import com.wuye.service.SingleeService;


public class SingleAction extends ActionSupport {
   
  /* 调 bug使用的
   * private SingleeDAO sdao;
	
	
	public SingleeDAO getSdao() {
		return sdao;
	}

	public void setSdao(SingleeDAO sdao) {
		this.sdao = sdao;
	}*/
	
	
	
	
	
	private SingleeService service;
	private List<Single> list;
	
	
	public List<Single> getList() {
		return list;
	}


	public void setList(List<Single> list) {
		this.list = list;
	}


	public SingleeService getService() {
		return service;
	}


	public void setService(SingleeService service) {
		this.service = service;
	}

  private Single sin;
  
  
	

	public Single getSin() {
	return sin;
}


public void setSin(Single sin) {
	this.sin = sin;
}


	public String  main() throws Exception{
	 System.out.println("到这了么？");
	
	//  List<Single> lis=this.sdao.query();
	 this.list=this.service.query();
	  for(Single s:list){
			 System.out.println(s.getId()+"-"+s.getName()+" "+s.getAddress()+" "+s.getEmail());
			 
		 }
		
		return "main";
		
		
	}
 
	//跳转到增加数据页面
	 public String add1(){
		 
		 return "add1";
	 }
	 
	 
	 //点击数据
	 public String add() throws Exception{
		 
		 service.add(sin);
		
			return main();
		
	 }
	 
	 
	 //跳转到更新页面
	


	public String update1(){
		
		 return "update1";
	 }
	 
	public String update() throws Exception{
		service.update(sin);
		return main();
	}
	 
	private String id;
	
	 //删除数据
	 
	 public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String del() throws Exception{
		 System.out.println("删除");
		 System.out.println(this.id);
		 //         Integer.parseInt(this.id)  
		service.del(Integer.parseInt(this.id));
		return main();
		
		 
	 }
	 
}
