package com.cg.renderer;

import com.cg.provider.MessageProvider;

public class ConsoleMessageRenderer implements MessageRenderer{

	private MessageProvider provider;
	@Override
	public void render() {
		// TODO Auto-generated method stub
		System.out.println(provider.getMessage());
	}

	@Override
	public void setMessageProvider(MessageProvider provider) {
		// TODO Auto-generated method stub
		this.provider=provider;
	}
	
	

}
