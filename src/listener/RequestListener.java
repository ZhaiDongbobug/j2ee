package listener;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class RequestListener implements ServletRequestListener,
ServletRequestAttributeListener {

	@Override
	public void attributeAdded(ServletRequestAttributeEvent srae) {
		System.out.println("request 增加属性 ");
		System.out.println("属性是" + srae.getName());
		System.out.println("值是" + srae.getValue());
		
	}

	@Override
	public void attributeRemoved(ServletRequestAttributeEvent srae) {
		System.out.println("request 移除属性");
		
	}

	@Override
	public void attributeReplaced(ServletRequestAttributeEvent srae) {
		System.out.println("request 替换属性");	
	}

	@Override
	public void requestDestroyed(ServletRequestEvent sre) {
		System.out.println("销毁了一个Request ");
		
	}

	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		System.out.println("创建了一个 Request ");
		
	}

}
