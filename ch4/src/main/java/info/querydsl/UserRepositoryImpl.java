package info.querydsl;

import com.querydsl.jpa.impl.JPAQuery;

import org.springframework.data.jpa.repository.support.QueryDslRepositorySupport;

import java.util.List;

import javax.persistence.EntityManager;

import info.model.QUserEntity;
import info.model.UserEntity;

public class UserRepositoryImpl extends QueryDslRepositorySupport implements UserRepositoryCustom {
	public UserRepositoryImpl() {
		super(UserEntity.class);
	}
	
	public void setEntityManager(EntityManager entityManager) {
		super.setEntityManager(entityManager);
	}
	
	@Override
	public List findAllLike(String keyword) {
		QUserEntity qUserEntity = QUserEntity.userEntity;
		JPAQuery<UserEntity> query = (JPAQuery<UserEntity>) from(qUserEntity);
		List<UserEntity> resultlist = query.where(qUserEntity.userName.like(keyword)).fetch();
		return resultlist;
	}
}
