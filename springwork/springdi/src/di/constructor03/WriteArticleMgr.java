package di.constructor03;

public class WriteArticleMgr implements IWriteArticleMgr{
	IArticleDAO articleDAO;
	WriteArticleMgr(IArticleDAO articleDAO) {
		this.articleDAO = articleDAO;
	}
	public void write(ArticleDTO article) {
		articleDAO.insert(article);
	}
}
