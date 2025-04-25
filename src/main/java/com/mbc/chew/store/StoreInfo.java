package com.mbc.chew.store;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class StoreInfo {

	@RequestMapping("/detail")
	public String storeDetail(@RequestParam("storecode") int storecode, Model model) {
	    // storeService�� �̿��� DB���� storecode�� �ش��ϴ� ���� ���� ��ȸ
	    StoreDTO storeInfo = StoreService.getstoreInfo(storecode); // �� �޼ҵ�� ���� ���� �ʿ�

	    if (storeInfo != null) {
	        model.addAttribute("storeInfo", storeInfo); // �𵨿� ���� ���� �߰�
	    } else {
	        // ���� ������ ���� ��� ó�� (��: ���� ������ �̵�)
	        return "errorPage";
	    }
	    return "storedetail"; // storeDetail.jsp �� ���� View �̸� ��ȯ
	}
}