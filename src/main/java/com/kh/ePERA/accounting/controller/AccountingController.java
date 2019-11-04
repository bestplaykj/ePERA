package com.kh.ePERA.accounting.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.kh.ePERA.accounting.expenses.service.ExpensesService;
import com.kh.ePERA.accounting.expenses.vo.Expenses;
import com.kh.ePERA.accounting.finance.service.FinanceService;
import com.kh.ePERA.accounting.finance.vo.Finance;
import com.kh.ePERA.accounting.revenue.service.RevenueService;
import com.kh.ePERA.accounting.revenue.vo.Revenue;

@Controller
public class AccountingController {
	
	@Autowired
	private ExpensesService exps;
	
	@Autowired
	private RevenueService revs;
	
	@Autowired
	private FinanceService fins;
	
	
	// --------------------------------------- Expense ---------------------------------------
	@RequestMapping("getAllExpenses.do")
	public ModelAndView getAllExpenses(ModelAndView mv) {
		
		ArrayList<Expenses> ar = exps.getAllExpenses();
		double sum = 0;
		if(ar.size() > 0) {
			for(int i=0; i<ar.size(); i++) {
				sum += ar.get(i).getAmount();
			}			
		}else {
			sum = 0;
		}
		
		mv.addObject("list", ar).addObject("total", sum).setViewName("accounting/expenses/main");
		
		return mv;
		
	}//getAllExpenses
	
	
	@RequestMapping("getAllExpensesByyMonth.do")
	public ModelAndView getAllExpensesByyMonth(String yMonth, ModelAndView mv) {
		
		ArrayList<Expenses> ar = exps.getAllExpensesByyMonth(yMonth);
		
		double sum = 0;
		if(ar.size() > 0) {
			for(int i=0; i<ar.size(); i++) {
				sum += ar.get(i).getAmount();
			}			
		}else {
			sum = 0;
		}
		
		mv.addObject("list", ar).addObject("total", sum).setViewName("accounting/expenses/main");
		
		return mv;
		
	}//getAllExpensesByyMonth
	
	
	@RequestMapping("createExp.do")
	public String createExp(Expenses ex) {
		
		Date date = ex.getiDate();
		
		SimpleDateFormat year = new SimpleDateFormat("yyyy");
		ex.setYear(Integer.parseInt(year.format(date)));
		
		SimpleDateFormat sdfMonth = new SimpleDateFormat("MM");
		switch (sdfMonth.format(date)) {
		case "01": ex.setQuarter(1); ex.setMonth(1); break;
		case "02": ex.setQuarter(1); ex.setMonth(2); break;
		case "03": ex.setQuarter(1); ex.setMonth(3); break;
		case "04": ex.setQuarter(2); ex.setMonth(4); break;
		case "05": ex.setQuarter(2); ex.setMonth(5); break;
		case "06": ex.setQuarter(2); ex.setMonth(6); break;
		case "07": ex.setQuarter(3); ex.setMonth(7); break;
		case "08": ex.setQuarter(3); ex.setMonth(8); break;
		case "09": ex.setQuarter(3); ex.setMonth(9); break;
		case "10": ex.setQuarter(4); ex.setMonth(10); break;
		case "11": ex.setQuarter(4); ex.setMonth(11); break;
		case "12": ex.setQuarter(4); ex.setMonth(12); break;
		default:
			break;
		}
		
		int result = exps.createExpenses(ex);
		if(result > 0) {
			return "redirect:getAllExpenses.do";
		}else {
			return "common/error";
		}
		
	}//createExp
	
	
	@RequestMapping("deleteExp.do")
	public String deleteExp(int no) {
		
		int result = exps.deleteExpenses(no);
		if(result > 0) {
			return "redirect:getAllExpenses.do";
		}else {
			return "common/error";
		}
		
	}//deleteExp
	
	
	@ResponseBody
	@RequestMapping("getyMonth.do")
	public void getyMonth(HttpServletResponse response) throws JsonIOException, IOException {
		
		ArrayList<String> ar = exps.getyMonth();
		
		response.setContentType("application/json; charset=utf-8");
		
		Gson gs = new Gson();
		gs.toJson(ar, response.getWriter());
		
	}//getyMonth
	
	
	// --------------------------------------- /Expense ---------------------------------------
	
	
	// --------------------------------------- Revenue ---------------------------------------
	
