package info.querydsl;

import java.util.List;

public interface UserRepositoryCustom {
	List findAllLike(String keyword);
}
