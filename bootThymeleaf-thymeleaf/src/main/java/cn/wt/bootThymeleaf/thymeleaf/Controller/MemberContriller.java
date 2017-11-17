package cn.wt.bootThymeleaf.thymeleaf.Controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.wt.bootThymeleaf.thymeleaf.vo.Member;

@Controller
public class MemberContriller {
	@RequestMapping("member_show")
	public String show(Model model) {
	  Member mem = new Member();
	  mem.setMid("mldnjava");
	  mem.setName("海陆");
	  mem.setAge(15);
	  mem.setDeptno(10L);
	  mem.setSalary(16.58);
	  mem.setBirthday(new Date());
	  model.addAttribute("member", mem);
	  return "back/admin/member/member_show";
	}
	@RequestMapping("member_shows")
	public String shows(Model model) {
	  Member mem = new Member();
	  Map<Long, String> deptMap = new HashMap<Long,String>();
	  mem.setMid("mldnjava");
	  mem.setName("海陆");
	  mem.setAge(15);
	  mem.setDeptno(10L);
	  mem.setSalary(16.58);
	  mem.setBirthday(new Date());
	  deptMap.put(10L, "财务部");
	  deptMap.put(10L, "销售部");
	  model.addAttribute("member", mem);
	  model.addAttribute("allDepts", deptMap);
	  return "back/admin/member/member_shows";
	}
	
	@RequestMapping("/member_list")
	public String list(Model model) {
		List<Member> allMember = new  ArrayList<Member>();
		for(int a=0;a<20;a++) {
			Member mem = new Member();
			  mem.setMid("mldnjava-" + a);
			  mem.setName("海陆-"+a);
			  mem.setAge(15+a);
			  mem.setDeptno(10L+a);
			  mem.setSalary(16.58+a);
			  mem.setBirthday(new Date());
			  allMember.add(mem);
		}
		model.addAttribute("allMember", allMember);
		return "back/admin/member/member_list";
	}
	
	@RequestMapping("/member_map")
	public String map(Model model) {
		Map<String, Member> map = new HashMap<String,Member>();
		for(int a=0;a<5;a++) {
			Member mem = new Member();
			  mem.setMid("mldnjava-" + a);
			  mem.setName("海陆-"+a);
			  mem.setAge(15+a);
			  mem.setDeptno(10L+a);
			  mem.setSalary(16.58+a);
			  mem.setBirthday(new Date());
			  map.put("mem-"+a, mem);
		}
		model.addAttribute("allMember", map);
		return "back/admin/member/member_map";
	}
	
	
}