	@RequestMapping("getAllIncome.do")
	public ModelAndView getAllIncome(ModelAndView mv) {
		
		ArrayList<Revenue> ar = revs.getAllRevenue();
		
		double sum = 0;
		if(ar.size() > 0) {
			for(int i=0; i<ar.size(); i++) {
				sum += ar.get(i).getIncome();
			}			
		}else {
			sum = 0;
		}
		
		mv.addObject("list", ar).addObject("total", sum).setViewName("accounting/revenue/main");
		
		return mv;
		
	}//getAllIncome
	
		
	@RequestMapping("createRev.do")
	public String inserRevenue(Revenue r) {
		
		Date date = r.getiDate();
		
		SimpleDateFormat year = new SimpleDateFormat("yyyy");
		r.setYear(Integer.parseInt(year.format(date)));
		
		SimpleDateFormat month = new SimpleDateFormat("MM");
		switch (month.format(date)) {
		case "01": r.setQuarter(1); r.setMonth(1); break;
		case "02": r.setQuarter(1); r.setMonth(2); break;
		case "03": r.setQuarter(1); r.setMonth(3); break;
		case "04": r.setQuarter(2); r.setMonth(4); break;
		case "05": r.setQuarter(2); r.setMonth(5); break;
		case "06": r.setQuarter(2); r.setMonth(6); break;
		case "07": r.setQuarter(3); r.setMonth(7); break;
		case "08": r.setQuarter(3); r.setMonth(8); break;
		case "09": r.setQuarter(3); r.setMonth(9); break;
		case "10": r.setQuarter(4); r.setMonth(10); break;
		case "11": r.setQuarter(4); r.setMonth(11); break;
		case "12": r.setQuarter(4); r.setMonth(12); break;
		default:
			break;
		}		
		
		int result = revs.insertRevenue(r);
		if(result > 0) {
			return "redirect:getAllIncome.do";
		}else {
			return "common/error";
		}
		
	}//inserRevenue
	
	
	@RequestMapping("deleteRev.do")
	public String deleteRev(int no) {
		
		int result = revs.deleteRevenue(no);
		if(result > 0) {
			return "redirect:getAllIncome.do";
		}else {
			return "common/error";
		}
		
	}//deleteRev
	
	
	@ResponseBody
	@RequestMapping("getRevyMonth.do")
	public void getRevyMonth(HttpServletResponse response) throws JsonIOException, IOException {
		
		ArrayList<String> ar = revs.getyMonth();
		
		response.setContentType("application/json; charset=utf-8");
		
		Gson gs = new Gson();
		gs.toJson(ar, response.getWriter());
		
	}//getRevyMonth
	
	
	@RequestMapping("getAllRevenueByyMonth.do")
	public ModelAndView getAllRevenueByyMonth(String yMonth, ModelAndView mv) {
		
		ArrayList<Revenue> ar = revs.getAllRevenueByyMonth(yMonth);
		
		double sum = 0;
		if(ar.size() > 0) {
			for(int i=0; i<ar.size(); i++) {
				sum += ar.get(i).getIncome();
			}			
		}else {
			sum = 0;
		}
		
		mv.addObject("list", ar).addObject("total", sum).setViewName("accounting/revenue/main");
		
		return mv;
		
	}//getAllRevenueByyMonth
	
	
	// --------------------------------------- /Revenue ---------------------------------------
	
	
	// --------------------------------------- Finance ---------------------------------------
	
	@RequestMapping("getFinacailReport.do")
	public ModelAndView getFinancialReport(ModelAndView mv) {
		
		//현재월
		Finance fi = new Finance();
		double revenueFi = 0;
		double expensesFi = 0;
		ArrayList<Revenue> rar = fins.getAllRevenueByyMonth();
		ArrayList<Expenses> ear = fins.getAllExpensesByyMonth();
		for(int i=0; i<rar.size(); i++) {
			revenueFi += rar.get(i).getIncome();
		}
		for(int i=0; i<ear.size(); i++) {
			expensesFi += ear.get(i).getAmount();
		}
		fi.setRevenue(revenueFi); fi.setExpenses(expensesFi); fi.setNetIncome(revenueFi-expensesFi);
		
		
		//-1개월
		Finance fiB1 = new Finance();
		double revenueFiB1 = 0;
		double expensesFiB1 = 0;
		ArrayList<Revenue> rarB1 = fins.getAllRevenueByyMonthB1();
		ArrayList<Expenses> earB1 = fins.getAllExpensesByyMonthB1();
		for(int i=0; i<rarB1.size(); i++) {
			revenueFiB1 += rarB1.get(i).getIncome();
		}
		for(int i=0; i<earB1.size(); i++) {
			expensesFiB1 += earB1.get(i).getAmount();
		}
		fiB1.setRevenue(revenueFiB1); fiB1.setExpenses(expensesFiB1); fiB1.setNetIncome(revenueFiB1-expensesFiB1);
		
		//-2개월
		Finance fiB2 = new Finance();
		double revenueFiB2 = 0;
		double expensesFiB2 = 0;
		ArrayList<Revenue> rarB2 = fins.getAllRevenueByyMonthB2();
		ArrayList<Expenses> earB2 = fins.getAllExpensesByyMonthB2();
		for(int i=0; i<rarB2.size(); i++) {
			revenueFiB2 += rarB2.get(i).getIncome();
		}
		for(int i=0; i<earB2.size(); i++) {
			expensesFiB2 += earB2.get(i).getAmount();
		}
		fiB2.setRevenue(revenueFiB2); fiB2.setExpenses(expensesFiB2); fiB2.setNetIncome(revenueFiB2-expensesFiB2);
		
		fi.setyMonth(rar.get(0).getYear()+"-"+rar.get(0).getMonth());
		fiB1.setyMonth(rar.get(0).getYear()+"-"+(rar.get(0).getMonth()-1));
		fiB2.setyMonth(rar.get(0).getYear()+"-"+(rar.get(0).getMonth()-2));
		
		mv.addObject("d", fi).addObject("d1", fiB1).addObject("d2", fiB2).setViewName("accounting/financialReport/main");
		
		return mv;
		
	}//getFinancialReport
	
	
	// --------------------------------------- /Finance ---------------------------------------

}//class
