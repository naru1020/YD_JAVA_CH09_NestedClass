package com.yedam.ch02_02;

public class Button {
	
	//필드
	OnClickListener listener;
	
	//필드 값을 받아올 세터
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
	
	//중첩 인터페이스 선언
	static interface OnClickListener{
		void onClick();
	}
	
}
