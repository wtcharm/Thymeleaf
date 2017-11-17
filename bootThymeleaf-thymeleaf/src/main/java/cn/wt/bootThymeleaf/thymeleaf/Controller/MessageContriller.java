package cn.wt.bootThymeleaf.thymeleaf.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MessageContriller {
	@RequestMapping("/message")
	public String message(Model model,HttpServletRequest request) {
		model.addAttribute("title", "为这个文档起个标题");
		request.setAttribute("msg","测试 HttpServletReques 和 model 的区别");
		return "message/message_model";
	}
	
}
