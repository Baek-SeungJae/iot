package di.constructor03;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("/config/bean.xml");
		IWriteArticleMgr write = factory.getBean("writearticlemgr",IWriteArticleMgr.class);
		ArticleDTO dto = new ArticleDTO();
		write.write(dto);
	}

}
