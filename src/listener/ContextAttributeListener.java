package listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

public class ContextAttributeListener implements ServletContextAttributeListener{

	@Override
	public void attributeAdded(ServletContextAttributeEvent scae) {
		System.out.println("增加属性 ");
		System.out.println("属性是" + scae.getName());
		System.out.println("值是" + scae.getValue());
		
	}

	@Override
	public void attributeRemoved(ServletContextAttributeEvent scae) {
		System.out.println("移除属性");
		
	}

	@Override
	public void attributeReplaced(ServletContextAttributeEvent scae) {
		System.out.println("替换属性");
		
	}

}
