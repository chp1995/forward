/**
 * @author chp
 *
 */
package Forward;

import java.util.List;

class Forward implements ForwardWeiboService{

	@Override
	public int getForwardNumber(String weiboId) {
		int number = 0;
		// TODO �Զ����ɵķ������
		return number;
	}

	@Override
	public List<User> getForwardUserIdList(String weiboId, int pageIndex,
			int numberPerPage) {
		List<User> user = null;
		// TODO �Զ����ɵķ������
		return user;
	}

	@Override
	public boolean forwardWeiboAction(String userId, String weiboId) {
		// TODO �Զ����ɵķ������
		return false;
	}
	
}
