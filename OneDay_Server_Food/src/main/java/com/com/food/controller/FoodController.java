package com.com.food.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.com.food.model.FoodDTO;
import com.com.food.model.FoodVO;
import com.com.food.service.FoodService;
import com.com.food.service.impl.FoodServiceImplV1;

@WebServlet("/food/*")
public class FoodController extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7451095335401226888L;
	private FoodService fService;
	public FoodController() {
		fService = new FoodServiceImplV1();
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String subPath = req.getPathInfo();
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		if(subPath.equals("/input")) {
			String fo_seq = req.getParameter("fo_seq");
			String fo_date = req.getParameter("fo_date");
			String fo_fcode = req.getParameter("fo_fcode");
			String fo_eat = req.getParameter("fo_eat");
			
			FoodVO foodVO = new FoodVO();
			foodVO.setFo_seq(fo_seq);
			foodVO.setFo_date(fo_date);
			foodVO.setFo_fcode(fo_fcode);
			foodVO.setFo_eat(Integer.valueOf(fo_eat));
			
			fService.insert(foodVO);
			
			out.println("받은 데이터 확인");
			out.printf("일련번호 : %s" , fo_seq);
			out.printf("날짜 : %s", fo_date);
			out.printf("식품코드 : %s", fo_fcode);
			out.printf("섭취량 : %s", fo_eat);
			
			out.close();
		}else if(subPath.equals("/fcode")) {
			String fo_fcode = req.getParameter("fo_fcode");
			FoodDTO foodDTO = fService.findByFood(fo_fcode);
			ServletContext app = this.getServletContext();
			app.setAttribute("FOOD", foodDTO);
			
			RequestDispatcher disp = app.getRequestDispatcher("/WEB-INF/views/food.jsp");
			disp.forward(req, resp);
		}else if(subPath.equals("/list")) {
			fService.selectAll();
			out.println("식품 전체목록 보기");
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
}
